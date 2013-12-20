package sportifs;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.mycorp.web.performance.DumpServlet;

public class TestDumpServlet {
	
	DumpServlet servlet = new DumpServlet();

	@Test
	public void testFilter() {	
		String message = "coucou > la < \"  promo & ";
		String filteredMessage = servlet.filter(message);
		assertEquals(filteredMessage, "coucou &gt; la &lt; &quot;  promo &amp; ");
	}
	
	@Test
	public void testFilter2() {	
		String message = null;
		String filteredMessage = servlet.filter(message);
		assertEquals(filteredMessage, null);
	}
		
}
