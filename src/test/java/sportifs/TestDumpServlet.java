package sportifs;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mycorp.web.performance.DumpServlet;

public class TestDumpServlet {
	
	DumpServlet servlet = new DumpServlet();

	@Test
	public void testFilter() {	
		String message = "coucou > la > promo";
		String filteredMessage = servlet.filter(message);
		assertEquals(filteredMessage, "coucou &gt; la &gt; promo");
	}
}
