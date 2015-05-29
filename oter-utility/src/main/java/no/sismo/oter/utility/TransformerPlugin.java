package no.sismo.oter.utility;

import java.util.HashMap;

import net.xeoh.plugins.base.Plugin;

public interface TransformerPlugin extends Plugin {

	public HashMap<String, String> transformData(
			HashMap<String, String> responceData);

}