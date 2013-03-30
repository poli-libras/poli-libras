package br.usp.libras.dic;

import java.util.ArrayList;
import java.util.List;

import br.usp.libras.sign.Inherence;
import br.usp.libras.sign.Literal;
import br.usp.libras.sign.Sign;
import br.usp.libras.sign.VerbType;
import br.usp.libras.sign.Word;
import br.usp.libras.sign.face.Chin;
import br.usp.libras.sign.face.Eyebrow;
import br.usp.libras.sign.face.Eyes;
import br.usp.libras.sign.face.Face;
import br.usp.libras.sign.face.Forehead;
import br.usp.libras.sign.face.Gaze;
import br.usp.libras.sign.face.Mounth;
import br.usp.libras.sign.face.Nose;
import br.usp.libras.sign.face.Others;
import br.usp.libras.sign.face.Teeth;
import br.usp.libras.sign.face.Tongue;
import br.usp.libras.sign.movement.Direction;
import br.usp.libras.sign.movement.Frequency;
import br.usp.libras.sign.movement.HandMovement;
import br.usp.libras.sign.movement.Magnitude;
import br.usp.libras.sign.movement.MovementType;
import br.usp.libras.sign.movement.Segment;
import br.usp.libras.sign.movement.Speed;
import br.usp.libras.sign.symbol.Contact;
import br.usp.libras.sign.symbol.FingersMovement;
import br.usp.libras.sign.symbol.Hand;
import br.usp.libras.sign.symbol.HandOrientation;
import br.usp.libras.sign.symbol.HandPlane;
import br.usp.libras.sign.symbol.HandRotation;
import br.usp.libras.sign.symbol.HandShape;
import br.usp.libras.sign.symbol.HandSide;
import br.usp.libras.sign.symbol.Location;
import br.usp.libras.sign.symbol.Symbol;

/**
 * Esta classe é rpa converter os sinais do pacote br.usp.wikilibras.ws.sign para br.usp.libras.sign
 * 
 * O primeiro pacote vem do jaxws que cria esta estrutura para criar as classes correspondentes
 * às classes do WikiLibras, no entanto ele não mantêm a estrutura de pacotes,
 * ao contrário... joga todas as classes em um pacote só
 * Por esse e outros motivos é que é melhor manter o pacote sign original do projeto Poli-Libras
 * Mas para isso é preciso fazer essa conversão
 * 
 * @author leonardo
 *
 */
public class ClassConverter {

    public static Sign convert(br.usp.wikilibras.ws.Sign wlsign) {
        
        if (wlsign == null)
            return null;

        Sign sign = new Sign();

        // sintaxe
        sign.setName(wlsign.getName());
        for (br.usp.wikilibras.ws.Word w : wlsign.getWords()) {
            Word word = new Word(w.getId(), w.getWord());
            sign.getWords().add(word);
        }
        for (br.usp.wikilibras.ws.Literal lit : wlsign.getLiterals()) {
            Literal literal = new Literal(lit.getId(), lit.getLiteral());
            sign.getLiterals().add(literal);
        }
        for (br.usp.wikilibras.ws.Inherence inh : wlsign.getInherences()) {
            Inherence inherence = new Inherence(inh.getId(), inh.getInherence());
            sign.getInherences().add(inherence);
        }
        sign.setVerbType(VerbType.valueOf(wlsign.getVerbType().toString()));

        // símbolos
        for (br.usp.wikilibras.ws.Symbol symb : wlsign.getSymbols()) {

            Symbol symbol = convert(symb);
            sign.getSymbols().add(symbol);
        }

        return sign;
    }

    public static Symbol convert(br.usp.wikilibras.ws.Symbol wlsymbol) {
        
        if (wlsymbol == null)
            return null;
        
        Symbol symbol = new Symbol();

        symbol.setId(wlsymbol.getId());
        Contact cont = Contact.valueOf(wlsymbol.getContact().toString());
        Location loc = Location.valueOf(wlsymbol.getLocation().toString());
        symbol.setContact(cont);
        symbol.setContactQuantity(wlsymbol.getContactQuantity());
        symbol.setLocation(loc);
        symbol.setSequence(wlsymbol.getSequence());
        symbol.setHandsInUnity(wlsymbol.isHandsInUnity());
        
        // mão dominante
        Hand rh = convert(wlsymbol.getRightHand());
        symbol.setRightHand(rh);
        // mão não-dominante
        Hand lh = convert(wlsymbol.getLeftHand());        
        symbol.setLeftHand(lh);
        // expressão facial
        Face face = convert(wlsymbol.getFace());
        symbol.setFace(face);
        
        return symbol;
    }

    public static Hand convert(br.usp.wikilibras.ws.Hand wlhand) {

        if (wlhand == null)
            return null;

        Hand hand = new Hand();

        // TODO: if's pra todos os enums
        FingersMovement fing = null;
        if (wlhand.getFingers() != null)
            fing = FingersMovement.valueOf(wlhand.getFingers().toString());
        HandOrientation ori = HandOrientation.valueOf(wlhand.getOrientation().toString());
        HandRotation rot = HandRotation.valueOf(wlhand.getRotation().toString());
        HandPlane plane = HandPlane.valueOf(wlhand.getPlane().toString());
        HandShape shape = HandShape.valueOf(wlhand.getShape().toString());
        HandSide side = HandSide.valueOf(wlhand.getSide().toString());

        hand.setFingers(fing);
        hand.setOrientation(ori);
        hand.setRotation(rot);
        hand.setPlane(plane);
        hand.setShape(shape);
        hand.setSide(side);
        
        // movimento da mão
        HandMovement mov = convert(wlhand.getMovement());
        hand.setMovement(mov);

        return hand;
    }

    public static HandMovement convert(br.usp.wikilibras.ws.HandMovement wlhmov) {

        if (wlhmov == null)
            return null;

        HandMovement mov = new HandMovement();

        Frequency frequency = Frequency.valueOf(wlhmov.getFrequency().toString());
        Speed speed = Speed.valueOf(wlhmov.getSpeed().toString());
        MovementType type = MovementType.valueOf(wlhmov.getType().toString());

        mov.setFrequency(frequency);
        mov.setSpeed(speed);
        mov.setType(type);
        mov.setStartsInLocation(wlhmov.isStartsInLocation());
        
        List<Segment> segs = convertSegments( wlhmov.getSegments().toArray((br.usp.wikilibras.ws.Segment[]) new br.usp.wikilibras.ws.Segment[1]));
        mov.setSegments(segs);
        
        return mov;
    }

    public static List<Segment> convertSegments(br.usp.wikilibras.ws.Segment[] segments) {
        
        List<Segment> segs = new ArrayList<Segment>();
        for (br.usp.wikilibras.ws.Segment seg: segments) {
            
            Segment s = new Segment();
            s.setDirection(Direction.valueOf(seg.getDirection().toString()));
            s.setMagnitude(Magnitude.valueOf(seg.getMagnitude().toString()));
            s.setSequence(seg.getSequence());
            segs.add(s);
        }
        
        return segs;
    }
    
    public static Face convert(br.usp.wikilibras.ws.Face wlface) {

        if (wlface == null)
            return null;

        Face face = new Face();
        
        Chin chin = Chin.valueOf(wlface.getChin().toString());
        Eyebrow eyebrow = Eyebrow.valueOf(wlface.getEyebrow().toString());
        Eyes eyes = Eyes.valueOf(wlface.getEyes().toString());
        Forehead forehead = Forehead.valueOf(wlface.getForehead().toString());
        Gaze gaze = Gaze.valueOf(wlface.getGaze().toString());
        Mounth mounth = Mounth.valueOf(wlface.getMounth().toString());
        Nose nose = Nose.valueOf(wlface.getNose().toString());
        Others others = Others.valueOf(wlface.getOthers().toString());
        Teeth teeth = Teeth.valueOf(wlface.getTeeth().toString());
        Tongue tongue = Tongue.valueOf(wlface.getTongue().toString());
        
        face.setChin(chin);
        face.setEyebrow(eyebrow);
        face.setEyes(eyes);
        face.setForehead(forehead);
        face.setGaze(gaze);
        face.setMounth(mounth);
        face.setNose(nose);
        face.setOthers(others);
        face.setTeeth(teeth);
        face.setTongue(tongue);
        
        return face;
    }

    public static List<Sign> convert(List<br.usp.wikilibras.ws.Sign> wlsigns) {

        List<Sign> signs = new ArrayList<Sign>();
        for (br.usp.wikilibras.ws.Sign s : wlsigns) {
            Sign sign = convert(s);
            signs.add(sign);
        }
        return signs;
    }

}
