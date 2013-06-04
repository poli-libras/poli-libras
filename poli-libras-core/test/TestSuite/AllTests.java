package TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.usp.libras.contextualiser.ContextualiserTest;
import br.usp.libras.syntax.LinkingVerbFinderTest;
import br.usp.libras.syntax.ObjectFinderTest;
import br.usp.libras.syntax.SubjectFinderTest;
import br.usp.libras.syntax.SynTransfPortLibrasTest;
import br.usp.libras.syntax.TokenConverterTest;
import br.usp.libras.syntax.VerbFinderTest;
import br.usp.libras.syntax.transforms.AdverbIncorporationTransformTest;
import br.usp.libras.syntax.transforms.AdverbTaggerTransformTest;
import br.usp.libras.syntax.transforms.OrderChangerTest;
import br.usp.libras.syntax.transforms.PruneTransformTest;
import br.usp.libras.syntax.transforms.SecondPersonTransformTest;
import br.usp.libras.translator.TranslatorTest;


@RunWith(Suite.class)
@SuiteClasses({ LinkingVerbFinderTest.class, ObjectFinderTest.class,
		SubjectFinderTest.class, SynTransfPortLibrasTest.class,
		TokenConverterTest.class, VerbFinderTest.class, ContextualiserTest.class,
		AdverbIncorporationTransformTest.class,
		AdverbTaggerTransformTest.class, OrderChangerTest.class,
		PruneTransformTest.class, SecondPersonTransformTest.class, TranslatorTest.class })
public class AllTests {

}
