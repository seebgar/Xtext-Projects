/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.ceffective.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CeffectiveAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/ceffective/parser/antlr/internal/InternalCeffective.tokens");
	}
}
