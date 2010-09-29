package com.aptana.editor.markdown;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;

import com.aptana.editor.common.text.rules.SingleCharacterRule;

class MarkdownHeadingScanner extends RuleBasedScanner
{
	MarkdownHeadingScanner()
	{
		IRule[] rules = new IRule[] {
				new SingleCharacterRule('#', getToken("punctuation.definition.heading.markdown")), //$NON-NLS-1$
				new SingleCharacterRule('=', getToken("punctuation.definition.heading.markdown")), //$NON-NLS-1$
				new SingleCharacterRule('-', getToken("punctuation.definition.heading.markdown")) //$NON-NLS-1$
		};
		setRules(rules);
		setDefaultReturnToken(getToken("entity.name.section.markdown")); //$NON-NLS-1$
	}

	protected IToken getToken(String tokenName)
	{
		return new Token(tokenName);
	}

}
