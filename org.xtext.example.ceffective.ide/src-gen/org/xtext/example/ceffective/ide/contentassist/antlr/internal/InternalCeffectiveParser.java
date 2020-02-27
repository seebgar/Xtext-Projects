package org.xtext.example.ceffective.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.ceffective.services.CeffectiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCeffectiveParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IST'", "'QA'", "'NFT'", "'PRD'", "'Micro'", "'Small'", "'Medium'", "'Large'", "'Relacional'", "'NoSql'", "'Ceffective'", "'{'", "'}'", "'proveedorNube'", "'ProveedorNube'", "'autenticacionUsuario'", "'nombre'", "'vpc'", "','", "'ambientedespliegue'", "'mecanismoseguridad'", "'AutenticacionUsuario'", "'usuario'", "'correo'", "'AmbienteDespliegue'", "'ambiente'", "'recursos'", "'('", "')'", "'AutenticacionBasica'", "'password'", "'AutenticacionFirma'", "'certificado'", "'ServidorAplicaciones'", "'zonaDisponibilidad'", "'zonaNombre'", "'tamano'", "'sistemaOperativo'", "'Almacenamiento'", "'tamanoInicial'", "'ServidorBD'", "'tipo'", "'sistemaManejador'", "'Servidor'", "'-'", "'Subred'", "'cidrBlock'", "'InternetGateway'", "'GrupoSeguridad'", "'reglasSalida'", "'reglasEntrada'", "'descripcion'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCeffectiveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCeffectiveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCeffectiveParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCeffective.g"; }


    	private CeffectiveGrammarAccess grammarAccess;

    	public void setGrammarAccess(CeffectiveGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCeffective"
    // InternalCeffective.g:53:1: entryRuleCeffective : ruleCeffective EOF ;
    public final void entryRuleCeffective() throws RecognitionException {
        try {
            // InternalCeffective.g:54:1: ( ruleCeffective EOF )
            // InternalCeffective.g:55:1: ruleCeffective EOF
            {
             before(grammarAccess.getCeffectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleCeffective();

            state._fsp--;

             after(grammarAccess.getCeffectiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCeffective"


    // $ANTLR start "ruleCeffective"
    // InternalCeffective.g:62:1: ruleCeffective : ( ( rule__Ceffective__Group__0 ) ) ;
    public final void ruleCeffective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:66:2: ( ( ( rule__Ceffective__Group__0 ) ) )
            // InternalCeffective.g:67:2: ( ( rule__Ceffective__Group__0 ) )
            {
            // InternalCeffective.g:67:2: ( ( rule__Ceffective__Group__0 ) )
            // InternalCeffective.g:68:3: ( rule__Ceffective__Group__0 )
            {
             before(grammarAccess.getCeffectiveAccess().getGroup()); 
            // InternalCeffective.g:69:3: ( rule__Ceffective__Group__0 )
            // InternalCeffective.g:69:4: rule__Ceffective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCeffectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCeffective"


    // $ANTLR start "entryRuleAutenticacionUsuario"
    // InternalCeffective.g:78:1: entryRuleAutenticacionUsuario : ruleAutenticacionUsuario EOF ;
    public final void entryRuleAutenticacionUsuario() throws RecognitionException {
        try {
            // InternalCeffective.g:79:1: ( ruleAutenticacionUsuario EOF )
            // InternalCeffective.g:80:1: ruleAutenticacionUsuario EOF
            {
             before(grammarAccess.getAutenticacionUsuarioRule()); 
            pushFollow(FOLLOW_1);
            ruleAutenticacionUsuario();

            state._fsp--;

             after(grammarAccess.getAutenticacionUsuarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutenticacionUsuario"


    // $ANTLR start "ruleAutenticacionUsuario"
    // InternalCeffective.g:87:1: ruleAutenticacionUsuario : ( ( rule__AutenticacionUsuario__Alternatives ) ) ;
    public final void ruleAutenticacionUsuario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:91:2: ( ( ( rule__AutenticacionUsuario__Alternatives ) ) )
            // InternalCeffective.g:92:2: ( ( rule__AutenticacionUsuario__Alternatives ) )
            {
            // InternalCeffective.g:92:2: ( ( rule__AutenticacionUsuario__Alternatives ) )
            // InternalCeffective.g:93:3: ( rule__AutenticacionUsuario__Alternatives )
            {
             before(grammarAccess.getAutenticacionUsuarioAccess().getAlternatives()); 
            // InternalCeffective.g:94:3: ( rule__AutenticacionUsuario__Alternatives )
            // InternalCeffective.g:94:4: rule__AutenticacionUsuario__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionUsuarioAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutenticacionUsuario"


    // $ANTLR start "entryRuleMecanismoSeguridad"
    // InternalCeffective.g:103:1: entryRuleMecanismoSeguridad : ruleMecanismoSeguridad EOF ;
    public final void entryRuleMecanismoSeguridad() throws RecognitionException {
        try {
            // InternalCeffective.g:104:1: ( ruleMecanismoSeguridad EOF )
            // InternalCeffective.g:105:1: ruleMecanismoSeguridad EOF
            {
             before(grammarAccess.getMecanismoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            ruleMecanismoSeguridad();

            state._fsp--;

             after(grammarAccess.getMecanismoSeguridadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMecanismoSeguridad"


    // $ANTLR start "ruleMecanismoSeguridad"
    // InternalCeffective.g:112:1: ruleMecanismoSeguridad : ( ( rule__MecanismoSeguridad__Alternatives ) ) ;
    public final void ruleMecanismoSeguridad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:116:2: ( ( ( rule__MecanismoSeguridad__Alternatives ) ) )
            // InternalCeffective.g:117:2: ( ( rule__MecanismoSeguridad__Alternatives ) )
            {
            // InternalCeffective.g:117:2: ( ( rule__MecanismoSeguridad__Alternatives ) )
            // InternalCeffective.g:118:3: ( rule__MecanismoSeguridad__Alternatives )
            {
             before(grammarAccess.getMecanismoSeguridadAccess().getAlternatives()); 
            // InternalCeffective.g:119:3: ( rule__MecanismoSeguridad__Alternatives )
            // InternalCeffective.g:119:4: rule__MecanismoSeguridad__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MecanismoSeguridad__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMecanismoSeguridadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMecanismoSeguridad"


    // $ANTLR start "entryRuleProveedorNube"
    // InternalCeffective.g:128:1: entryRuleProveedorNube : ruleProveedorNube EOF ;
    public final void entryRuleProveedorNube() throws RecognitionException {
        try {
            // InternalCeffective.g:129:1: ( ruleProveedorNube EOF )
            // InternalCeffective.g:130:1: ruleProveedorNube EOF
            {
             before(grammarAccess.getProveedorNubeRule()); 
            pushFollow(FOLLOW_1);
            ruleProveedorNube();

            state._fsp--;

             after(grammarAccess.getProveedorNubeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProveedorNube"


    // $ANTLR start "ruleProveedorNube"
    // InternalCeffective.g:137:1: ruleProveedorNube : ( ( rule__ProveedorNube__Group__0 ) ) ;
    public final void ruleProveedorNube() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:141:2: ( ( ( rule__ProveedorNube__Group__0 ) ) )
            // InternalCeffective.g:142:2: ( ( rule__ProveedorNube__Group__0 ) )
            {
            // InternalCeffective.g:142:2: ( ( rule__ProveedorNube__Group__0 ) )
            // InternalCeffective.g:143:3: ( rule__ProveedorNube__Group__0 )
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup()); 
            // InternalCeffective.g:144:3: ( rule__ProveedorNube__Group__0 )
            // InternalCeffective.g:144:4: rule__ProveedorNube__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProveedorNube"


    // $ANTLR start "entryRuleEString"
    // InternalCeffective.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCeffective.g:154:1: ( ruleEString EOF )
            // InternalCeffective.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCeffective.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCeffective.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCeffective.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalCeffective.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCeffective.g:169:3: ( rule__EString__Alternatives )
            // InternalCeffective.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAutenticacionUsuario_Impl"
    // InternalCeffective.g:178:1: entryRuleAutenticacionUsuario_Impl : ruleAutenticacionUsuario_Impl EOF ;
    public final void entryRuleAutenticacionUsuario_Impl() throws RecognitionException {
        try {
            // InternalCeffective.g:179:1: ( ruleAutenticacionUsuario_Impl EOF )
            // InternalCeffective.g:180:1: ruleAutenticacionUsuario_Impl EOF
            {
             before(grammarAccess.getAutenticacionUsuario_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleAutenticacionUsuario_Impl();

            state._fsp--;

             after(grammarAccess.getAutenticacionUsuario_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutenticacionUsuario_Impl"


    // $ANTLR start "ruleAutenticacionUsuario_Impl"
    // InternalCeffective.g:187:1: ruleAutenticacionUsuario_Impl : ( ( rule__AutenticacionUsuario_Impl__Group__0 ) ) ;
    public final void ruleAutenticacionUsuario_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:191:2: ( ( ( rule__AutenticacionUsuario_Impl__Group__0 ) ) )
            // InternalCeffective.g:192:2: ( ( rule__AutenticacionUsuario_Impl__Group__0 ) )
            {
            // InternalCeffective.g:192:2: ( ( rule__AutenticacionUsuario_Impl__Group__0 ) )
            // InternalCeffective.g:193:3: ( rule__AutenticacionUsuario_Impl__Group__0 )
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup()); 
            // InternalCeffective.g:194:3: ( rule__AutenticacionUsuario_Impl__Group__0 )
            // InternalCeffective.g:194:4: rule__AutenticacionUsuario_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutenticacionUsuario_Impl"


    // $ANTLR start "entryRuleAmbienteDespliegue"
    // InternalCeffective.g:203:1: entryRuleAmbienteDespliegue : ruleAmbienteDespliegue EOF ;
    public final void entryRuleAmbienteDespliegue() throws RecognitionException {
        try {
            // InternalCeffective.g:204:1: ( ruleAmbienteDespliegue EOF )
            // InternalCeffective.g:205:1: ruleAmbienteDespliegue EOF
            {
             before(grammarAccess.getAmbienteDespliegueRule()); 
            pushFollow(FOLLOW_1);
            ruleAmbienteDespliegue();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAmbienteDespliegue"


    // $ANTLR start "ruleAmbienteDespliegue"
    // InternalCeffective.g:212:1: ruleAmbienteDespliegue : ( ( rule__AmbienteDespliegue__Group__0 ) ) ;
    public final void ruleAmbienteDespliegue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:216:2: ( ( ( rule__AmbienteDespliegue__Group__0 ) ) )
            // InternalCeffective.g:217:2: ( ( rule__AmbienteDespliegue__Group__0 ) )
            {
            // InternalCeffective.g:217:2: ( ( rule__AmbienteDespliegue__Group__0 ) )
            // InternalCeffective.g:218:3: ( rule__AmbienteDespliegue__Group__0 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup()); 
            // InternalCeffective.g:219:3: ( rule__AmbienteDespliegue__Group__0 )
            // InternalCeffective.g:219:4: rule__AmbienteDespliegue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmbienteDespliegue"


    // $ANTLR start "entryRuleAutenticacionBasica"
    // InternalCeffective.g:228:1: entryRuleAutenticacionBasica : ruleAutenticacionBasica EOF ;
    public final void entryRuleAutenticacionBasica() throws RecognitionException {
        try {
            // InternalCeffective.g:229:1: ( ruleAutenticacionBasica EOF )
            // InternalCeffective.g:230:1: ruleAutenticacionBasica EOF
            {
             before(grammarAccess.getAutenticacionBasicaRule()); 
            pushFollow(FOLLOW_1);
            ruleAutenticacionBasica();

            state._fsp--;

             after(grammarAccess.getAutenticacionBasicaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutenticacionBasica"


    // $ANTLR start "ruleAutenticacionBasica"
    // InternalCeffective.g:237:1: ruleAutenticacionBasica : ( ( rule__AutenticacionBasica__Group__0 ) ) ;
    public final void ruleAutenticacionBasica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:241:2: ( ( ( rule__AutenticacionBasica__Group__0 ) ) )
            // InternalCeffective.g:242:2: ( ( rule__AutenticacionBasica__Group__0 ) )
            {
            // InternalCeffective.g:242:2: ( ( rule__AutenticacionBasica__Group__0 ) )
            // InternalCeffective.g:243:3: ( rule__AutenticacionBasica__Group__0 )
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getGroup()); 
            // InternalCeffective.g:244:3: ( rule__AutenticacionBasica__Group__0 )
            // InternalCeffective.g:244:4: rule__AutenticacionBasica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionBasicaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutenticacionBasica"


    // $ANTLR start "entryRuleAutenticacionFirma"
    // InternalCeffective.g:253:1: entryRuleAutenticacionFirma : ruleAutenticacionFirma EOF ;
    public final void entryRuleAutenticacionFirma() throws RecognitionException {
        try {
            // InternalCeffective.g:254:1: ( ruleAutenticacionFirma EOF )
            // InternalCeffective.g:255:1: ruleAutenticacionFirma EOF
            {
             before(grammarAccess.getAutenticacionFirmaRule()); 
            pushFollow(FOLLOW_1);
            ruleAutenticacionFirma();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutenticacionFirma"


    // $ANTLR start "ruleAutenticacionFirma"
    // InternalCeffective.g:262:1: ruleAutenticacionFirma : ( ( rule__AutenticacionFirma__Group__0 ) ) ;
    public final void ruleAutenticacionFirma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:266:2: ( ( ( rule__AutenticacionFirma__Group__0 ) ) )
            // InternalCeffective.g:267:2: ( ( rule__AutenticacionFirma__Group__0 ) )
            {
            // InternalCeffective.g:267:2: ( ( rule__AutenticacionFirma__Group__0 ) )
            // InternalCeffective.g:268:3: ( rule__AutenticacionFirma__Group__0 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup()); 
            // InternalCeffective.g:269:3: ( rule__AutenticacionFirma__Group__0 )
            // InternalCeffective.g:269:4: rule__AutenticacionFirma__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutenticacionFirma"


    // $ANTLR start "entryRuleServidorAplicaciones"
    // InternalCeffective.g:278:1: entryRuleServidorAplicaciones : ruleServidorAplicaciones EOF ;
    public final void entryRuleServidorAplicaciones() throws RecognitionException {
        try {
            // InternalCeffective.g:279:1: ( ruleServidorAplicaciones EOF )
            // InternalCeffective.g:280:1: ruleServidorAplicaciones EOF
            {
             before(grammarAccess.getServidorAplicacionesRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorAplicaciones();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorAplicaciones"


    // $ANTLR start "ruleServidorAplicaciones"
    // InternalCeffective.g:287:1: ruleServidorAplicaciones : ( ( rule__ServidorAplicaciones__Group__0 ) ) ;
    public final void ruleServidorAplicaciones() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:291:2: ( ( ( rule__ServidorAplicaciones__Group__0 ) ) )
            // InternalCeffective.g:292:2: ( ( rule__ServidorAplicaciones__Group__0 ) )
            {
            // InternalCeffective.g:292:2: ( ( rule__ServidorAplicaciones__Group__0 ) )
            // InternalCeffective.g:293:3: ( rule__ServidorAplicaciones__Group__0 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup()); 
            // InternalCeffective.g:294:3: ( rule__ServidorAplicaciones__Group__0 )
            // InternalCeffective.g:294:4: rule__ServidorAplicaciones__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorAplicaciones"


    // $ANTLR start "entryRuleAlmacenamiento"
    // InternalCeffective.g:303:1: entryRuleAlmacenamiento : ruleAlmacenamiento EOF ;
    public final void entryRuleAlmacenamiento() throws RecognitionException {
        try {
            // InternalCeffective.g:304:1: ( ruleAlmacenamiento EOF )
            // InternalCeffective.g:305:1: ruleAlmacenamiento EOF
            {
             before(grammarAccess.getAlmacenamientoRule()); 
            pushFollow(FOLLOW_1);
            ruleAlmacenamiento();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlmacenamiento"


    // $ANTLR start "ruleAlmacenamiento"
    // InternalCeffective.g:312:1: ruleAlmacenamiento : ( ( rule__Almacenamiento__Group__0 ) ) ;
    public final void ruleAlmacenamiento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:316:2: ( ( ( rule__Almacenamiento__Group__0 ) ) )
            // InternalCeffective.g:317:2: ( ( rule__Almacenamiento__Group__0 ) )
            {
            // InternalCeffective.g:317:2: ( ( rule__Almacenamiento__Group__0 ) )
            // InternalCeffective.g:318:3: ( rule__Almacenamiento__Group__0 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup()); 
            // InternalCeffective.g:319:3: ( rule__Almacenamiento__Group__0 )
            // InternalCeffective.g:319:4: rule__Almacenamiento__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlmacenamiento"


    // $ANTLR start "entryRuleServidorBD"
    // InternalCeffective.g:328:1: entryRuleServidorBD : ruleServidorBD EOF ;
    public final void entryRuleServidorBD() throws RecognitionException {
        try {
            // InternalCeffective.g:329:1: ( ruleServidorBD EOF )
            // InternalCeffective.g:330:1: ruleServidorBD EOF
            {
             before(grammarAccess.getServidorBDRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorBD();

            state._fsp--;

             after(grammarAccess.getServidorBDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorBD"


    // $ANTLR start "ruleServidorBD"
    // InternalCeffective.g:337:1: ruleServidorBD : ( ( rule__ServidorBD__Group__0 ) ) ;
    public final void ruleServidorBD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:341:2: ( ( ( rule__ServidorBD__Group__0 ) ) )
            // InternalCeffective.g:342:2: ( ( rule__ServidorBD__Group__0 ) )
            {
            // InternalCeffective.g:342:2: ( ( rule__ServidorBD__Group__0 ) )
            // InternalCeffective.g:343:3: ( rule__ServidorBD__Group__0 )
            {
             before(grammarAccess.getServidorBDAccess().getGroup()); 
            // InternalCeffective.g:344:3: ( rule__ServidorBD__Group__0 )
            // InternalCeffective.g:344:4: rule__ServidorBD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorBD"


    // $ANTLR start "entryRuleServidor_Impl"
    // InternalCeffective.g:353:1: entryRuleServidor_Impl : ruleServidor_Impl EOF ;
    public final void entryRuleServidor_Impl() throws RecognitionException {
        try {
            // InternalCeffective.g:354:1: ( ruleServidor_Impl EOF )
            // InternalCeffective.g:355:1: ruleServidor_Impl EOF
            {
             before(grammarAccess.getServidor_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleServidor_Impl();

            state._fsp--;

             after(grammarAccess.getServidor_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidor_Impl"


    // $ANTLR start "ruleServidor_Impl"
    // InternalCeffective.g:362:1: ruleServidor_Impl : ( ( rule__Servidor_Impl__Group__0 ) ) ;
    public final void ruleServidor_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:366:2: ( ( ( rule__Servidor_Impl__Group__0 ) ) )
            // InternalCeffective.g:367:2: ( ( rule__Servidor_Impl__Group__0 ) )
            {
            // InternalCeffective.g:367:2: ( ( rule__Servidor_Impl__Group__0 ) )
            // InternalCeffective.g:368:3: ( rule__Servidor_Impl__Group__0 )
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup()); 
            // InternalCeffective.g:369:3: ( rule__Servidor_Impl__Group__0 )
            // InternalCeffective.g:369:4: rule__Servidor_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidor_Impl"


    // $ANTLR start "entryRuleEInt"
    // InternalCeffective.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCeffective.g:379:1: ( ruleEInt EOF )
            // InternalCeffective.g:380:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCeffective.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCeffective.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCeffective.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalCeffective.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCeffective.g:394:3: ( rule__EInt__Group__0 )
            // InternalCeffective.g:394:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSubred"
    // InternalCeffective.g:403:1: entryRuleSubred : ruleSubred EOF ;
    public final void entryRuleSubred() throws RecognitionException {
        try {
            // InternalCeffective.g:404:1: ( ruleSubred EOF )
            // InternalCeffective.g:405:1: ruleSubred EOF
            {
             before(grammarAccess.getSubredRule()); 
            pushFollow(FOLLOW_1);
            ruleSubred();

            state._fsp--;

             after(grammarAccess.getSubredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubred"


    // $ANTLR start "ruleSubred"
    // InternalCeffective.g:412:1: ruleSubred : ( ( rule__Subred__Group__0 ) ) ;
    public final void ruleSubred() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:416:2: ( ( ( rule__Subred__Group__0 ) ) )
            // InternalCeffective.g:417:2: ( ( rule__Subred__Group__0 ) )
            {
            // InternalCeffective.g:417:2: ( ( rule__Subred__Group__0 ) )
            // InternalCeffective.g:418:3: ( rule__Subred__Group__0 )
            {
             before(grammarAccess.getSubredAccess().getGroup()); 
            // InternalCeffective.g:419:3: ( rule__Subred__Group__0 )
            // InternalCeffective.g:419:4: rule__Subred__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubred"


    // $ANTLR start "entryRuleInternetGateway"
    // InternalCeffective.g:428:1: entryRuleInternetGateway : ruleInternetGateway EOF ;
    public final void entryRuleInternetGateway() throws RecognitionException {
        try {
            // InternalCeffective.g:429:1: ( ruleInternetGateway EOF )
            // InternalCeffective.g:430:1: ruleInternetGateway EOF
            {
             before(grammarAccess.getInternetGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleInternetGateway();

            state._fsp--;

             after(grammarAccess.getInternetGatewayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternetGateway"


    // $ANTLR start "ruleInternetGateway"
    // InternalCeffective.g:437:1: ruleInternetGateway : ( ( rule__InternetGateway__Group__0 ) ) ;
    public final void ruleInternetGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:441:2: ( ( ( rule__InternetGateway__Group__0 ) ) )
            // InternalCeffective.g:442:2: ( ( rule__InternetGateway__Group__0 ) )
            {
            // InternalCeffective.g:442:2: ( ( rule__InternetGateway__Group__0 ) )
            // InternalCeffective.g:443:3: ( rule__InternetGateway__Group__0 )
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup()); 
            // InternalCeffective.g:444:3: ( rule__InternetGateway__Group__0 )
            // InternalCeffective.g:444:4: rule__InternetGateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternetGateway"


    // $ANTLR start "entryRuleGrupoSeguridad"
    // InternalCeffective.g:453:1: entryRuleGrupoSeguridad : ruleGrupoSeguridad EOF ;
    public final void entryRuleGrupoSeguridad() throws RecognitionException {
        try {
            // InternalCeffective.g:454:1: ( ruleGrupoSeguridad EOF )
            // InternalCeffective.g:455:1: ruleGrupoSeguridad EOF
            {
             before(grammarAccess.getGrupoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            ruleGrupoSeguridad();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrupoSeguridad"


    // $ANTLR start "ruleGrupoSeguridad"
    // InternalCeffective.g:462:1: ruleGrupoSeguridad : ( ( rule__GrupoSeguridad__Group__0 ) ) ;
    public final void ruleGrupoSeguridad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:466:2: ( ( ( rule__GrupoSeguridad__Group__0 ) ) )
            // InternalCeffective.g:467:2: ( ( rule__GrupoSeguridad__Group__0 ) )
            {
            // InternalCeffective.g:467:2: ( ( rule__GrupoSeguridad__Group__0 ) )
            // InternalCeffective.g:468:3: ( rule__GrupoSeguridad__Group__0 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup()); 
            // InternalCeffective.g:469:3: ( rule__GrupoSeguridad__Group__0 )
            // InternalCeffective.g:469:4: rule__GrupoSeguridad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrupoSeguridad"


    // $ANTLR start "ruleTipoAmbiente"
    // InternalCeffective.g:478:1: ruleTipoAmbiente : ( ( rule__TipoAmbiente__Alternatives ) ) ;
    public final void ruleTipoAmbiente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:482:1: ( ( ( rule__TipoAmbiente__Alternatives ) ) )
            // InternalCeffective.g:483:2: ( ( rule__TipoAmbiente__Alternatives ) )
            {
            // InternalCeffective.g:483:2: ( ( rule__TipoAmbiente__Alternatives ) )
            // InternalCeffective.g:484:3: ( rule__TipoAmbiente__Alternatives )
            {
             before(grammarAccess.getTipoAmbienteAccess().getAlternatives()); 
            // InternalCeffective.g:485:3: ( rule__TipoAmbiente__Alternatives )
            // InternalCeffective.g:485:4: rule__TipoAmbiente__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoAmbiente__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAmbienteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoAmbiente"


    // $ANTLR start "ruleTamanoServidor"
    // InternalCeffective.g:494:1: ruleTamanoServidor : ( ( rule__TamanoServidor__Alternatives ) ) ;
    public final void ruleTamanoServidor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:498:1: ( ( ( rule__TamanoServidor__Alternatives ) ) )
            // InternalCeffective.g:499:2: ( ( rule__TamanoServidor__Alternatives ) )
            {
            // InternalCeffective.g:499:2: ( ( rule__TamanoServidor__Alternatives ) )
            // InternalCeffective.g:500:3: ( rule__TamanoServidor__Alternatives )
            {
             before(grammarAccess.getTamanoServidorAccess().getAlternatives()); 
            // InternalCeffective.g:501:3: ( rule__TamanoServidor__Alternatives )
            // InternalCeffective.g:501:4: rule__TamanoServidor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TamanoServidor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTamanoServidorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTamanoServidor"


    // $ANTLR start "ruleTipoBaseDatos"
    // InternalCeffective.g:510:1: ruleTipoBaseDatos : ( ( rule__TipoBaseDatos__Alternatives ) ) ;
    public final void ruleTipoBaseDatos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:514:1: ( ( ( rule__TipoBaseDatos__Alternatives ) ) )
            // InternalCeffective.g:515:2: ( ( rule__TipoBaseDatos__Alternatives ) )
            {
            // InternalCeffective.g:515:2: ( ( rule__TipoBaseDatos__Alternatives ) )
            // InternalCeffective.g:516:3: ( rule__TipoBaseDatos__Alternatives )
            {
             before(grammarAccess.getTipoBaseDatosAccess().getAlternatives()); 
            // InternalCeffective.g:517:3: ( rule__TipoBaseDatos__Alternatives )
            // InternalCeffective.g:517:4: rule__TipoBaseDatos__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoBaseDatos__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoBaseDatosAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoBaseDatos"


    // $ANTLR start "rule__AutenticacionUsuario__Alternatives"
    // InternalCeffective.g:525:1: rule__AutenticacionUsuario__Alternatives : ( ( ruleAutenticacionUsuario_Impl ) | ( ruleAutenticacionBasica ) | ( ruleAutenticacionFirma ) );
    public final void rule__AutenticacionUsuario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:529:1: ( ( ruleAutenticacionUsuario_Impl ) | ( ruleAutenticacionBasica ) | ( ruleAutenticacionFirma ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 42:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCeffective.g:530:2: ( ruleAutenticacionUsuario_Impl )
                    {
                    // InternalCeffective.g:530:2: ( ruleAutenticacionUsuario_Impl )
                    // InternalCeffective.g:531:3: ruleAutenticacionUsuario_Impl
                    {
                     before(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionUsuario_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAutenticacionUsuario_Impl();

                    state._fsp--;

                     after(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionUsuario_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:536:2: ( ruleAutenticacionBasica )
                    {
                    // InternalCeffective.g:536:2: ( ruleAutenticacionBasica )
                    // InternalCeffective.g:537:3: ruleAutenticacionBasica
                    {
                     before(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionBasicaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAutenticacionBasica();

                    state._fsp--;

                     after(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionBasicaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:542:2: ( ruleAutenticacionFirma )
                    {
                    // InternalCeffective.g:542:2: ( ruleAutenticacionFirma )
                    // InternalCeffective.g:543:3: ruleAutenticacionFirma
                    {
                     before(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionFirmaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAutenticacionFirma();

                    state._fsp--;

                     after(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionFirmaParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario__Alternatives"


    // $ANTLR start "rule__MecanismoSeguridad__Alternatives"
    // InternalCeffective.g:552:1: rule__MecanismoSeguridad__Alternatives : ( ( ruleSubred ) | ( ruleInternetGateway ) | ( ruleGrupoSeguridad ) );
    public final void rule__MecanismoSeguridad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:556:1: ( ( ruleSubred ) | ( ruleInternetGateway ) | ( ruleGrupoSeguridad ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt2=1;
                }
                break;
            case 58:
                {
                alt2=2;
                }
                break;
            case 59:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCeffective.g:557:2: ( ruleSubred )
                    {
                    // InternalCeffective.g:557:2: ( ruleSubred )
                    // InternalCeffective.g:558:3: ruleSubred
                    {
                     before(grammarAccess.getMecanismoSeguridadAccess().getSubredParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSubred();

                    state._fsp--;

                     after(grammarAccess.getMecanismoSeguridadAccess().getSubredParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:563:2: ( ruleInternetGateway )
                    {
                    // InternalCeffective.g:563:2: ( ruleInternetGateway )
                    // InternalCeffective.g:564:3: ruleInternetGateway
                    {
                     before(grammarAccess.getMecanismoSeguridadAccess().getInternetGatewayParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInternetGateway();

                    state._fsp--;

                     after(grammarAccess.getMecanismoSeguridadAccess().getInternetGatewayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:569:2: ( ruleGrupoSeguridad )
                    {
                    // InternalCeffective.g:569:2: ( ruleGrupoSeguridad )
                    // InternalCeffective.g:570:3: ruleGrupoSeguridad
                    {
                     before(grammarAccess.getMecanismoSeguridadAccess().getGrupoSeguridadParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGrupoSeguridad();

                    state._fsp--;

                     after(grammarAccess.getMecanismoSeguridadAccess().getGrupoSeguridadParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MecanismoSeguridad__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCeffective.g:579:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:583:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCeffective.g:584:2: ( RULE_STRING )
                    {
                    // InternalCeffective.g:584:2: ( RULE_STRING )
                    // InternalCeffective.g:585:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:590:2: ( RULE_ID )
                    {
                    // InternalCeffective.g:590:2: ( RULE_ID )
                    // InternalCeffective.g:591:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TipoAmbiente__Alternatives"
    // InternalCeffective.g:600:1: rule__TipoAmbiente__Alternatives : ( ( ( 'IST' ) ) | ( ( 'QA' ) ) | ( ( 'NFT' ) ) | ( ( 'PRD' ) ) );
    public final void rule__TipoAmbiente__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:604:1: ( ( ( 'IST' ) ) | ( ( 'QA' ) ) | ( ( 'NFT' ) ) | ( ( 'PRD' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCeffective.g:605:2: ( ( 'IST' ) )
                    {
                    // InternalCeffective.g:605:2: ( ( 'IST' ) )
                    // InternalCeffective.g:606:3: ( 'IST' )
                    {
                     before(grammarAccess.getTipoAmbienteAccess().getISTEnumLiteralDeclaration_0()); 
                    // InternalCeffective.g:607:3: ( 'IST' )
                    // InternalCeffective.g:607:4: 'IST'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAmbienteAccess().getISTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:611:2: ( ( 'QA' ) )
                    {
                    // InternalCeffective.g:611:2: ( ( 'QA' ) )
                    // InternalCeffective.g:612:3: ( 'QA' )
                    {
                     before(grammarAccess.getTipoAmbienteAccess().getQAEnumLiteralDeclaration_1()); 
                    // InternalCeffective.g:613:3: ( 'QA' )
                    // InternalCeffective.g:613:4: 'QA'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAmbienteAccess().getQAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:617:2: ( ( 'NFT' ) )
                    {
                    // InternalCeffective.g:617:2: ( ( 'NFT' ) )
                    // InternalCeffective.g:618:3: ( 'NFT' )
                    {
                     before(grammarAccess.getTipoAmbienteAccess().getNFTEnumLiteralDeclaration_2()); 
                    // InternalCeffective.g:619:3: ( 'NFT' )
                    // InternalCeffective.g:619:4: 'NFT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAmbienteAccess().getNFTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCeffective.g:623:2: ( ( 'PRD' ) )
                    {
                    // InternalCeffective.g:623:2: ( ( 'PRD' ) )
                    // InternalCeffective.g:624:3: ( 'PRD' )
                    {
                     before(grammarAccess.getTipoAmbienteAccess().getPRDEnumLiteralDeclaration_3()); 
                    // InternalCeffective.g:625:3: ( 'PRD' )
                    // InternalCeffective.g:625:4: 'PRD'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAmbienteAccess().getPRDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAmbiente__Alternatives"


    // $ANTLR start "rule__TamanoServidor__Alternatives"
    // InternalCeffective.g:633:1: rule__TamanoServidor__Alternatives : ( ( ( 'Micro' ) ) | ( ( 'Small' ) ) | ( ( 'Medium' ) ) | ( ( 'Large' ) ) );
    public final void rule__TamanoServidor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:637:1: ( ( ( 'Micro' ) ) | ( ( 'Small' ) ) | ( ( 'Medium' ) ) | ( ( 'Large' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 17:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCeffective.g:638:2: ( ( 'Micro' ) )
                    {
                    // InternalCeffective.g:638:2: ( ( 'Micro' ) )
                    // InternalCeffective.g:639:3: ( 'Micro' )
                    {
                     before(grammarAccess.getTamanoServidorAccess().getMicroEnumLiteralDeclaration_0()); 
                    // InternalCeffective.g:640:3: ( 'Micro' )
                    // InternalCeffective.g:640:4: 'Micro'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoServidorAccess().getMicroEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:644:2: ( ( 'Small' ) )
                    {
                    // InternalCeffective.g:644:2: ( ( 'Small' ) )
                    // InternalCeffective.g:645:3: ( 'Small' )
                    {
                     before(grammarAccess.getTamanoServidorAccess().getSmallEnumLiteralDeclaration_1()); 
                    // InternalCeffective.g:646:3: ( 'Small' )
                    // InternalCeffective.g:646:4: 'Small'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoServidorAccess().getSmallEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:650:2: ( ( 'Medium' ) )
                    {
                    // InternalCeffective.g:650:2: ( ( 'Medium' ) )
                    // InternalCeffective.g:651:3: ( 'Medium' )
                    {
                     before(grammarAccess.getTamanoServidorAccess().getMediumEnumLiteralDeclaration_2()); 
                    // InternalCeffective.g:652:3: ( 'Medium' )
                    // InternalCeffective.g:652:4: 'Medium'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoServidorAccess().getMediumEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCeffective.g:656:2: ( ( 'Large' ) )
                    {
                    // InternalCeffective.g:656:2: ( ( 'Large' ) )
                    // InternalCeffective.g:657:3: ( 'Large' )
                    {
                     before(grammarAccess.getTamanoServidorAccess().getLargeEnumLiteralDeclaration_3()); 
                    // InternalCeffective.g:658:3: ( 'Large' )
                    // InternalCeffective.g:658:4: 'Large'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoServidorAccess().getLargeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TamanoServidor__Alternatives"


    // $ANTLR start "rule__TipoBaseDatos__Alternatives"
    // InternalCeffective.g:666:1: rule__TipoBaseDatos__Alternatives : ( ( ( 'Relacional' ) ) | ( ( 'NoSql' ) ) );
    public final void rule__TipoBaseDatos__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:670:1: ( ( ( 'Relacional' ) ) | ( ( 'NoSql' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCeffective.g:671:2: ( ( 'Relacional' ) )
                    {
                    // InternalCeffective.g:671:2: ( ( 'Relacional' ) )
                    // InternalCeffective.g:672:3: ( 'Relacional' )
                    {
                     before(grammarAccess.getTipoBaseDatosAccess().getRelacionalEnumLiteralDeclaration_0()); 
                    // InternalCeffective.g:673:3: ( 'Relacional' )
                    // InternalCeffective.g:673:4: 'Relacional'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoBaseDatosAccess().getRelacionalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:677:2: ( ( 'NoSql' ) )
                    {
                    // InternalCeffective.g:677:2: ( ( 'NoSql' ) )
                    // InternalCeffective.g:678:3: ( 'NoSql' )
                    {
                     before(grammarAccess.getTipoBaseDatosAccess().getNoSqlEnumLiteralDeclaration_1()); 
                    // InternalCeffective.g:679:3: ( 'NoSql' )
                    // InternalCeffective.g:679:4: 'NoSql'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoBaseDatosAccess().getNoSqlEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoBaseDatos__Alternatives"


    // $ANTLR start "rule__Ceffective__Group__0"
    // InternalCeffective.g:687:1: rule__Ceffective__Group__0 : rule__Ceffective__Group__0__Impl rule__Ceffective__Group__1 ;
    public final void rule__Ceffective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:691:1: ( rule__Ceffective__Group__0__Impl rule__Ceffective__Group__1 )
            // InternalCeffective.g:692:2: rule__Ceffective__Group__0__Impl rule__Ceffective__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ceffective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__0"


    // $ANTLR start "rule__Ceffective__Group__0__Impl"
    // InternalCeffective.g:699:1: rule__Ceffective__Group__0__Impl : ( () ) ;
    public final void rule__Ceffective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:703:1: ( ( () ) )
            // InternalCeffective.g:704:1: ( () )
            {
            // InternalCeffective.g:704:1: ( () )
            // InternalCeffective.g:705:2: ()
            {
             before(grammarAccess.getCeffectiveAccess().getCeffectiveAction_0()); 
            // InternalCeffective.g:706:2: ()
            // InternalCeffective.g:706:3: 
            {
            }

             after(grammarAccess.getCeffectiveAccess().getCeffectiveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__0__Impl"


    // $ANTLR start "rule__Ceffective__Group__1"
    // InternalCeffective.g:714:1: rule__Ceffective__Group__1 : rule__Ceffective__Group__1__Impl rule__Ceffective__Group__2 ;
    public final void rule__Ceffective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:718:1: ( rule__Ceffective__Group__1__Impl rule__Ceffective__Group__2 )
            // InternalCeffective.g:719:2: rule__Ceffective__Group__1__Impl rule__Ceffective__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Ceffective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__1"


    // $ANTLR start "rule__Ceffective__Group__1__Impl"
    // InternalCeffective.g:726:1: rule__Ceffective__Group__1__Impl : ( 'Ceffective' ) ;
    public final void rule__Ceffective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:730:1: ( ( 'Ceffective' ) )
            // InternalCeffective.g:731:1: ( 'Ceffective' )
            {
            // InternalCeffective.g:731:1: ( 'Ceffective' )
            // InternalCeffective.g:732:2: 'Ceffective'
            {
             before(grammarAccess.getCeffectiveAccess().getCeffectiveKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCeffectiveAccess().getCeffectiveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__1__Impl"


    // $ANTLR start "rule__Ceffective__Group__2"
    // InternalCeffective.g:741:1: rule__Ceffective__Group__2 : rule__Ceffective__Group__2__Impl rule__Ceffective__Group__3 ;
    public final void rule__Ceffective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:745:1: ( rule__Ceffective__Group__2__Impl rule__Ceffective__Group__3 )
            // InternalCeffective.g:746:2: rule__Ceffective__Group__2__Impl rule__Ceffective__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Ceffective__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__2"


    // $ANTLR start "rule__Ceffective__Group__2__Impl"
    // InternalCeffective.g:753:1: rule__Ceffective__Group__2__Impl : ( '{' ) ;
    public final void rule__Ceffective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:757:1: ( ( '{' ) )
            // InternalCeffective.g:758:1: ( '{' )
            {
            // InternalCeffective.g:758:1: ( '{' )
            // InternalCeffective.g:759:2: '{'
            {
             before(grammarAccess.getCeffectiveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCeffectiveAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__2__Impl"


    // $ANTLR start "rule__Ceffective__Group__3"
    // InternalCeffective.g:768:1: rule__Ceffective__Group__3 : rule__Ceffective__Group__3__Impl rule__Ceffective__Group__4 ;
    public final void rule__Ceffective__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:772:1: ( rule__Ceffective__Group__3__Impl rule__Ceffective__Group__4 )
            // InternalCeffective.g:773:2: rule__Ceffective__Group__3__Impl rule__Ceffective__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Ceffective__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__3"


    // $ANTLR start "rule__Ceffective__Group__3__Impl"
    // InternalCeffective.g:780:1: rule__Ceffective__Group__3__Impl : ( ( rule__Ceffective__Group_3__0 )? ) ;
    public final void rule__Ceffective__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:784:1: ( ( ( rule__Ceffective__Group_3__0 )? ) )
            // InternalCeffective.g:785:1: ( ( rule__Ceffective__Group_3__0 )? )
            {
            // InternalCeffective.g:785:1: ( ( rule__Ceffective__Group_3__0 )? )
            // InternalCeffective.g:786:2: ( rule__Ceffective__Group_3__0 )?
            {
             before(grammarAccess.getCeffectiveAccess().getGroup_3()); 
            // InternalCeffective.g:787:2: ( rule__Ceffective__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCeffective.g:787:3: rule__Ceffective__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ceffective__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCeffectiveAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__3__Impl"


    // $ANTLR start "rule__Ceffective__Group__4"
    // InternalCeffective.g:795:1: rule__Ceffective__Group__4 : rule__Ceffective__Group__4__Impl ;
    public final void rule__Ceffective__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:799:1: ( rule__Ceffective__Group__4__Impl )
            // InternalCeffective.g:800:2: rule__Ceffective__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__4"


    // $ANTLR start "rule__Ceffective__Group__4__Impl"
    // InternalCeffective.g:806:1: rule__Ceffective__Group__4__Impl : ( '}' ) ;
    public final void rule__Ceffective__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:810:1: ( ( '}' ) )
            // InternalCeffective.g:811:1: ( '}' )
            {
            // InternalCeffective.g:811:1: ( '}' )
            // InternalCeffective.g:812:2: '}'
            {
             before(grammarAccess.getCeffectiveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCeffectiveAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__4__Impl"


    // $ANTLR start "rule__Ceffective__Group_3__0"
    // InternalCeffective.g:822:1: rule__Ceffective__Group_3__0 : rule__Ceffective__Group_3__0__Impl rule__Ceffective__Group_3__1 ;
    public final void rule__Ceffective__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:826:1: ( rule__Ceffective__Group_3__0__Impl rule__Ceffective__Group_3__1 )
            // InternalCeffective.g:827:2: rule__Ceffective__Group_3__0__Impl rule__Ceffective__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Ceffective__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group_3__0"


    // $ANTLR start "rule__Ceffective__Group_3__0__Impl"
    // InternalCeffective.g:834:1: rule__Ceffective__Group_3__0__Impl : ( 'proveedorNube' ) ;
    public final void rule__Ceffective__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:838:1: ( ( 'proveedorNube' ) )
            // InternalCeffective.g:839:1: ( 'proveedorNube' )
            {
            // InternalCeffective.g:839:1: ( 'proveedorNube' )
            // InternalCeffective.g:840:2: 'proveedorNube'
            {
             before(grammarAccess.getCeffectiveAccess().getProveedorNubeKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCeffectiveAccess().getProveedorNubeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group_3__0__Impl"


    // $ANTLR start "rule__Ceffective__Group_3__1"
    // InternalCeffective.g:849:1: rule__Ceffective__Group_3__1 : rule__Ceffective__Group_3__1__Impl ;
    public final void rule__Ceffective__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:853:1: ( rule__Ceffective__Group_3__1__Impl )
            // InternalCeffective.g:854:2: rule__Ceffective__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ceffective__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group_3__1"


    // $ANTLR start "rule__Ceffective__Group_3__1__Impl"
    // InternalCeffective.g:860:1: rule__Ceffective__Group_3__1__Impl : ( ( rule__Ceffective__ProveedorNubeAssignment_3_1 ) ) ;
    public final void rule__Ceffective__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:864:1: ( ( ( rule__Ceffective__ProveedorNubeAssignment_3_1 ) ) )
            // InternalCeffective.g:865:1: ( ( rule__Ceffective__ProveedorNubeAssignment_3_1 ) )
            {
            // InternalCeffective.g:865:1: ( ( rule__Ceffective__ProveedorNubeAssignment_3_1 ) )
            // InternalCeffective.g:866:2: ( rule__Ceffective__ProveedorNubeAssignment_3_1 )
            {
             before(grammarAccess.getCeffectiveAccess().getProveedorNubeAssignment_3_1()); 
            // InternalCeffective.g:867:2: ( rule__Ceffective__ProveedorNubeAssignment_3_1 )
            // InternalCeffective.g:867:3: rule__Ceffective__ProveedorNubeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ceffective__ProveedorNubeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCeffectiveAccess().getProveedorNubeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group_3__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__0"
    // InternalCeffective.g:876:1: rule__ProveedorNube__Group__0 : rule__ProveedorNube__Group__0__Impl rule__ProveedorNube__Group__1 ;
    public final void rule__ProveedorNube__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:880:1: ( rule__ProveedorNube__Group__0__Impl rule__ProveedorNube__Group__1 )
            // InternalCeffective.g:881:2: rule__ProveedorNube__Group__0__Impl rule__ProveedorNube__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ProveedorNube__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__0"


    // $ANTLR start "rule__ProveedorNube__Group__0__Impl"
    // InternalCeffective.g:888:1: rule__ProveedorNube__Group__0__Impl : ( 'ProveedorNube' ) ;
    public final void rule__ProveedorNube__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:892:1: ( ( 'ProveedorNube' ) )
            // InternalCeffective.g:893:1: ( 'ProveedorNube' )
            {
            // InternalCeffective.g:893:1: ( 'ProveedorNube' )
            // InternalCeffective.g:894:2: 'ProveedorNube'
            {
             before(grammarAccess.getProveedorNubeAccess().getProveedorNubeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getProveedorNubeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__1"
    // InternalCeffective.g:903:1: rule__ProveedorNube__Group__1 : rule__ProveedorNube__Group__1__Impl rule__ProveedorNube__Group__2 ;
    public final void rule__ProveedorNube__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:907:1: ( rule__ProveedorNube__Group__1__Impl rule__ProveedorNube__Group__2 )
            // InternalCeffective.g:908:2: rule__ProveedorNube__Group__1__Impl rule__ProveedorNube__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ProveedorNube__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__1"


    // $ANTLR start "rule__ProveedorNube__Group__1__Impl"
    // InternalCeffective.g:915:1: rule__ProveedorNube__Group__1__Impl : ( '{' ) ;
    public final void rule__ProveedorNube__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:919:1: ( ( '{' ) )
            // InternalCeffective.g:920:1: ( '{' )
            {
            // InternalCeffective.g:920:1: ( '{' )
            // InternalCeffective.g:921:2: '{'
            {
             before(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__2"
    // InternalCeffective.g:930:1: rule__ProveedorNube__Group__2 : rule__ProveedorNube__Group__2__Impl rule__ProveedorNube__Group__3 ;
    public final void rule__ProveedorNube__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:934:1: ( rule__ProveedorNube__Group__2__Impl rule__ProveedorNube__Group__3 )
            // InternalCeffective.g:935:2: rule__ProveedorNube__Group__2__Impl rule__ProveedorNube__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ProveedorNube__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__2"


    // $ANTLR start "rule__ProveedorNube__Group__2__Impl"
    // InternalCeffective.g:942:1: rule__ProveedorNube__Group__2__Impl : ( ( rule__ProveedorNube__Group_2__0 )? ) ;
    public final void rule__ProveedorNube__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:946:1: ( ( ( rule__ProveedorNube__Group_2__0 )? ) )
            // InternalCeffective.g:947:1: ( ( rule__ProveedorNube__Group_2__0 )? )
            {
            // InternalCeffective.g:947:1: ( ( rule__ProveedorNube__Group_2__0 )? )
            // InternalCeffective.g:948:2: ( rule__ProveedorNube__Group_2__0 )?
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_2()); 
            // InternalCeffective.g:949:2: ( rule__ProveedorNube__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCeffective.g:949:3: rule__ProveedorNube__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProveedorNube__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProveedorNubeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__2__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__3"
    // InternalCeffective.g:957:1: rule__ProveedorNube__Group__3 : rule__ProveedorNube__Group__3__Impl rule__ProveedorNube__Group__4 ;
    public final void rule__ProveedorNube__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:961:1: ( rule__ProveedorNube__Group__3__Impl rule__ProveedorNube__Group__4 )
            // InternalCeffective.g:962:2: rule__ProveedorNube__Group__3__Impl rule__ProveedorNube__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ProveedorNube__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__3"


    // $ANTLR start "rule__ProveedorNube__Group__3__Impl"
    // InternalCeffective.g:969:1: rule__ProveedorNube__Group__3__Impl : ( ( rule__ProveedorNube__Group_3__0 )? ) ;
    public final void rule__ProveedorNube__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:973:1: ( ( ( rule__ProveedorNube__Group_3__0 )? ) )
            // InternalCeffective.g:974:1: ( ( rule__ProveedorNube__Group_3__0 )? )
            {
            // InternalCeffective.g:974:1: ( ( rule__ProveedorNube__Group_3__0 )? )
            // InternalCeffective.g:975:2: ( rule__ProveedorNube__Group_3__0 )?
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_3()); 
            // InternalCeffective.g:976:2: ( rule__ProveedorNube__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCeffective.g:976:3: rule__ProveedorNube__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProveedorNube__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProveedorNubeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__3__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__4"
    // InternalCeffective.g:984:1: rule__ProveedorNube__Group__4 : rule__ProveedorNube__Group__4__Impl rule__ProveedorNube__Group__5 ;
    public final void rule__ProveedorNube__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:988:1: ( rule__ProveedorNube__Group__4__Impl rule__ProveedorNube__Group__5 )
            // InternalCeffective.g:989:2: rule__ProveedorNube__Group__4__Impl rule__ProveedorNube__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ProveedorNube__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__4"


    // $ANTLR start "rule__ProveedorNube__Group__4__Impl"
    // InternalCeffective.g:996:1: rule__ProveedorNube__Group__4__Impl : ( 'autenticacionUsuario' ) ;
    public final void rule__ProveedorNube__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1000:1: ( ( 'autenticacionUsuario' ) )
            // InternalCeffective.g:1001:1: ( 'autenticacionUsuario' )
            {
            // InternalCeffective.g:1001:1: ( 'autenticacionUsuario' )
            // InternalCeffective.g:1002:2: 'autenticacionUsuario'
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__4__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__5"
    // InternalCeffective.g:1011:1: rule__ProveedorNube__Group__5 : rule__ProveedorNube__Group__5__Impl rule__ProveedorNube__Group__6 ;
    public final void rule__ProveedorNube__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1015:1: ( rule__ProveedorNube__Group__5__Impl rule__ProveedorNube__Group__6 )
            // InternalCeffective.g:1016:2: rule__ProveedorNube__Group__5__Impl rule__ProveedorNube__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__ProveedorNube__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__5"


    // $ANTLR start "rule__ProveedorNube__Group__5__Impl"
    // InternalCeffective.g:1023:1: rule__ProveedorNube__Group__5__Impl : ( '{' ) ;
    public final void rule__ProveedorNube__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1027:1: ( ( '{' ) )
            // InternalCeffective.g:1028:1: ( '{' )
            {
            // InternalCeffective.g:1028:1: ( '{' )
            // InternalCeffective.g:1029:2: '{'
            {
             before(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__5__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__6"
    // InternalCeffective.g:1038:1: rule__ProveedorNube__Group__6 : rule__ProveedorNube__Group__6__Impl rule__ProveedorNube__Group__7 ;
    public final void rule__ProveedorNube__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1042:1: ( rule__ProveedorNube__Group__6__Impl rule__ProveedorNube__Group__7 )
            // InternalCeffective.g:1043:2: rule__ProveedorNube__Group__6__Impl rule__ProveedorNube__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__ProveedorNube__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__6"


    // $ANTLR start "rule__ProveedorNube__Group__6__Impl"
    // InternalCeffective.g:1050:1: rule__ProveedorNube__Group__6__Impl : ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_6 ) ) ;
    public final void rule__ProveedorNube__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1054:1: ( ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_6 ) ) )
            // InternalCeffective.g:1055:1: ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_6 ) )
            {
            // InternalCeffective.g:1055:1: ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_6 ) )
            // InternalCeffective.g:1056:2: ( rule__ProveedorNube__AutenticacionUsuarioAssignment_6 )
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAssignment_6()); 
            // InternalCeffective.g:1057:2: ( rule__ProveedorNube__AutenticacionUsuarioAssignment_6 )
            // InternalCeffective.g:1057:3: rule__ProveedorNube__AutenticacionUsuarioAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__AutenticacionUsuarioAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__6__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__7"
    // InternalCeffective.g:1065:1: rule__ProveedorNube__Group__7 : rule__ProveedorNube__Group__7__Impl rule__ProveedorNube__Group__8 ;
    public final void rule__ProveedorNube__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1069:1: ( rule__ProveedorNube__Group__7__Impl rule__ProveedorNube__Group__8 )
            // InternalCeffective.g:1070:2: rule__ProveedorNube__Group__7__Impl rule__ProveedorNube__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ProveedorNube__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__7"


    // $ANTLR start "rule__ProveedorNube__Group__7__Impl"
    // InternalCeffective.g:1077:1: rule__ProveedorNube__Group__7__Impl : ( ( rule__ProveedorNube__Group_7__0 )* ) ;
    public final void rule__ProveedorNube__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1081:1: ( ( ( rule__ProveedorNube__Group_7__0 )* ) )
            // InternalCeffective.g:1082:1: ( ( rule__ProveedorNube__Group_7__0 )* )
            {
            // InternalCeffective.g:1082:1: ( ( rule__ProveedorNube__Group_7__0 )* )
            // InternalCeffective.g:1083:2: ( rule__ProveedorNube__Group_7__0 )*
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_7()); 
            // InternalCeffective.g:1084:2: ( rule__ProveedorNube__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCeffective.g:1084:3: rule__ProveedorNube__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProveedorNube__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProveedorNubeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__7__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__8"
    // InternalCeffective.g:1092:1: rule__ProveedorNube__Group__8 : rule__ProveedorNube__Group__8__Impl rule__ProveedorNube__Group__9 ;
    public final void rule__ProveedorNube__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1096:1: ( rule__ProveedorNube__Group__8__Impl rule__ProveedorNube__Group__9 )
            // InternalCeffective.g:1097:2: rule__ProveedorNube__Group__8__Impl rule__ProveedorNube__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__ProveedorNube__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__8"


    // $ANTLR start "rule__ProveedorNube__Group__8__Impl"
    // InternalCeffective.g:1104:1: rule__ProveedorNube__Group__8__Impl : ( '}' ) ;
    public final void rule__ProveedorNube__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1108:1: ( ( '}' ) )
            // InternalCeffective.g:1109:1: ( '}' )
            {
            // InternalCeffective.g:1109:1: ( '}' )
            // InternalCeffective.g:1110:2: '}'
            {
             before(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__8__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__9"
    // InternalCeffective.g:1119:1: rule__ProveedorNube__Group__9 : rule__ProveedorNube__Group__9__Impl rule__ProveedorNube__Group__10 ;
    public final void rule__ProveedorNube__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1123:1: ( rule__ProveedorNube__Group__9__Impl rule__ProveedorNube__Group__10 )
            // InternalCeffective.g:1124:2: rule__ProveedorNube__Group__9__Impl rule__ProveedorNube__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__ProveedorNube__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__9"


    // $ANTLR start "rule__ProveedorNube__Group__9__Impl"
    // InternalCeffective.g:1131:1: rule__ProveedorNube__Group__9__Impl : ( ( rule__ProveedorNube__Group_9__0 )? ) ;
    public final void rule__ProveedorNube__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1135:1: ( ( ( rule__ProveedorNube__Group_9__0 )? ) )
            // InternalCeffective.g:1136:1: ( ( rule__ProveedorNube__Group_9__0 )? )
            {
            // InternalCeffective.g:1136:1: ( ( rule__ProveedorNube__Group_9__0 )? )
            // InternalCeffective.g:1137:2: ( rule__ProveedorNube__Group_9__0 )?
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_9()); 
            // InternalCeffective.g:1138:2: ( rule__ProveedorNube__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCeffective.g:1138:3: rule__ProveedorNube__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProveedorNube__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProveedorNubeAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__9__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__10"
    // InternalCeffective.g:1146:1: rule__ProveedorNube__Group__10 : rule__ProveedorNube__Group__10__Impl rule__ProveedorNube__Group__11 ;
    public final void rule__ProveedorNube__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1150:1: ( rule__ProveedorNube__Group__10__Impl rule__ProveedorNube__Group__11 )
            // InternalCeffective.g:1151:2: rule__ProveedorNube__Group__10__Impl rule__ProveedorNube__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__ProveedorNube__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__10"


    // $ANTLR start "rule__ProveedorNube__Group__10__Impl"
    // InternalCeffective.g:1158:1: rule__ProveedorNube__Group__10__Impl : ( ( rule__ProveedorNube__Group_10__0 )? ) ;
    public final void rule__ProveedorNube__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1162:1: ( ( ( rule__ProveedorNube__Group_10__0 )? ) )
            // InternalCeffective.g:1163:1: ( ( rule__ProveedorNube__Group_10__0 )? )
            {
            // InternalCeffective.g:1163:1: ( ( rule__ProveedorNube__Group_10__0 )? )
            // InternalCeffective.g:1164:2: ( rule__ProveedorNube__Group_10__0 )?
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_10()); 
            // InternalCeffective.g:1165:2: ( rule__ProveedorNube__Group_10__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCeffective.g:1165:3: rule__ProveedorNube__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProveedorNube__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProveedorNubeAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__10__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__11"
    // InternalCeffective.g:1173:1: rule__ProveedorNube__Group__11 : rule__ProveedorNube__Group__11__Impl ;
    public final void rule__ProveedorNube__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1177:1: ( rule__ProveedorNube__Group__11__Impl )
            // InternalCeffective.g:1178:2: rule__ProveedorNube__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__11"


    // $ANTLR start "rule__ProveedorNube__Group__11__Impl"
    // InternalCeffective.g:1184:1: rule__ProveedorNube__Group__11__Impl : ( '}' ) ;
    public final void rule__ProveedorNube__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1188:1: ( ( '}' ) )
            // InternalCeffective.g:1189:1: ( '}' )
            {
            // InternalCeffective.g:1189:1: ( '}' )
            // InternalCeffective.g:1190:2: '}'
            {
             before(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__11__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_2__0"
    // InternalCeffective.g:1200:1: rule__ProveedorNube__Group_2__0 : rule__ProveedorNube__Group_2__0__Impl rule__ProveedorNube__Group_2__1 ;
    public final void rule__ProveedorNube__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1204:1: ( rule__ProveedorNube__Group_2__0__Impl rule__ProveedorNube__Group_2__1 )
            // InternalCeffective.g:1205:2: rule__ProveedorNube__Group_2__0__Impl rule__ProveedorNube__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__ProveedorNube__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_2__0"


    // $ANTLR start "rule__ProveedorNube__Group_2__0__Impl"
    // InternalCeffective.g:1212:1: rule__ProveedorNube__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__ProveedorNube__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1216:1: ( ( 'nombre' ) )
            // InternalCeffective.g:1217:1: ( 'nombre' )
            {
            // InternalCeffective.g:1217:1: ( 'nombre' )
            // InternalCeffective.g:1218:2: 'nombre'
            {
             before(grammarAccess.getProveedorNubeAccess().getNombreKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_2__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_2__1"
    // InternalCeffective.g:1227:1: rule__ProveedorNube__Group_2__1 : rule__ProveedorNube__Group_2__1__Impl ;
    public final void rule__ProveedorNube__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1231:1: ( rule__ProveedorNube__Group_2__1__Impl )
            // InternalCeffective.g:1232:2: rule__ProveedorNube__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_2__1"


    // $ANTLR start "rule__ProveedorNube__Group_2__1__Impl"
    // InternalCeffective.g:1238:1: rule__ProveedorNube__Group_2__1__Impl : ( ( rule__ProveedorNube__NombreAssignment_2_1 ) ) ;
    public final void rule__ProveedorNube__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1242:1: ( ( ( rule__ProveedorNube__NombreAssignment_2_1 ) ) )
            // InternalCeffective.g:1243:1: ( ( rule__ProveedorNube__NombreAssignment_2_1 ) )
            {
            // InternalCeffective.g:1243:1: ( ( rule__ProveedorNube__NombreAssignment_2_1 ) )
            // InternalCeffective.g:1244:2: ( rule__ProveedorNube__NombreAssignment_2_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getNombreAssignment_2_1()); 
            // InternalCeffective.g:1245:2: ( rule__ProveedorNube__NombreAssignment_2_1 )
            // InternalCeffective.g:1245:3: rule__ProveedorNube__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_2__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3__0"
    // InternalCeffective.g:1254:1: rule__ProveedorNube__Group_3__0 : rule__ProveedorNube__Group_3__0__Impl rule__ProveedorNube__Group_3__1 ;
    public final void rule__ProveedorNube__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1258:1: ( rule__ProveedorNube__Group_3__0__Impl rule__ProveedorNube__Group_3__1 )
            // InternalCeffective.g:1259:2: rule__ProveedorNube__Group_3__0__Impl rule__ProveedorNube__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ProveedorNube__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__0"


    // $ANTLR start "rule__ProveedorNube__Group_3__0__Impl"
    // InternalCeffective.g:1266:1: rule__ProveedorNube__Group_3__0__Impl : ( 'vpc' ) ;
    public final void rule__ProveedorNube__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1270:1: ( ( 'vpc' ) )
            // InternalCeffective.g:1271:1: ( 'vpc' )
            {
            // InternalCeffective.g:1271:1: ( 'vpc' )
            // InternalCeffective.g:1272:2: 'vpc'
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getVpcKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3__1"
    // InternalCeffective.g:1281:1: rule__ProveedorNube__Group_3__1 : rule__ProveedorNube__Group_3__1__Impl ;
    public final void rule__ProveedorNube__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1285:1: ( rule__ProveedorNube__Group_3__1__Impl )
            // InternalCeffective.g:1286:2: rule__ProveedorNube__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__1"


    // $ANTLR start "rule__ProveedorNube__Group_3__1__Impl"
    // InternalCeffective.g:1292:1: rule__ProveedorNube__Group_3__1__Impl : ( ( rule__ProveedorNube__VpcAssignment_3_1 ) ) ;
    public final void rule__ProveedorNube__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1296:1: ( ( ( rule__ProveedorNube__VpcAssignment_3_1 ) ) )
            // InternalCeffective.g:1297:1: ( ( rule__ProveedorNube__VpcAssignment_3_1 ) )
            {
            // InternalCeffective.g:1297:1: ( ( rule__ProveedorNube__VpcAssignment_3_1 ) )
            // InternalCeffective.g:1298:2: ( rule__ProveedorNube__VpcAssignment_3_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcAssignment_3_1()); 
            // InternalCeffective.g:1299:2: ( rule__ProveedorNube__VpcAssignment_3_1 )
            // InternalCeffective.g:1299:3: rule__ProveedorNube__VpcAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__VpcAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getVpcAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_7__0"
    // InternalCeffective.g:1308:1: rule__ProveedorNube__Group_7__0 : rule__ProveedorNube__Group_7__0__Impl rule__ProveedorNube__Group_7__1 ;
    public final void rule__ProveedorNube__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1312:1: ( rule__ProveedorNube__Group_7__0__Impl rule__ProveedorNube__Group_7__1 )
            // InternalCeffective.g:1313:2: rule__ProveedorNube__Group_7__0__Impl rule__ProveedorNube__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__ProveedorNube__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_7__0"


    // $ANTLR start "rule__ProveedorNube__Group_7__0__Impl"
    // InternalCeffective.g:1320:1: rule__ProveedorNube__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ProveedorNube__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1324:1: ( ( ',' ) )
            // InternalCeffective.g:1325:1: ( ',' )
            {
            // InternalCeffective.g:1325:1: ( ',' )
            // InternalCeffective.g:1326:2: ','
            {
             before(grammarAccess.getProveedorNubeAccess().getCommaKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_7__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_7__1"
    // InternalCeffective.g:1335:1: rule__ProveedorNube__Group_7__1 : rule__ProveedorNube__Group_7__1__Impl ;
    public final void rule__ProveedorNube__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1339:1: ( rule__ProveedorNube__Group_7__1__Impl )
            // InternalCeffective.g:1340:2: rule__ProveedorNube__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_7__1"


    // $ANTLR start "rule__ProveedorNube__Group_7__1__Impl"
    // InternalCeffective.g:1346:1: rule__ProveedorNube__Group_7__1__Impl : ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1 ) ) ;
    public final void rule__ProveedorNube__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1350:1: ( ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1 ) ) )
            // InternalCeffective.g:1351:1: ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1 ) )
            {
            // InternalCeffective.g:1351:1: ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1 ) )
            // InternalCeffective.g:1352:2: ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAssignment_7_1()); 
            // InternalCeffective.g:1353:2: ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1 )
            // InternalCeffective.g:1353:3: rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_7__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_9__0"
    // InternalCeffective.g:1362:1: rule__ProveedorNube__Group_9__0 : rule__ProveedorNube__Group_9__0__Impl rule__ProveedorNube__Group_9__1 ;
    public final void rule__ProveedorNube__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1366:1: ( rule__ProveedorNube__Group_9__0__Impl rule__ProveedorNube__Group_9__1 )
            // InternalCeffective.g:1367:2: rule__ProveedorNube__Group_9__0__Impl rule__ProveedorNube__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__ProveedorNube__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__0"


    // $ANTLR start "rule__ProveedorNube__Group_9__0__Impl"
    // InternalCeffective.g:1374:1: rule__ProveedorNube__Group_9__0__Impl : ( 'ambientedespliegue' ) ;
    public final void rule__ProveedorNube__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1378:1: ( ( 'ambientedespliegue' ) )
            // InternalCeffective.g:1379:1: ( 'ambientedespliegue' )
            {
            // InternalCeffective.g:1379:1: ( 'ambientedespliegue' )
            // InternalCeffective.g:1380:2: 'ambientedespliegue'
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_9__1"
    // InternalCeffective.g:1389:1: rule__ProveedorNube__Group_9__1 : rule__ProveedorNube__Group_9__1__Impl rule__ProveedorNube__Group_9__2 ;
    public final void rule__ProveedorNube__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1393:1: ( rule__ProveedorNube__Group_9__1__Impl rule__ProveedorNube__Group_9__2 )
            // InternalCeffective.g:1394:2: rule__ProveedorNube__Group_9__1__Impl rule__ProveedorNube__Group_9__2
            {
            pushFollow(FOLLOW_13);
            rule__ProveedorNube__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__1"


    // $ANTLR start "rule__ProveedorNube__Group_9__1__Impl"
    // InternalCeffective.g:1401:1: rule__ProveedorNube__Group_9__1__Impl : ( '{' ) ;
    public final void rule__ProveedorNube__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1405:1: ( ( '{' ) )
            // InternalCeffective.g:1406:1: ( '{' )
            {
            // InternalCeffective.g:1406:1: ( '{' )
            // InternalCeffective.g:1407:2: '{'
            {
             before(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_9__2"
    // InternalCeffective.g:1416:1: rule__ProveedorNube__Group_9__2 : rule__ProveedorNube__Group_9__2__Impl rule__ProveedorNube__Group_9__3 ;
    public final void rule__ProveedorNube__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1420:1: ( rule__ProveedorNube__Group_9__2__Impl rule__ProveedorNube__Group_9__3 )
            // InternalCeffective.g:1421:2: rule__ProveedorNube__Group_9__2__Impl rule__ProveedorNube__Group_9__3
            {
            pushFollow(FOLLOW_9);
            rule__ProveedorNube__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__2"


    // $ANTLR start "rule__ProveedorNube__Group_9__2__Impl"
    // InternalCeffective.g:1428:1: rule__ProveedorNube__Group_9__2__Impl : ( ( rule__ProveedorNube__AmbientedespliegueAssignment_9_2 ) ) ;
    public final void rule__ProveedorNube__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1432:1: ( ( ( rule__ProveedorNube__AmbientedespliegueAssignment_9_2 ) ) )
            // InternalCeffective.g:1433:1: ( ( rule__ProveedorNube__AmbientedespliegueAssignment_9_2 ) )
            {
            // InternalCeffective.g:1433:1: ( ( rule__ProveedorNube__AmbientedespliegueAssignment_9_2 ) )
            // InternalCeffective.g:1434:2: ( rule__ProveedorNube__AmbientedespliegueAssignment_9_2 )
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAssignment_9_2()); 
            // InternalCeffective.g:1435:2: ( rule__ProveedorNube__AmbientedespliegueAssignment_9_2 )
            // InternalCeffective.g:1435:3: rule__ProveedorNube__AmbientedespliegueAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__AmbientedespliegueAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__2__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_9__3"
    // InternalCeffective.g:1443:1: rule__ProveedorNube__Group_9__3 : rule__ProveedorNube__Group_9__3__Impl rule__ProveedorNube__Group_9__4 ;
    public final void rule__ProveedorNube__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1447:1: ( rule__ProveedorNube__Group_9__3__Impl rule__ProveedorNube__Group_9__4 )
            // InternalCeffective.g:1448:2: rule__ProveedorNube__Group_9__3__Impl rule__ProveedorNube__Group_9__4
            {
            pushFollow(FOLLOW_9);
            rule__ProveedorNube__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__3"


    // $ANTLR start "rule__ProveedorNube__Group_9__3__Impl"
    // InternalCeffective.g:1455:1: rule__ProveedorNube__Group_9__3__Impl : ( ( rule__ProveedorNube__Group_9_3__0 )* ) ;
    public final void rule__ProveedorNube__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1459:1: ( ( ( rule__ProveedorNube__Group_9_3__0 )* ) )
            // InternalCeffective.g:1460:1: ( ( rule__ProveedorNube__Group_9_3__0 )* )
            {
            // InternalCeffective.g:1460:1: ( ( rule__ProveedorNube__Group_9_3__0 )* )
            // InternalCeffective.g:1461:2: ( rule__ProveedorNube__Group_9_3__0 )*
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_9_3()); 
            // InternalCeffective.g:1462:2: ( rule__ProveedorNube__Group_9_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCeffective.g:1462:3: rule__ProveedorNube__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProveedorNube__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProveedorNubeAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__3__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_9__4"
    // InternalCeffective.g:1470:1: rule__ProveedorNube__Group_9__4 : rule__ProveedorNube__Group_9__4__Impl ;
    public final void rule__ProveedorNube__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1474:1: ( rule__ProveedorNube__Group_9__4__Impl )
            // InternalCeffective.g:1475:2: rule__ProveedorNube__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__4"


    // $ANTLR start "rule__ProveedorNube__Group_9__4__Impl"
    // InternalCeffective.g:1481:1: rule__ProveedorNube__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ProveedorNube__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1485:1: ( ( '}' ) )
            // InternalCeffective.g:1486:1: ( '}' )
            {
            // InternalCeffective.g:1486:1: ( '}' )
            // InternalCeffective.g:1487:2: '}'
            {
             before(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9__4__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_9_3__0"
    // InternalCeffective.g:1497:1: rule__ProveedorNube__Group_9_3__0 : rule__ProveedorNube__Group_9_3__0__Impl rule__ProveedorNube__Group_9_3__1 ;
    public final void rule__ProveedorNube__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1501:1: ( rule__ProveedorNube__Group_9_3__0__Impl rule__ProveedorNube__Group_9_3__1 )
            // InternalCeffective.g:1502:2: rule__ProveedorNube__Group_9_3__0__Impl rule__ProveedorNube__Group_9_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ProveedorNube__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9_3__0"


    // $ANTLR start "rule__ProveedorNube__Group_9_3__0__Impl"
    // InternalCeffective.g:1509:1: rule__ProveedorNube__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ProveedorNube__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1513:1: ( ( ',' ) )
            // InternalCeffective.g:1514:1: ( ',' )
            {
            // InternalCeffective.g:1514:1: ( ',' )
            // InternalCeffective.g:1515:2: ','
            {
             before(grammarAccess.getProveedorNubeAccess().getCommaKeyword_9_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9_3__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_9_3__1"
    // InternalCeffective.g:1524:1: rule__ProveedorNube__Group_9_3__1 : rule__ProveedorNube__Group_9_3__1__Impl ;
    public final void rule__ProveedorNube__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1528:1: ( rule__ProveedorNube__Group_9_3__1__Impl )
            // InternalCeffective.g:1529:2: rule__ProveedorNube__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9_3__1"


    // $ANTLR start "rule__ProveedorNube__Group_9_3__1__Impl"
    // InternalCeffective.g:1535:1: rule__ProveedorNube__Group_9_3__1__Impl : ( ( rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1 ) ) ;
    public final void rule__ProveedorNube__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1539:1: ( ( ( rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1 ) ) )
            // InternalCeffective.g:1540:1: ( ( rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1 ) )
            {
            // InternalCeffective.g:1540:1: ( ( rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1 ) )
            // InternalCeffective.g:1541:2: ( rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAssignment_9_3_1()); 
            // InternalCeffective.g:1542:2: ( rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1 )
            // InternalCeffective.g:1542:3: rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_9_3__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_10__0"
    // InternalCeffective.g:1551:1: rule__ProveedorNube__Group_10__0 : rule__ProveedorNube__Group_10__0__Impl rule__ProveedorNube__Group_10__1 ;
    public final void rule__ProveedorNube__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1555:1: ( rule__ProveedorNube__Group_10__0__Impl rule__ProveedorNube__Group_10__1 )
            // InternalCeffective.g:1556:2: rule__ProveedorNube__Group_10__0__Impl rule__ProveedorNube__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__ProveedorNube__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__0"


    // $ANTLR start "rule__ProveedorNube__Group_10__0__Impl"
    // InternalCeffective.g:1563:1: rule__ProveedorNube__Group_10__0__Impl : ( 'mecanismoseguridad' ) ;
    public final void rule__ProveedorNube__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1567:1: ( ( 'mecanismoseguridad' ) )
            // InternalCeffective.g:1568:1: ( 'mecanismoseguridad' )
            {
            // InternalCeffective.g:1568:1: ( 'mecanismoseguridad' )
            // InternalCeffective.g:1569:2: 'mecanismoseguridad'
            {
             before(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadKeyword_10_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_10__1"
    // InternalCeffective.g:1578:1: rule__ProveedorNube__Group_10__1 : rule__ProveedorNube__Group_10__1__Impl rule__ProveedorNube__Group_10__2 ;
    public final void rule__ProveedorNube__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1582:1: ( rule__ProveedorNube__Group_10__1__Impl rule__ProveedorNube__Group_10__2 )
            // InternalCeffective.g:1583:2: rule__ProveedorNube__Group_10__1__Impl rule__ProveedorNube__Group_10__2
            {
            pushFollow(FOLLOW_14);
            rule__ProveedorNube__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__1"


    // $ANTLR start "rule__ProveedorNube__Group_10__1__Impl"
    // InternalCeffective.g:1590:1: rule__ProveedorNube__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ProveedorNube__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1594:1: ( ( '{' ) )
            // InternalCeffective.g:1595:1: ( '{' )
            {
            // InternalCeffective.g:1595:1: ( '{' )
            // InternalCeffective.g:1596:2: '{'
            {
             before(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_10__2"
    // InternalCeffective.g:1605:1: rule__ProveedorNube__Group_10__2 : rule__ProveedorNube__Group_10__2__Impl rule__ProveedorNube__Group_10__3 ;
    public final void rule__ProveedorNube__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1609:1: ( rule__ProveedorNube__Group_10__2__Impl rule__ProveedorNube__Group_10__3 )
            // InternalCeffective.g:1610:2: rule__ProveedorNube__Group_10__2__Impl rule__ProveedorNube__Group_10__3
            {
            pushFollow(FOLLOW_9);
            rule__ProveedorNube__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__2"


    // $ANTLR start "rule__ProveedorNube__Group_10__2__Impl"
    // InternalCeffective.g:1617:1: rule__ProveedorNube__Group_10__2__Impl : ( ( rule__ProveedorNube__MecanismoseguridadAssignment_10_2 ) ) ;
    public final void rule__ProveedorNube__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1621:1: ( ( ( rule__ProveedorNube__MecanismoseguridadAssignment_10_2 ) ) )
            // InternalCeffective.g:1622:1: ( ( rule__ProveedorNube__MecanismoseguridadAssignment_10_2 ) )
            {
            // InternalCeffective.g:1622:1: ( ( rule__ProveedorNube__MecanismoseguridadAssignment_10_2 ) )
            // InternalCeffective.g:1623:2: ( rule__ProveedorNube__MecanismoseguridadAssignment_10_2 )
            {
             before(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadAssignment_10_2()); 
            // InternalCeffective.g:1624:2: ( rule__ProveedorNube__MecanismoseguridadAssignment_10_2 )
            // InternalCeffective.g:1624:3: rule__ProveedorNube__MecanismoseguridadAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__MecanismoseguridadAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__2__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_10__3"
    // InternalCeffective.g:1632:1: rule__ProveedorNube__Group_10__3 : rule__ProveedorNube__Group_10__3__Impl rule__ProveedorNube__Group_10__4 ;
    public final void rule__ProveedorNube__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1636:1: ( rule__ProveedorNube__Group_10__3__Impl rule__ProveedorNube__Group_10__4 )
            // InternalCeffective.g:1637:2: rule__ProveedorNube__Group_10__3__Impl rule__ProveedorNube__Group_10__4
            {
            pushFollow(FOLLOW_9);
            rule__ProveedorNube__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__3"


    // $ANTLR start "rule__ProveedorNube__Group_10__3__Impl"
    // InternalCeffective.g:1644:1: rule__ProveedorNube__Group_10__3__Impl : ( ( rule__ProveedorNube__Group_10_3__0 )* ) ;
    public final void rule__ProveedorNube__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1648:1: ( ( ( rule__ProveedorNube__Group_10_3__0 )* ) )
            // InternalCeffective.g:1649:1: ( ( rule__ProveedorNube__Group_10_3__0 )* )
            {
            // InternalCeffective.g:1649:1: ( ( rule__ProveedorNube__Group_10_3__0 )* )
            // InternalCeffective.g:1650:2: ( rule__ProveedorNube__Group_10_3__0 )*
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_10_3()); 
            // InternalCeffective.g:1651:2: ( rule__ProveedorNube__Group_10_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCeffective.g:1651:3: rule__ProveedorNube__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProveedorNube__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getProveedorNubeAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__3__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_10__4"
    // InternalCeffective.g:1659:1: rule__ProveedorNube__Group_10__4 : rule__ProveedorNube__Group_10__4__Impl ;
    public final void rule__ProveedorNube__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1663:1: ( rule__ProveedorNube__Group_10__4__Impl )
            // InternalCeffective.g:1664:2: rule__ProveedorNube__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__4"


    // $ANTLR start "rule__ProveedorNube__Group_10__4__Impl"
    // InternalCeffective.g:1670:1: rule__ProveedorNube__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ProveedorNube__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1674:1: ( ( '}' ) )
            // InternalCeffective.g:1675:1: ( '}' )
            {
            // InternalCeffective.g:1675:1: ( '}' )
            // InternalCeffective.g:1676:2: '}'
            {
             before(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10__4__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_10_3__0"
    // InternalCeffective.g:1686:1: rule__ProveedorNube__Group_10_3__0 : rule__ProveedorNube__Group_10_3__0__Impl rule__ProveedorNube__Group_10_3__1 ;
    public final void rule__ProveedorNube__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1690:1: ( rule__ProveedorNube__Group_10_3__0__Impl rule__ProveedorNube__Group_10_3__1 )
            // InternalCeffective.g:1691:2: rule__ProveedorNube__Group_10_3__0__Impl rule__ProveedorNube__Group_10_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ProveedorNube__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10_3__0"


    // $ANTLR start "rule__ProveedorNube__Group_10_3__0__Impl"
    // InternalCeffective.g:1698:1: rule__ProveedorNube__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ProveedorNube__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1702:1: ( ( ',' ) )
            // InternalCeffective.g:1703:1: ( ',' )
            {
            // InternalCeffective.g:1703:1: ( ',' )
            // InternalCeffective.g:1704:2: ','
            {
             before(grammarAccess.getProveedorNubeAccess().getCommaKeyword_10_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10_3__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_10_3__1"
    // InternalCeffective.g:1713:1: rule__ProveedorNube__Group_10_3__1 : rule__ProveedorNube__Group_10_3__1__Impl ;
    public final void rule__ProveedorNube__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1717:1: ( rule__ProveedorNube__Group_10_3__1__Impl )
            // InternalCeffective.g:1718:2: rule__ProveedorNube__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10_3__1"


    // $ANTLR start "rule__ProveedorNube__Group_10_3__1__Impl"
    // InternalCeffective.g:1724:1: rule__ProveedorNube__Group_10_3__1__Impl : ( ( rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1 ) ) ;
    public final void rule__ProveedorNube__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1728:1: ( ( ( rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1 ) ) )
            // InternalCeffective.g:1729:1: ( ( rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1 ) )
            {
            // InternalCeffective.g:1729:1: ( ( rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1 ) )
            // InternalCeffective.g:1730:2: ( rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadAssignment_10_3_1()); 
            // InternalCeffective.g:1731:2: ( rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1 )
            // InternalCeffective.g:1731:3: rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_10_3__1__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__0"
    // InternalCeffective.g:1740:1: rule__AutenticacionUsuario_Impl__Group__0 : rule__AutenticacionUsuario_Impl__Group__0__Impl rule__AutenticacionUsuario_Impl__Group__1 ;
    public final void rule__AutenticacionUsuario_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1744:1: ( rule__AutenticacionUsuario_Impl__Group__0__Impl rule__AutenticacionUsuario_Impl__Group__1 )
            // InternalCeffective.g:1745:2: rule__AutenticacionUsuario_Impl__Group__0__Impl rule__AutenticacionUsuario_Impl__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AutenticacionUsuario_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__0"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__0__Impl"
    // InternalCeffective.g:1752:1: rule__AutenticacionUsuario_Impl__Group__0__Impl : ( () ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1756:1: ( ( () ) )
            // InternalCeffective.g:1757:1: ( () )
            {
            // InternalCeffective.g:1757:1: ( () )
            // InternalCeffective.g:1758:2: ()
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioAction_0()); 
            // InternalCeffective.g:1759:2: ()
            // InternalCeffective.g:1759:3: 
            {
            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__0__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__1"
    // InternalCeffective.g:1767:1: rule__AutenticacionUsuario_Impl__Group__1 : rule__AutenticacionUsuario_Impl__Group__1__Impl rule__AutenticacionUsuario_Impl__Group__2 ;
    public final void rule__AutenticacionUsuario_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1771:1: ( rule__AutenticacionUsuario_Impl__Group__1__Impl rule__AutenticacionUsuario_Impl__Group__2 )
            // InternalCeffective.g:1772:2: rule__AutenticacionUsuario_Impl__Group__1__Impl rule__AutenticacionUsuario_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AutenticacionUsuario_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__1__Impl"
    // InternalCeffective.g:1779:1: rule__AutenticacionUsuario_Impl__Group__1__Impl : ( 'AutenticacionUsuario' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1783:1: ( ( 'AutenticacionUsuario' ) )
            // InternalCeffective.g:1784:1: ( 'AutenticacionUsuario' )
            {
            // InternalCeffective.g:1784:1: ( 'AutenticacionUsuario' )
            // InternalCeffective.g:1785:2: 'AutenticacionUsuario'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__1__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__2"
    // InternalCeffective.g:1794:1: rule__AutenticacionUsuario_Impl__Group__2 : rule__AutenticacionUsuario_Impl__Group__2__Impl rule__AutenticacionUsuario_Impl__Group__3 ;
    public final void rule__AutenticacionUsuario_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1798:1: ( rule__AutenticacionUsuario_Impl__Group__2__Impl rule__AutenticacionUsuario_Impl__Group__3 )
            // InternalCeffective.g:1799:2: rule__AutenticacionUsuario_Impl__Group__2__Impl rule__AutenticacionUsuario_Impl__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AutenticacionUsuario_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__2"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__2__Impl"
    // InternalCeffective.g:1806:1: rule__AutenticacionUsuario_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1810:1: ( ( '{' ) )
            // InternalCeffective.g:1811:1: ( '{' )
            {
            // InternalCeffective.g:1811:1: ( '{' )
            // InternalCeffective.g:1812:2: '{'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__2__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__3"
    // InternalCeffective.g:1821:1: rule__AutenticacionUsuario_Impl__Group__3 : rule__AutenticacionUsuario_Impl__Group__3__Impl rule__AutenticacionUsuario_Impl__Group__4 ;
    public final void rule__AutenticacionUsuario_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1825:1: ( rule__AutenticacionUsuario_Impl__Group__3__Impl rule__AutenticacionUsuario_Impl__Group__4 )
            // InternalCeffective.g:1826:2: rule__AutenticacionUsuario_Impl__Group__3__Impl rule__AutenticacionUsuario_Impl__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__AutenticacionUsuario_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__3"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__3__Impl"
    // InternalCeffective.g:1833:1: rule__AutenticacionUsuario_Impl__Group__3__Impl : ( ( rule__AutenticacionUsuario_Impl__Group_3__0 )? ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1837:1: ( ( ( rule__AutenticacionUsuario_Impl__Group_3__0 )? ) )
            // InternalCeffective.g:1838:1: ( ( rule__AutenticacionUsuario_Impl__Group_3__0 )? )
            {
            // InternalCeffective.g:1838:1: ( ( rule__AutenticacionUsuario_Impl__Group_3__0 )? )
            // InternalCeffective.g:1839:2: ( rule__AutenticacionUsuario_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup_3()); 
            // InternalCeffective.g:1840:2: ( rule__AutenticacionUsuario_Impl__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCeffective.g:1840:3: rule__AutenticacionUsuario_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionUsuario_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__3__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__4"
    // InternalCeffective.g:1848:1: rule__AutenticacionUsuario_Impl__Group__4 : rule__AutenticacionUsuario_Impl__Group__4__Impl rule__AutenticacionUsuario_Impl__Group__5 ;
    public final void rule__AutenticacionUsuario_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1852:1: ( rule__AutenticacionUsuario_Impl__Group__4__Impl rule__AutenticacionUsuario_Impl__Group__5 )
            // InternalCeffective.g:1853:2: rule__AutenticacionUsuario_Impl__Group__4__Impl rule__AutenticacionUsuario_Impl__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__AutenticacionUsuario_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__4"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__4__Impl"
    // InternalCeffective.g:1860:1: rule__AutenticacionUsuario_Impl__Group__4__Impl : ( ( rule__AutenticacionUsuario_Impl__Group_4__0 )? ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1864:1: ( ( ( rule__AutenticacionUsuario_Impl__Group_4__0 )? ) )
            // InternalCeffective.g:1865:1: ( ( rule__AutenticacionUsuario_Impl__Group_4__0 )? )
            {
            // InternalCeffective.g:1865:1: ( ( rule__AutenticacionUsuario_Impl__Group_4__0 )? )
            // InternalCeffective.g:1866:2: ( rule__AutenticacionUsuario_Impl__Group_4__0 )?
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup_4()); 
            // InternalCeffective.g:1867:2: ( rule__AutenticacionUsuario_Impl__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCeffective.g:1867:3: rule__AutenticacionUsuario_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionUsuario_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__4__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__5"
    // InternalCeffective.g:1875:1: rule__AutenticacionUsuario_Impl__Group__5 : rule__AutenticacionUsuario_Impl__Group__5__Impl ;
    public final void rule__AutenticacionUsuario_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1879:1: ( rule__AutenticacionUsuario_Impl__Group__5__Impl )
            // InternalCeffective.g:1880:2: rule__AutenticacionUsuario_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__5"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__5__Impl"
    // InternalCeffective.g:1886:1: rule__AutenticacionUsuario_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1890:1: ( ( '}' ) )
            // InternalCeffective.g:1891:1: ( '}' )
            {
            // InternalCeffective.g:1891:1: ( '}' )
            // InternalCeffective.g:1892:2: '}'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__5__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_3__0"
    // InternalCeffective.g:1902:1: rule__AutenticacionUsuario_Impl__Group_3__0 : rule__AutenticacionUsuario_Impl__Group_3__0__Impl rule__AutenticacionUsuario_Impl__Group_3__1 ;
    public final void rule__AutenticacionUsuario_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1906:1: ( rule__AutenticacionUsuario_Impl__Group_3__0__Impl rule__AutenticacionUsuario_Impl__Group_3__1 )
            // InternalCeffective.g:1907:2: rule__AutenticacionUsuario_Impl__Group_3__0__Impl rule__AutenticacionUsuario_Impl__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionUsuario_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_3__0"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_3__0__Impl"
    // InternalCeffective.g:1914:1: rule__AutenticacionUsuario_Impl__Group_3__0__Impl : ( 'usuario' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1918:1: ( ( 'usuario' ) )
            // InternalCeffective.g:1919:1: ( 'usuario' )
            {
            // InternalCeffective.g:1919:1: ( 'usuario' )
            // InternalCeffective.g:1920:2: 'usuario'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_3__1"
    // InternalCeffective.g:1929:1: rule__AutenticacionUsuario_Impl__Group_3__1 : rule__AutenticacionUsuario_Impl__Group_3__1__Impl ;
    public final void rule__AutenticacionUsuario_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1933:1: ( rule__AutenticacionUsuario_Impl__Group_3__1__Impl )
            // InternalCeffective.g:1934:2: rule__AutenticacionUsuario_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_3__1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_3__1__Impl"
    // InternalCeffective.g:1940:1: rule__AutenticacionUsuario_Impl__Group_3__1__Impl : ( ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 ) ) ;
    public final void rule__AutenticacionUsuario_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1944:1: ( ( ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 ) ) )
            // InternalCeffective.g:1945:1: ( ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 ) )
            {
            // InternalCeffective.g:1945:1: ( ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 ) )
            // InternalCeffective.g:1946:2: ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 )
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioAssignment_3_1()); 
            // InternalCeffective.g:1947:2: ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 )
            // InternalCeffective.g:1947:3: rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_4__0"
    // InternalCeffective.g:1956:1: rule__AutenticacionUsuario_Impl__Group_4__0 : rule__AutenticacionUsuario_Impl__Group_4__0__Impl rule__AutenticacionUsuario_Impl__Group_4__1 ;
    public final void rule__AutenticacionUsuario_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1960:1: ( rule__AutenticacionUsuario_Impl__Group_4__0__Impl rule__AutenticacionUsuario_Impl__Group_4__1 )
            // InternalCeffective.g:1961:2: rule__AutenticacionUsuario_Impl__Group_4__0__Impl rule__AutenticacionUsuario_Impl__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionUsuario_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_4__0"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_4__0__Impl"
    // InternalCeffective.g:1968:1: rule__AutenticacionUsuario_Impl__Group_4__0__Impl : ( 'correo' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1972:1: ( ( 'correo' ) )
            // InternalCeffective.g:1973:1: ( 'correo' )
            {
            // InternalCeffective.g:1973:1: ( 'correo' )
            // InternalCeffective.g:1974:2: 'correo'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_4__1"
    // InternalCeffective.g:1983:1: rule__AutenticacionUsuario_Impl__Group_4__1 : rule__AutenticacionUsuario_Impl__Group_4__1__Impl ;
    public final void rule__AutenticacionUsuario_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1987:1: ( rule__AutenticacionUsuario_Impl__Group_4__1__Impl )
            // InternalCeffective.g:1988:2: rule__AutenticacionUsuario_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_4__1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_4__1__Impl"
    // InternalCeffective.g:1994:1: rule__AutenticacionUsuario_Impl__Group_4__1__Impl : ( ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 ) ) ;
    public final void rule__AutenticacionUsuario_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1998:1: ( ( ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 ) ) )
            // InternalCeffective.g:1999:1: ( ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 ) )
            {
            // InternalCeffective.g:1999:1: ( ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 ) )
            // InternalCeffective.g:2000:2: ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 )
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoAssignment_4_1()); 
            // InternalCeffective.g:2001:2: ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 )
            // InternalCeffective.g:2001:3: rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__0"
    // InternalCeffective.g:2010:1: rule__AmbienteDespliegue__Group__0 : rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1 ;
    public final void rule__AmbienteDespliegue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2014:1: ( rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1 )
            // InternalCeffective.g:2015:2: rule__AmbienteDespliegue__Group__0__Impl rule__AmbienteDespliegue__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__AmbienteDespliegue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group__0__Impl"
    // InternalCeffective.g:2022:1: rule__AmbienteDespliegue__Group__0__Impl : ( () ) ;
    public final void rule__AmbienteDespliegue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2026:1: ( ( () ) )
            // InternalCeffective.g:2027:1: ( () )
            {
            // InternalCeffective.g:2027:1: ( () )
            // InternalCeffective.g:2028:2: ()
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueAction_0()); 
            // InternalCeffective.g:2029:2: ()
            // InternalCeffective.g:2029:3: 
            {
            }

             after(grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__1"
    // InternalCeffective.g:2037:1: rule__AmbienteDespliegue__Group__1 : rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2 ;
    public final void rule__AmbienteDespliegue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2041:1: ( rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2 )
            // InternalCeffective.g:2042:2: rule__AmbienteDespliegue__Group__1__Impl rule__AmbienteDespliegue__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AmbienteDespliegue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group__1__Impl"
    // InternalCeffective.g:2049:1: rule__AmbienteDespliegue__Group__1__Impl : ( 'AmbienteDespliegue' ) ;
    public final void rule__AmbienteDespliegue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2053:1: ( ( 'AmbienteDespliegue' ) )
            // InternalCeffective.g:2054:1: ( 'AmbienteDespliegue' )
            {
            // InternalCeffective.g:2054:1: ( 'AmbienteDespliegue' )
            // InternalCeffective.g:2055:2: 'AmbienteDespliegue'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__2"
    // InternalCeffective.g:2064:1: rule__AmbienteDespliegue__Group__2 : rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3 ;
    public final void rule__AmbienteDespliegue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2068:1: ( rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3 )
            // InternalCeffective.g:2069:2: rule__AmbienteDespliegue__Group__2__Impl rule__AmbienteDespliegue__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__2"


    // $ANTLR start "rule__AmbienteDespliegue__Group__2__Impl"
    // InternalCeffective.g:2076:1: rule__AmbienteDespliegue__Group__2__Impl : ( '{' ) ;
    public final void rule__AmbienteDespliegue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2080:1: ( ( '{' ) )
            // InternalCeffective.g:2081:1: ( '{' )
            {
            // InternalCeffective.g:2081:1: ( '{' )
            // InternalCeffective.g:2082:2: '{'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__2__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__3"
    // InternalCeffective.g:2091:1: rule__AmbienteDespliegue__Group__3 : rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4 ;
    public final void rule__AmbienteDespliegue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2095:1: ( rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4 )
            // InternalCeffective.g:2096:2: rule__AmbienteDespliegue__Group__3__Impl rule__AmbienteDespliegue__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__3"


    // $ANTLR start "rule__AmbienteDespliegue__Group__3__Impl"
    // InternalCeffective.g:2103:1: rule__AmbienteDespliegue__Group__3__Impl : ( ( rule__AmbienteDespliegue__Group_3__0 )? ) ;
    public final void rule__AmbienteDespliegue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2107:1: ( ( ( rule__AmbienteDespliegue__Group_3__0 )? ) )
            // InternalCeffective.g:2108:1: ( ( rule__AmbienteDespliegue__Group_3__0 )? )
            {
            // InternalCeffective.g:2108:1: ( ( rule__AmbienteDespliegue__Group_3__0 )? )
            // InternalCeffective.g:2109:2: ( rule__AmbienteDespliegue__Group_3__0 )?
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_3()); 
            // InternalCeffective.g:2110:2: ( rule__AmbienteDespliegue__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCeffective.g:2110:3: rule__AmbienteDespliegue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDespliegue__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__3__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__4"
    // InternalCeffective.g:2118:1: rule__AmbienteDespliegue__Group__4 : rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5 ;
    public final void rule__AmbienteDespliegue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2122:1: ( rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5 )
            // InternalCeffective.g:2123:2: rule__AmbienteDespliegue__Group__4__Impl rule__AmbienteDespliegue__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__AmbienteDespliegue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__4"


    // $ANTLR start "rule__AmbienteDespliegue__Group__4__Impl"
    // InternalCeffective.g:2130:1: rule__AmbienteDespliegue__Group__4__Impl : ( ( rule__AmbienteDespliegue__Group_4__0 )? ) ;
    public final void rule__AmbienteDespliegue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2134:1: ( ( ( rule__AmbienteDespliegue__Group_4__0 )? ) )
            // InternalCeffective.g:2135:1: ( ( rule__AmbienteDespliegue__Group_4__0 )? )
            {
            // InternalCeffective.g:2135:1: ( ( rule__AmbienteDespliegue__Group_4__0 )? )
            // InternalCeffective.g:2136:2: ( rule__AmbienteDespliegue__Group_4__0 )?
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_4()); 
            // InternalCeffective.g:2137:2: ( rule__AmbienteDespliegue__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCeffective.g:2137:3: rule__AmbienteDespliegue__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDespliegue__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__4__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group__5"
    // InternalCeffective.g:2145:1: rule__AmbienteDespliegue__Group__5 : rule__AmbienteDespliegue__Group__5__Impl ;
    public final void rule__AmbienteDespliegue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2149:1: ( rule__AmbienteDespliegue__Group__5__Impl )
            // InternalCeffective.g:2150:2: rule__AmbienteDespliegue__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__5"


    // $ANTLR start "rule__AmbienteDespliegue__Group__5__Impl"
    // InternalCeffective.g:2156:1: rule__AmbienteDespliegue__Group__5__Impl : ( '}' ) ;
    public final void rule__AmbienteDespliegue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2160:1: ( ( '}' ) )
            // InternalCeffective.g:2161:1: ( '}' )
            {
            // InternalCeffective.g:2161:1: ( '}' )
            // InternalCeffective.g:2162:2: '}'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group__5__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__0"
    // InternalCeffective.g:2172:1: rule__AmbienteDespliegue__Group_3__0 : rule__AmbienteDespliegue__Group_3__0__Impl rule__AmbienteDespliegue__Group_3__1 ;
    public final void rule__AmbienteDespliegue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2176:1: ( rule__AmbienteDespliegue__Group_3__0__Impl rule__AmbienteDespliegue__Group_3__1 )
            // InternalCeffective.g:2177:2: rule__AmbienteDespliegue__Group_3__0__Impl rule__AmbienteDespliegue__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__AmbienteDespliegue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__0__Impl"
    // InternalCeffective.g:2184:1: rule__AmbienteDespliegue__Group_3__0__Impl : ( 'ambiente' ) ;
    public final void rule__AmbienteDespliegue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2188:1: ( ( 'ambiente' ) )
            // InternalCeffective.g:2189:1: ( 'ambiente' )
            {
            // InternalCeffective.g:2189:1: ( 'ambiente' )
            // InternalCeffective.g:2190:2: 'ambiente'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getAmbienteKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getAmbienteKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__1"
    // InternalCeffective.g:2199:1: rule__AmbienteDespliegue__Group_3__1 : rule__AmbienteDespliegue__Group_3__1__Impl ;
    public final void rule__AmbienteDespliegue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2203:1: ( rule__AmbienteDespliegue__Group_3__1__Impl )
            // InternalCeffective.g:2204:2: rule__AmbienteDespliegue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_3__1__Impl"
    // InternalCeffective.g:2210:1: rule__AmbienteDespliegue__Group_3__1__Impl : ( ( rule__AmbienteDespliegue__AmbienteAssignment_3_1 ) ) ;
    public final void rule__AmbienteDespliegue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2214:1: ( ( ( rule__AmbienteDespliegue__AmbienteAssignment_3_1 ) ) )
            // InternalCeffective.g:2215:1: ( ( rule__AmbienteDespliegue__AmbienteAssignment_3_1 ) )
            {
            // InternalCeffective.g:2215:1: ( ( rule__AmbienteDespliegue__AmbienteAssignment_3_1 ) )
            // InternalCeffective.g:2216:2: ( rule__AmbienteDespliegue__AmbienteAssignment_3_1 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getAmbienteAssignment_3_1()); 
            // InternalCeffective.g:2217:2: ( rule__AmbienteDespliegue__AmbienteAssignment_3_1 )
            // InternalCeffective.g:2217:3: rule__AmbienteDespliegue__AmbienteAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__AmbienteAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getAmbienteAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_3__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__0"
    // InternalCeffective.g:2226:1: rule__AmbienteDespliegue__Group_4__0 : rule__AmbienteDespliegue__Group_4__0__Impl rule__AmbienteDespliegue__Group_4__1 ;
    public final void rule__AmbienteDespliegue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2230:1: ( rule__AmbienteDespliegue__Group_4__0__Impl rule__AmbienteDespliegue__Group_4__1 )
            // InternalCeffective.g:2231:2: rule__AmbienteDespliegue__Group_4__0__Impl rule__AmbienteDespliegue__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__AmbienteDespliegue__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__0__Impl"
    // InternalCeffective.g:2238:1: rule__AmbienteDespliegue__Group_4__0__Impl : ( 'recursos' ) ;
    public final void rule__AmbienteDespliegue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2242:1: ( ( 'recursos' ) )
            // InternalCeffective.g:2243:1: ( 'recursos' )
            {
            // InternalCeffective.g:2243:1: ( 'recursos' )
            // InternalCeffective.g:2244:2: 'recursos'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__1"
    // InternalCeffective.g:2253:1: rule__AmbienteDespliegue__Group_4__1 : rule__AmbienteDespliegue__Group_4__1__Impl rule__AmbienteDespliegue__Group_4__2 ;
    public final void rule__AmbienteDespliegue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2257:1: ( rule__AmbienteDespliegue__Group_4__1__Impl rule__AmbienteDespliegue__Group_4__2 )
            // InternalCeffective.g:2258:2: rule__AmbienteDespliegue__Group_4__1__Impl rule__AmbienteDespliegue__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__AmbienteDespliegue__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__1__Impl"
    // InternalCeffective.g:2265:1: rule__AmbienteDespliegue__Group_4__1__Impl : ( '(' ) ;
    public final void rule__AmbienteDespliegue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2269:1: ( ( '(' ) )
            // InternalCeffective.g:2270:1: ( '(' )
            {
            // InternalCeffective.g:2270:1: ( '(' )
            // InternalCeffective.g:2271:2: '('
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__1__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__2"
    // InternalCeffective.g:2280:1: rule__AmbienteDespliegue__Group_4__2 : rule__AmbienteDespliegue__Group_4__2__Impl rule__AmbienteDespliegue__Group_4__3 ;
    public final void rule__AmbienteDespliegue__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2284:1: ( rule__AmbienteDespliegue__Group_4__2__Impl rule__AmbienteDespliegue__Group_4__3 )
            // InternalCeffective.g:2285:2: rule__AmbienteDespliegue__Group_4__2__Impl rule__AmbienteDespliegue__Group_4__3
            {
            pushFollow(FOLLOW_20);
            rule__AmbienteDespliegue__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__2"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__2__Impl"
    // InternalCeffective.g:2292:1: rule__AmbienteDespliegue__Group_4__2__Impl : ( ( rule__AmbienteDespliegue__RecursosAssignment_4_2 ) ) ;
    public final void rule__AmbienteDespliegue__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2296:1: ( ( ( rule__AmbienteDespliegue__RecursosAssignment_4_2 ) ) )
            // InternalCeffective.g:2297:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_4_2 ) )
            {
            // InternalCeffective.g:2297:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_4_2 ) )
            // InternalCeffective.g:2298:2: ( rule__AmbienteDespliegue__RecursosAssignment_4_2 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_4_2()); 
            // InternalCeffective.g:2299:2: ( rule__AmbienteDespliegue__RecursosAssignment_4_2 )
            // InternalCeffective.g:2299:3: rule__AmbienteDespliegue__RecursosAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__RecursosAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__2__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__3"
    // InternalCeffective.g:2307:1: rule__AmbienteDespliegue__Group_4__3 : rule__AmbienteDespliegue__Group_4__3__Impl rule__AmbienteDespliegue__Group_4__4 ;
    public final void rule__AmbienteDespliegue__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2311:1: ( rule__AmbienteDespliegue__Group_4__3__Impl rule__AmbienteDespliegue__Group_4__4 )
            // InternalCeffective.g:2312:2: rule__AmbienteDespliegue__Group_4__3__Impl rule__AmbienteDespliegue__Group_4__4
            {
            pushFollow(FOLLOW_20);
            rule__AmbienteDespliegue__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__3"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__3__Impl"
    // InternalCeffective.g:2319:1: rule__AmbienteDespliegue__Group_4__3__Impl : ( ( rule__AmbienteDespliegue__Group_4_3__0 )* ) ;
    public final void rule__AmbienteDespliegue__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2323:1: ( ( ( rule__AmbienteDespliegue__Group_4_3__0 )* ) )
            // InternalCeffective.g:2324:1: ( ( rule__AmbienteDespliegue__Group_4_3__0 )* )
            {
            // InternalCeffective.g:2324:1: ( ( rule__AmbienteDespliegue__Group_4_3__0 )* )
            // InternalCeffective.g:2325:2: ( rule__AmbienteDespliegue__Group_4_3__0 )*
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getGroup_4_3()); 
            // InternalCeffective.g:2326:2: ( rule__AmbienteDespliegue__Group_4_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCeffective.g:2326:3: rule__AmbienteDespliegue__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AmbienteDespliegue__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAmbienteDespliegueAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__3__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__4"
    // InternalCeffective.g:2334:1: rule__AmbienteDespliegue__Group_4__4 : rule__AmbienteDespliegue__Group_4__4__Impl ;
    public final void rule__AmbienteDespliegue__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2338:1: ( rule__AmbienteDespliegue__Group_4__4__Impl )
            // InternalCeffective.g:2339:2: rule__AmbienteDespliegue__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__4"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4__4__Impl"
    // InternalCeffective.g:2345:1: rule__AmbienteDespliegue__Group_4__4__Impl : ( ')' ) ;
    public final void rule__AmbienteDespliegue__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2349:1: ( ( ')' ) )
            // InternalCeffective.g:2350:1: ( ')' )
            {
            // InternalCeffective.g:2350:1: ( ')' )
            // InternalCeffective.g:2351:2: ')'
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRightParenthesisKeyword_4_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4__4__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4_3__0"
    // InternalCeffective.g:2361:1: rule__AmbienteDespliegue__Group_4_3__0 : rule__AmbienteDespliegue__Group_4_3__0__Impl rule__AmbienteDespliegue__Group_4_3__1 ;
    public final void rule__AmbienteDespliegue__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2365:1: ( rule__AmbienteDespliegue__Group_4_3__0__Impl rule__AmbienteDespliegue__Group_4_3__1 )
            // InternalCeffective.g:2366:2: rule__AmbienteDespliegue__Group_4_3__0__Impl rule__AmbienteDespliegue__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AmbienteDespliegue__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4_3__0"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4_3__0__Impl"
    // InternalCeffective.g:2373:1: rule__AmbienteDespliegue__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__AmbienteDespliegue__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2377:1: ( ( ',' ) )
            // InternalCeffective.g:2378:1: ( ',' )
            {
            // InternalCeffective.g:2378:1: ( ',' )
            // InternalCeffective.g:2379:2: ','
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_4_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4_3__0__Impl"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4_3__1"
    // InternalCeffective.g:2388:1: rule__AmbienteDespliegue__Group_4_3__1 : rule__AmbienteDespliegue__Group_4_3__1__Impl ;
    public final void rule__AmbienteDespliegue__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2392:1: ( rule__AmbienteDespliegue__Group_4_3__1__Impl )
            // InternalCeffective.g:2393:2: rule__AmbienteDespliegue__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4_3__1"


    // $ANTLR start "rule__AmbienteDespliegue__Group_4_3__1__Impl"
    // InternalCeffective.g:2399:1: rule__AmbienteDespliegue__Group_4_3__1__Impl : ( ( rule__AmbienteDespliegue__RecursosAssignment_4_3_1 ) ) ;
    public final void rule__AmbienteDespliegue__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2403:1: ( ( ( rule__AmbienteDespliegue__RecursosAssignment_4_3_1 ) ) )
            // InternalCeffective.g:2404:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_4_3_1 ) )
            {
            // InternalCeffective.g:2404:1: ( ( rule__AmbienteDespliegue__RecursosAssignment_4_3_1 ) )
            // InternalCeffective.g:2405:2: ( rule__AmbienteDespliegue__RecursosAssignment_4_3_1 )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_4_3_1()); 
            // InternalCeffective.g:2406:2: ( rule__AmbienteDespliegue__RecursosAssignment_4_3_1 )
            // InternalCeffective.g:2406:3: rule__AmbienteDespliegue__RecursosAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDespliegue__RecursosAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__Group_4_3__1__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__0"
    // InternalCeffective.g:2415:1: rule__AutenticacionBasica__Group__0 : rule__AutenticacionBasica__Group__0__Impl rule__AutenticacionBasica__Group__1 ;
    public final void rule__AutenticacionBasica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2419:1: ( rule__AutenticacionBasica__Group__0__Impl rule__AutenticacionBasica__Group__1 )
            // InternalCeffective.g:2420:2: rule__AutenticacionBasica__Group__0__Impl rule__AutenticacionBasica__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__AutenticacionBasica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__0"


    // $ANTLR start "rule__AutenticacionBasica__Group__0__Impl"
    // InternalCeffective.g:2427:1: rule__AutenticacionBasica__Group__0__Impl : ( () ) ;
    public final void rule__AutenticacionBasica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2431:1: ( ( () ) )
            // InternalCeffective.g:2432:1: ( () )
            {
            // InternalCeffective.g:2432:1: ( () )
            // InternalCeffective.g:2433:2: ()
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaAction_0()); 
            // InternalCeffective.g:2434:2: ()
            // InternalCeffective.g:2434:3: 
            {
            }

             after(grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__0__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__1"
    // InternalCeffective.g:2442:1: rule__AutenticacionBasica__Group__1 : rule__AutenticacionBasica__Group__1__Impl rule__AutenticacionBasica__Group__2 ;
    public final void rule__AutenticacionBasica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2446:1: ( rule__AutenticacionBasica__Group__1__Impl rule__AutenticacionBasica__Group__2 )
            // InternalCeffective.g:2447:2: rule__AutenticacionBasica__Group__1__Impl rule__AutenticacionBasica__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AutenticacionBasica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__1"


    // $ANTLR start "rule__AutenticacionBasica__Group__1__Impl"
    // InternalCeffective.g:2454:1: rule__AutenticacionBasica__Group__1__Impl : ( 'AutenticacionBasica' ) ;
    public final void rule__AutenticacionBasica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2458:1: ( ( 'AutenticacionBasica' ) )
            // InternalCeffective.g:2459:1: ( 'AutenticacionBasica' )
            {
            // InternalCeffective.g:2459:1: ( 'AutenticacionBasica' )
            // InternalCeffective.g:2460:2: 'AutenticacionBasica'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__1__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__2"
    // InternalCeffective.g:2469:1: rule__AutenticacionBasica__Group__2 : rule__AutenticacionBasica__Group__2__Impl rule__AutenticacionBasica__Group__3 ;
    public final void rule__AutenticacionBasica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2473:1: ( rule__AutenticacionBasica__Group__2__Impl rule__AutenticacionBasica__Group__3 )
            // InternalCeffective.g:2474:2: rule__AutenticacionBasica__Group__2__Impl rule__AutenticacionBasica__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__AutenticacionBasica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__2"


    // $ANTLR start "rule__AutenticacionBasica__Group__2__Impl"
    // InternalCeffective.g:2481:1: rule__AutenticacionBasica__Group__2__Impl : ( '{' ) ;
    public final void rule__AutenticacionBasica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2485:1: ( ( '{' ) )
            // InternalCeffective.g:2486:1: ( '{' )
            {
            // InternalCeffective.g:2486:1: ( '{' )
            // InternalCeffective.g:2487:2: '{'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__2__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__3"
    // InternalCeffective.g:2496:1: rule__AutenticacionBasica__Group__3 : rule__AutenticacionBasica__Group__3__Impl rule__AutenticacionBasica__Group__4 ;
    public final void rule__AutenticacionBasica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2500:1: ( rule__AutenticacionBasica__Group__3__Impl rule__AutenticacionBasica__Group__4 )
            // InternalCeffective.g:2501:2: rule__AutenticacionBasica__Group__3__Impl rule__AutenticacionBasica__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__AutenticacionBasica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__3"


    // $ANTLR start "rule__AutenticacionBasica__Group__3__Impl"
    // InternalCeffective.g:2508:1: rule__AutenticacionBasica__Group__3__Impl : ( ( rule__AutenticacionBasica__Group_3__0 )? ) ;
    public final void rule__AutenticacionBasica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2512:1: ( ( ( rule__AutenticacionBasica__Group_3__0 )? ) )
            // InternalCeffective.g:2513:1: ( ( rule__AutenticacionBasica__Group_3__0 )? )
            {
            // InternalCeffective.g:2513:1: ( ( rule__AutenticacionBasica__Group_3__0 )? )
            // InternalCeffective.g:2514:2: ( rule__AutenticacionBasica__Group_3__0 )?
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getGroup_3()); 
            // InternalCeffective.g:2515:2: ( rule__AutenticacionBasica__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCeffective.g:2515:3: rule__AutenticacionBasica__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionBasica__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionBasicaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__3__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__4"
    // InternalCeffective.g:2523:1: rule__AutenticacionBasica__Group__4 : rule__AutenticacionBasica__Group__4__Impl rule__AutenticacionBasica__Group__5 ;
    public final void rule__AutenticacionBasica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2527:1: ( rule__AutenticacionBasica__Group__4__Impl rule__AutenticacionBasica__Group__5 )
            // InternalCeffective.g:2528:2: rule__AutenticacionBasica__Group__4__Impl rule__AutenticacionBasica__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__AutenticacionBasica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__4"


    // $ANTLR start "rule__AutenticacionBasica__Group__4__Impl"
    // InternalCeffective.g:2535:1: rule__AutenticacionBasica__Group__4__Impl : ( ( rule__AutenticacionBasica__Group_4__0 )? ) ;
    public final void rule__AutenticacionBasica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2539:1: ( ( ( rule__AutenticacionBasica__Group_4__0 )? ) )
            // InternalCeffective.g:2540:1: ( ( rule__AutenticacionBasica__Group_4__0 )? )
            {
            // InternalCeffective.g:2540:1: ( ( rule__AutenticacionBasica__Group_4__0 )? )
            // InternalCeffective.g:2541:2: ( rule__AutenticacionBasica__Group_4__0 )?
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getGroup_4()); 
            // InternalCeffective.g:2542:2: ( rule__AutenticacionBasica__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCeffective.g:2542:3: rule__AutenticacionBasica__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionBasica__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionBasicaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__4__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__5"
    // InternalCeffective.g:2550:1: rule__AutenticacionBasica__Group__5 : rule__AutenticacionBasica__Group__5__Impl rule__AutenticacionBasica__Group__6 ;
    public final void rule__AutenticacionBasica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2554:1: ( rule__AutenticacionBasica__Group__5__Impl rule__AutenticacionBasica__Group__6 )
            // InternalCeffective.g:2555:2: rule__AutenticacionBasica__Group__5__Impl rule__AutenticacionBasica__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__AutenticacionBasica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__5"


    // $ANTLR start "rule__AutenticacionBasica__Group__5__Impl"
    // InternalCeffective.g:2562:1: rule__AutenticacionBasica__Group__5__Impl : ( ( rule__AutenticacionBasica__Group_5__0 )? ) ;
    public final void rule__AutenticacionBasica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2566:1: ( ( ( rule__AutenticacionBasica__Group_5__0 )? ) )
            // InternalCeffective.g:2567:1: ( ( rule__AutenticacionBasica__Group_5__0 )? )
            {
            // InternalCeffective.g:2567:1: ( ( rule__AutenticacionBasica__Group_5__0 )? )
            // InternalCeffective.g:2568:2: ( rule__AutenticacionBasica__Group_5__0 )?
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getGroup_5()); 
            // InternalCeffective.g:2569:2: ( rule__AutenticacionBasica__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCeffective.g:2569:3: rule__AutenticacionBasica__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionBasica__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionBasicaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__5__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__6"
    // InternalCeffective.g:2577:1: rule__AutenticacionBasica__Group__6 : rule__AutenticacionBasica__Group__6__Impl ;
    public final void rule__AutenticacionBasica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2581:1: ( rule__AutenticacionBasica__Group__6__Impl )
            // InternalCeffective.g:2582:2: rule__AutenticacionBasica__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__6"


    // $ANTLR start "rule__AutenticacionBasica__Group__6__Impl"
    // InternalCeffective.g:2588:1: rule__AutenticacionBasica__Group__6__Impl : ( '}' ) ;
    public final void rule__AutenticacionBasica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2592:1: ( ( '}' ) )
            // InternalCeffective.g:2593:1: ( '}' )
            {
            // InternalCeffective.g:2593:1: ( '}' )
            // InternalCeffective.g:2594:2: '}'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__6__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_3__0"
    // InternalCeffective.g:2604:1: rule__AutenticacionBasica__Group_3__0 : rule__AutenticacionBasica__Group_3__0__Impl rule__AutenticacionBasica__Group_3__1 ;
    public final void rule__AutenticacionBasica__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2608:1: ( rule__AutenticacionBasica__Group_3__0__Impl rule__AutenticacionBasica__Group_3__1 )
            // InternalCeffective.g:2609:2: rule__AutenticacionBasica__Group_3__0__Impl rule__AutenticacionBasica__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionBasica__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_3__0"


    // $ANTLR start "rule__AutenticacionBasica__Group_3__0__Impl"
    // InternalCeffective.g:2616:1: rule__AutenticacionBasica__Group_3__0__Impl : ( 'usuario' ) ;
    public final void rule__AutenticacionBasica__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2620:1: ( ( 'usuario' ) )
            // InternalCeffective.g:2621:1: ( 'usuario' )
            {
            // InternalCeffective.g:2621:1: ( 'usuario' )
            // InternalCeffective.g:2622:2: 'usuario'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getUsuarioKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getUsuarioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_3__0__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_3__1"
    // InternalCeffective.g:2631:1: rule__AutenticacionBasica__Group_3__1 : rule__AutenticacionBasica__Group_3__1__Impl ;
    public final void rule__AutenticacionBasica__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2635:1: ( rule__AutenticacionBasica__Group_3__1__Impl )
            // InternalCeffective.g:2636:2: rule__AutenticacionBasica__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_3__1"


    // $ANTLR start "rule__AutenticacionBasica__Group_3__1__Impl"
    // InternalCeffective.g:2642:1: rule__AutenticacionBasica__Group_3__1__Impl : ( ( rule__AutenticacionBasica__UsuarioAssignment_3_1 ) ) ;
    public final void rule__AutenticacionBasica__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2646:1: ( ( ( rule__AutenticacionBasica__UsuarioAssignment_3_1 ) ) )
            // InternalCeffective.g:2647:1: ( ( rule__AutenticacionBasica__UsuarioAssignment_3_1 ) )
            {
            // InternalCeffective.g:2647:1: ( ( rule__AutenticacionBasica__UsuarioAssignment_3_1 ) )
            // InternalCeffective.g:2648:2: ( rule__AutenticacionBasica__UsuarioAssignment_3_1 )
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getUsuarioAssignment_3_1()); 
            // InternalCeffective.g:2649:2: ( rule__AutenticacionBasica__UsuarioAssignment_3_1 )
            // InternalCeffective.g:2649:3: rule__AutenticacionBasica__UsuarioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__UsuarioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionBasicaAccess().getUsuarioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_3__1__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_4__0"
    // InternalCeffective.g:2658:1: rule__AutenticacionBasica__Group_4__0 : rule__AutenticacionBasica__Group_4__0__Impl rule__AutenticacionBasica__Group_4__1 ;
    public final void rule__AutenticacionBasica__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2662:1: ( rule__AutenticacionBasica__Group_4__0__Impl rule__AutenticacionBasica__Group_4__1 )
            // InternalCeffective.g:2663:2: rule__AutenticacionBasica__Group_4__0__Impl rule__AutenticacionBasica__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionBasica__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_4__0"


    // $ANTLR start "rule__AutenticacionBasica__Group_4__0__Impl"
    // InternalCeffective.g:2670:1: rule__AutenticacionBasica__Group_4__0__Impl : ( 'correo' ) ;
    public final void rule__AutenticacionBasica__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2674:1: ( ( 'correo' ) )
            // InternalCeffective.g:2675:1: ( 'correo' )
            {
            // InternalCeffective.g:2675:1: ( 'correo' )
            // InternalCeffective.g:2676:2: 'correo'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getCorreoKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getCorreoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_4__0__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_4__1"
    // InternalCeffective.g:2685:1: rule__AutenticacionBasica__Group_4__1 : rule__AutenticacionBasica__Group_4__1__Impl ;
    public final void rule__AutenticacionBasica__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2689:1: ( rule__AutenticacionBasica__Group_4__1__Impl )
            // InternalCeffective.g:2690:2: rule__AutenticacionBasica__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_4__1"


    // $ANTLR start "rule__AutenticacionBasica__Group_4__1__Impl"
    // InternalCeffective.g:2696:1: rule__AutenticacionBasica__Group_4__1__Impl : ( ( rule__AutenticacionBasica__CorreoAssignment_4_1 ) ) ;
    public final void rule__AutenticacionBasica__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2700:1: ( ( ( rule__AutenticacionBasica__CorreoAssignment_4_1 ) ) )
            // InternalCeffective.g:2701:1: ( ( rule__AutenticacionBasica__CorreoAssignment_4_1 ) )
            {
            // InternalCeffective.g:2701:1: ( ( rule__AutenticacionBasica__CorreoAssignment_4_1 ) )
            // InternalCeffective.g:2702:2: ( rule__AutenticacionBasica__CorreoAssignment_4_1 )
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getCorreoAssignment_4_1()); 
            // InternalCeffective.g:2703:2: ( rule__AutenticacionBasica__CorreoAssignment_4_1 )
            // InternalCeffective.g:2703:3: rule__AutenticacionBasica__CorreoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__CorreoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionBasicaAccess().getCorreoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_4__1__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_5__0"
    // InternalCeffective.g:2712:1: rule__AutenticacionBasica__Group_5__0 : rule__AutenticacionBasica__Group_5__0__Impl rule__AutenticacionBasica__Group_5__1 ;
    public final void rule__AutenticacionBasica__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2716:1: ( rule__AutenticacionBasica__Group_5__0__Impl rule__AutenticacionBasica__Group_5__1 )
            // InternalCeffective.g:2717:2: rule__AutenticacionBasica__Group_5__0__Impl rule__AutenticacionBasica__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionBasica__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_5__0"


    // $ANTLR start "rule__AutenticacionBasica__Group_5__0__Impl"
    // InternalCeffective.g:2724:1: rule__AutenticacionBasica__Group_5__0__Impl : ( 'password' ) ;
    public final void rule__AutenticacionBasica__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2728:1: ( ( 'password' ) )
            // InternalCeffective.g:2729:1: ( 'password' )
            {
            // InternalCeffective.g:2729:1: ( 'password' )
            // InternalCeffective.g:2730:2: 'password'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getPasswordKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getPasswordKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_5__0__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_5__1"
    // InternalCeffective.g:2739:1: rule__AutenticacionBasica__Group_5__1 : rule__AutenticacionBasica__Group_5__1__Impl ;
    public final void rule__AutenticacionBasica__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2743:1: ( rule__AutenticacionBasica__Group_5__1__Impl )
            // InternalCeffective.g:2744:2: rule__AutenticacionBasica__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_5__1"


    // $ANTLR start "rule__AutenticacionBasica__Group_5__1__Impl"
    // InternalCeffective.g:2750:1: rule__AutenticacionBasica__Group_5__1__Impl : ( ( rule__AutenticacionBasica__PasswordAssignment_5_1 ) ) ;
    public final void rule__AutenticacionBasica__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2754:1: ( ( ( rule__AutenticacionBasica__PasswordAssignment_5_1 ) ) )
            // InternalCeffective.g:2755:1: ( ( rule__AutenticacionBasica__PasswordAssignment_5_1 ) )
            {
            // InternalCeffective.g:2755:1: ( ( rule__AutenticacionBasica__PasswordAssignment_5_1 ) )
            // InternalCeffective.g:2756:2: ( rule__AutenticacionBasica__PasswordAssignment_5_1 )
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getPasswordAssignment_5_1()); 
            // InternalCeffective.g:2757:2: ( rule__AutenticacionBasica__PasswordAssignment_5_1 )
            // InternalCeffective.g:2757:3: rule__AutenticacionBasica__PasswordAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__PasswordAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionBasicaAccess().getPasswordAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_5__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__0"
    // InternalCeffective.g:2766:1: rule__AutenticacionFirma__Group__0 : rule__AutenticacionFirma__Group__0__Impl rule__AutenticacionFirma__Group__1 ;
    public final void rule__AutenticacionFirma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2770:1: ( rule__AutenticacionFirma__Group__0__Impl rule__AutenticacionFirma__Group__1 )
            // InternalCeffective.g:2771:2: rule__AutenticacionFirma__Group__0__Impl rule__AutenticacionFirma__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AutenticacionFirma__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__0"


    // $ANTLR start "rule__AutenticacionFirma__Group__0__Impl"
    // InternalCeffective.g:2778:1: rule__AutenticacionFirma__Group__0__Impl : ( () ) ;
    public final void rule__AutenticacionFirma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2782:1: ( ( () ) )
            // InternalCeffective.g:2783:1: ( () )
            {
            // InternalCeffective.g:2783:1: ( () )
            // InternalCeffective.g:2784:2: ()
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaAction_0()); 
            // InternalCeffective.g:2785:2: ()
            // InternalCeffective.g:2785:3: 
            {
            }

             after(grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__1"
    // InternalCeffective.g:2793:1: rule__AutenticacionFirma__Group__1 : rule__AutenticacionFirma__Group__1__Impl rule__AutenticacionFirma__Group__2 ;
    public final void rule__AutenticacionFirma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2797:1: ( rule__AutenticacionFirma__Group__1__Impl rule__AutenticacionFirma__Group__2 )
            // InternalCeffective.g:2798:2: rule__AutenticacionFirma__Group__1__Impl rule__AutenticacionFirma__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AutenticacionFirma__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__1"


    // $ANTLR start "rule__AutenticacionFirma__Group__1__Impl"
    // InternalCeffective.g:2805:1: rule__AutenticacionFirma__Group__1__Impl : ( 'AutenticacionFirma' ) ;
    public final void rule__AutenticacionFirma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2809:1: ( ( 'AutenticacionFirma' ) )
            // InternalCeffective.g:2810:1: ( 'AutenticacionFirma' )
            {
            // InternalCeffective.g:2810:1: ( 'AutenticacionFirma' )
            // InternalCeffective.g:2811:2: 'AutenticacionFirma'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__2"
    // InternalCeffective.g:2820:1: rule__AutenticacionFirma__Group__2 : rule__AutenticacionFirma__Group__2__Impl rule__AutenticacionFirma__Group__3 ;
    public final void rule__AutenticacionFirma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2824:1: ( rule__AutenticacionFirma__Group__2__Impl rule__AutenticacionFirma__Group__3 )
            // InternalCeffective.g:2825:2: rule__AutenticacionFirma__Group__2__Impl rule__AutenticacionFirma__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__AutenticacionFirma__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__2"


    // $ANTLR start "rule__AutenticacionFirma__Group__2__Impl"
    // InternalCeffective.g:2832:1: rule__AutenticacionFirma__Group__2__Impl : ( '{' ) ;
    public final void rule__AutenticacionFirma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2836:1: ( ( '{' ) )
            // InternalCeffective.g:2837:1: ( '{' )
            {
            // InternalCeffective.g:2837:1: ( '{' )
            // InternalCeffective.g:2838:2: '{'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__2__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__3"
    // InternalCeffective.g:2847:1: rule__AutenticacionFirma__Group__3 : rule__AutenticacionFirma__Group__3__Impl rule__AutenticacionFirma__Group__4 ;
    public final void rule__AutenticacionFirma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2851:1: ( rule__AutenticacionFirma__Group__3__Impl rule__AutenticacionFirma__Group__4 )
            // InternalCeffective.g:2852:2: rule__AutenticacionFirma__Group__3__Impl rule__AutenticacionFirma__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__AutenticacionFirma__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__3"


    // $ANTLR start "rule__AutenticacionFirma__Group__3__Impl"
    // InternalCeffective.g:2859:1: rule__AutenticacionFirma__Group__3__Impl : ( ( rule__AutenticacionFirma__Group_3__0 )? ) ;
    public final void rule__AutenticacionFirma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2863:1: ( ( ( rule__AutenticacionFirma__Group_3__0 )? ) )
            // InternalCeffective.g:2864:1: ( ( rule__AutenticacionFirma__Group_3__0 )? )
            {
            // InternalCeffective.g:2864:1: ( ( rule__AutenticacionFirma__Group_3__0 )? )
            // InternalCeffective.g:2865:2: ( rule__AutenticacionFirma__Group_3__0 )?
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup_3()); 
            // InternalCeffective.g:2866:2: ( rule__AutenticacionFirma__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCeffective.g:2866:3: rule__AutenticacionFirma__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionFirma__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__3__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__4"
    // InternalCeffective.g:2874:1: rule__AutenticacionFirma__Group__4 : rule__AutenticacionFirma__Group__4__Impl rule__AutenticacionFirma__Group__5 ;
    public final void rule__AutenticacionFirma__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2878:1: ( rule__AutenticacionFirma__Group__4__Impl rule__AutenticacionFirma__Group__5 )
            // InternalCeffective.g:2879:2: rule__AutenticacionFirma__Group__4__Impl rule__AutenticacionFirma__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__AutenticacionFirma__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__4"


    // $ANTLR start "rule__AutenticacionFirma__Group__4__Impl"
    // InternalCeffective.g:2886:1: rule__AutenticacionFirma__Group__4__Impl : ( ( rule__AutenticacionFirma__Group_4__0 )? ) ;
    public final void rule__AutenticacionFirma__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2890:1: ( ( ( rule__AutenticacionFirma__Group_4__0 )? ) )
            // InternalCeffective.g:2891:1: ( ( rule__AutenticacionFirma__Group_4__0 )? )
            {
            // InternalCeffective.g:2891:1: ( ( rule__AutenticacionFirma__Group_4__0 )? )
            // InternalCeffective.g:2892:2: ( rule__AutenticacionFirma__Group_4__0 )?
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup_4()); 
            // InternalCeffective.g:2893:2: ( rule__AutenticacionFirma__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCeffective.g:2893:3: rule__AutenticacionFirma__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionFirma__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__4__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__5"
    // InternalCeffective.g:2901:1: rule__AutenticacionFirma__Group__5 : rule__AutenticacionFirma__Group__5__Impl rule__AutenticacionFirma__Group__6 ;
    public final void rule__AutenticacionFirma__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2905:1: ( rule__AutenticacionFirma__Group__5__Impl rule__AutenticacionFirma__Group__6 )
            // InternalCeffective.g:2906:2: rule__AutenticacionFirma__Group__5__Impl rule__AutenticacionFirma__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__AutenticacionFirma__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__5"


    // $ANTLR start "rule__AutenticacionFirma__Group__5__Impl"
    // InternalCeffective.g:2913:1: rule__AutenticacionFirma__Group__5__Impl : ( ( rule__AutenticacionFirma__Group_5__0 )? ) ;
    public final void rule__AutenticacionFirma__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2917:1: ( ( ( rule__AutenticacionFirma__Group_5__0 )? ) )
            // InternalCeffective.g:2918:1: ( ( rule__AutenticacionFirma__Group_5__0 )? )
            {
            // InternalCeffective.g:2918:1: ( ( rule__AutenticacionFirma__Group_5__0 )? )
            // InternalCeffective.g:2919:2: ( rule__AutenticacionFirma__Group_5__0 )?
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup_5()); 
            // InternalCeffective.g:2920:2: ( rule__AutenticacionFirma__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCeffective.g:2920:3: rule__AutenticacionFirma__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionFirma__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__5__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__6"
    // InternalCeffective.g:2928:1: rule__AutenticacionFirma__Group__6 : rule__AutenticacionFirma__Group__6__Impl rule__AutenticacionFirma__Group__7 ;
    public final void rule__AutenticacionFirma__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2932:1: ( rule__AutenticacionFirma__Group__6__Impl rule__AutenticacionFirma__Group__7 )
            // InternalCeffective.g:2933:2: rule__AutenticacionFirma__Group__6__Impl rule__AutenticacionFirma__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__AutenticacionFirma__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__6"


    // $ANTLR start "rule__AutenticacionFirma__Group__6__Impl"
    // InternalCeffective.g:2940:1: rule__AutenticacionFirma__Group__6__Impl : ( ( rule__AutenticacionFirma__Group_6__0 )? ) ;
    public final void rule__AutenticacionFirma__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2944:1: ( ( ( rule__AutenticacionFirma__Group_6__0 )? ) )
            // InternalCeffective.g:2945:1: ( ( rule__AutenticacionFirma__Group_6__0 )? )
            {
            // InternalCeffective.g:2945:1: ( ( rule__AutenticacionFirma__Group_6__0 )? )
            // InternalCeffective.g:2946:2: ( rule__AutenticacionFirma__Group_6__0 )?
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup_6()); 
            // InternalCeffective.g:2947:2: ( rule__AutenticacionFirma__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCeffective.g:2947:3: rule__AutenticacionFirma__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionFirma__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__6__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__7"
    // InternalCeffective.g:2955:1: rule__AutenticacionFirma__Group__7 : rule__AutenticacionFirma__Group__7__Impl ;
    public final void rule__AutenticacionFirma__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2959:1: ( rule__AutenticacionFirma__Group__7__Impl )
            // InternalCeffective.g:2960:2: rule__AutenticacionFirma__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__7"


    // $ANTLR start "rule__AutenticacionFirma__Group__7__Impl"
    // InternalCeffective.g:2966:1: rule__AutenticacionFirma__Group__7__Impl : ( '}' ) ;
    public final void rule__AutenticacionFirma__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2970:1: ( ( '}' ) )
            // InternalCeffective.g:2971:1: ( '}' )
            {
            // InternalCeffective.g:2971:1: ( '}' )
            // InternalCeffective.g:2972:2: '}'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__7__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_3__0"
    // InternalCeffective.g:2982:1: rule__AutenticacionFirma__Group_3__0 : rule__AutenticacionFirma__Group_3__0__Impl rule__AutenticacionFirma__Group_3__1 ;
    public final void rule__AutenticacionFirma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2986:1: ( rule__AutenticacionFirma__Group_3__0__Impl rule__AutenticacionFirma__Group_3__1 )
            // InternalCeffective.g:2987:2: rule__AutenticacionFirma__Group_3__0__Impl rule__AutenticacionFirma__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionFirma__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_3__0"


    // $ANTLR start "rule__AutenticacionFirma__Group_3__0__Impl"
    // InternalCeffective.g:2994:1: rule__AutenticacionFirma__Group_3__0__Impl : ( 'usuario' ) ;
    public final void rule__AutenticacionFirma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2998:1: ( ( 'usuario' ) )
            // InternalCeffective.g:2999:1: ( 'usuario' )
            {
            // InternalCeffective.g:2999:1: ( 'usuario' )
            // InternalCeffective.g:3000:2: 'usuario'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getUsuarioKeyword_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getUsuarioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_3__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_3__1"
    // InternalCeffective.g:3009:1: rule__AutenticacionFirma__Group_3__1 : rule__AutenticacionFirma__Group_3__1__Impl ;
    public final void rule__AutenticacionFirma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3013:1: ( rule__AutenticacionFirma__Group_3__1__Impl )
            // InternalCeffective.g:3014:2: rule__AutenticacionFirma__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_3__1"


    // $ANTLR start "rule__AutenticacionFirma__Group_3__1__Impl"
    // InternalCeffective.g:3020:1: rule__AutenticacionFirma__Group_3__1__Impl : ( ( rule__AutenticacionFirma__UsuarioAssignment_3_1 ) ) ;
    public final void rule__AutenticacionFirma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3024:1: ( ( ( rule__AutenticacionFirma__UsuarioAssignment_3_1 ) ) )
            // InternalCeffective.g:3025:1: ( ( rule__AutenticacionFirma__UsuarioAssignment_3_1 ) )
            {
            // InternalCeffective.g:3025:1: ( ( rule__AutenticacionFirma__UsuarioAssignment_3_1 ) )
            // InternalCeffective.g:3026:2: ( rule__AutenticacionFirma__UsuarioAssignment_3_1 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getUsuarioAssignment_3_1()); 
            // InternalCeffective.g:3027:2: ( rule__AutenticacionFirma__UsuarioAssignment_3_1 )
            // InternalCeffective.g:3027:3: rule__AutenticacionFirma__UsuarioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__UsuarioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getUsuarioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_3__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_4__0"
    // InternalCeffective.g:3036:1: rule__AutenticacionFirma__Group_4__0 : rule__AutenticacionFirma__Group_4__0__Impl rule__AutenticacionFirma__Group_4__1 ;
    public final void rule__AutenticacionFirma__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3040:1: ( rule__AutenticacionFirma__Group_4__0__Impl rule__AutenticacionFirma__Group_4__1 )
            // InternalCeffective.g:3041:2: rule__AutenticacionFirma__Group_4__0__Impl rule__AutenticacionFirma__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionFirma__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_4__0"


    // $ANTLR start "rule__AutenticacionFirma__Group_4__0__Impl"
    // InternalCeffective.g:3048:1: rule__AutenticacionFirma__Group_4__0__Impl : ( 'correo' ) ;
    public final void rule__AutenticacionFirma__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3052:1: ( ( 'correo' ) )
            // InternalCeffective.g:3053:1: ( 'correo' )
            {
            // InternalCeffective.g:3053:1: ( 'correo' )
            // InternalCeffective.g:3054:2: 'correo'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCorreoKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getCorreoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_4__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_4__1"
    // InternalCeffective.g:3063:1: rule__AutenticacionFirma__Group_4__1 : rule__AutenticacionFirma__Group_4__1__Impl ;
    public final void rule__AutenticacionFirma__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3067:1: ( rule__AutenticacionFirma__Group_4__1__Impl )
            // InternalCeffective.g:3068:2: rule__AutenticacionFirma__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_4__1"


    // $ANTLR start "rule__AutenticacionFirma__Group_4__1__Impl"
    // InternalCeffective.g:3074:1: rule__AutenticacionFirma__Group_4__1__Impl : ( ( rule__AutenticacionFirma__CorreoAssignment_4_1 ) ) ;
    public final void rule__AutenticacionFirma__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3078:1: ( ( ( rule__AutenticacionFirma__CorreoAssignment_4_1 ) ) )
            // InternalCeffective.g:3079:1: ( ( rule__AutenticacionFirma__CorreoAssignment_4_1 ) )
            {
            // InternalCeffective.g:3079:1: ( ( rule__AutenticacionFirma__CorreoAssignment_4_1 ) )
            // InternalCeffective.g:3080:2: ( rule__AutenticacionFirma__CorreoAssignment_4_1 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCorreoAssignment_4_1()); 
            // InternalCeffective.g:3081:2: ( rule__AutenticacionFirma__CorreoAssignment_4_1 )
            // InternalCeffective.g:3081:3: rule__AutenticacionFirma__CorreoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__CorreoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getCorreoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_4__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_5__0"
    // InternalCeffective.g:3090:1: rule__AutenticacionFirma__Group_5__0 : rule__AutenticacionFirma__Group_5__0__Impl rule__AutenticacionFirma__Group_5__1 ;
    public final void rule__AutenticacionFirma__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3094:1: ( rule__AutenticacionFirma__Group_5__0__Impl rule__AutenticacionFirma__Group_5__1 )
            // InternalCeffective.g:3095:2: rule__AutenticacionFirma__Group_5__0__Impl rule__AutenticacionFirma__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionFirma__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_5__0"


    // $ANTLR start "rule__AutenticacionFirma__Group_5__0__Impl"
    // InternalCeffective.g:3102:1: rule__AutenticacionFirma__Group_5__0__Impl : ( 'nombre' ) ;
    public final void rule__AutenticacionFirma__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3106:1: ( ( 'nombre' ) )
            // InternalCeffective.g:3107:1: ( 'nombre' )
            {
            // InternalCeffective.g:3107:1: ( 'nombre' )
            // InternalCeffective.g:3108:2: 'nombre'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getNombreKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_5__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_5__1"
    // InternalCeffective.g:3117:1: rule__AutenticacionFirma__Group_5__1 : rule__AutenticacionFirma__Group_5__1__Impl ;
    public final void rule__AutenticacionFirma__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3121:1: ( rule__AutenticacionFirma__Group_5__1__Impl )
            // InternalCeffective.g:3122:2: rule__AutenticacionFirma__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_5__1"


    // $ANTLR start "rule__AutenticacionFirma__Group_5__1__Impl"
    // InternalCeffective.g:3128:1: rule__AutenticacionFirma__Group_5__1__Impl : ( ( rule__AutenticacionFirma__NombreAssignment_5_1 ) ) ;
    public final void rule__AutenticacionFirma__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3132:1: ( ( ( rule__AutenticacionFirma__NombreAssignment_5_1 ) ) )
            // InternalCeffective.g:3133:1: ( ( rule__AutenticacionFirma__NombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:3133:1: ( ( rule__AutenticacionFirma__NombreAssignment_5_1 ) )
            // InternalCeffective.g:3134:2: ( rule__AutenticacionFirma__NombreAssignment_5_1 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getNombreAssignment_5_1()); 
            // InternalCeffective.g:3135:2: ( rule__AutenticacionFirma__NombreAssignment_5_1 )
            // InternalCeffective.g:3135:3: rule__AutenticacionFirma__NombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__NombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_5__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_6__0"
    // InternalCeffective.g:3144:1: rule__AutenticacionFirma__Group_6__0 : rule__AutenticacionFirma__Group_6__0__Impl rule__AutenticacionFirma__Group_6__1 ;
    public final void rule__AutenticacionFirma__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3148:1: ( rule__AutenticacionFirma__Group_6__0__Impl rule__AutenticacionFirma__Group_6__1 )
            // InternalCeffective.g:3149:2: rule__AutenticacionFirma__Group_6__0__Impl rule__AutenticacionFirma__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionFirma__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_6__0"


    // $ANTLR start "rule__AutenticacionFirma__Group_6__0__Impl"
    // InternalCeffective.g:3156:1: rule__AutenticacionFirma__Group_6__0__Impl : ( 'certificado' ) ;
    public final void rule__AutenticacionFirma__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3160:1: ( ( 'certificado' ) )
            // InternalCeffective.g:3161:1: ( 'certificado' )
            {
            // InternalCeffective.g:3161:1: ( 'certificado' )
            // InternalCeffective.g:3162:2: 'certificado'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCertificadoKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getCertificadoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_6__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_6__1"
    // InternalCeffective.g:3171:1: rule__AutenticacionFirma__Group_6__1 : rule__AutenticacionFirma__Group_6__1__Impl ;
    public final void rule__AutenticacionFirma__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3175:1: ( rule__AutenticacionFirma__Group_6__1__Impl )
            // InternalCeffective.g:3176:2: rule__AutenticacionFirma__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_6__1"


    // $ANTLR start "rule__AutenticacionFirma__Group_6__1__Impl"
    // InternalCeffective.g:3182:1: rule__AutenticacionFirma__Group_6__1__Impl : ( ( rule__AutenticacionFirma__CertificadoAssignment_6_1 ) ) ;
    public final void rule__AutenticacionFirma__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3186:1: ( ( ( rule__AutenticacionFirma__CertificadoAssignment_6_1 ) ) )
            // InternalCeffective.g:3187:1: ( ( rule__AutenticacionFirma__CertificadoAssignment_6_1 ) )
            {
            // InternalCeffective.g:3187:1: ( ( rule__AutenticacionFirma__CertificadoAssignment_6_1 ) )
            // InternalCeffective.g:3188:2: ( rule__AutenticacionFirma__CertificadoAssignment_6_1 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCertificadoAssignment_6_1()); 
            // InternalCeffective.g:3189:2: ( rule__AutenticacionFirma__CertificadoAssignment_6_1 )
            // InternalCeffective.g:3189:3: rule__AutenticacionFirma__CertificadoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__CertificadoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getCertificadoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_6__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__0"
    // InternalCeffective.g:3198:1: rule__ServidorAplicaciones__Group__0 : rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1 ;
    public final void rule__ServidorAplicaciones__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3202:1: ( rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1 )
            // InternalCeffective.g:3203:2: rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ServidorAplicaciones__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group__0__Impl"
    // InternalCeffective.g:3210:1: rule__ServidorAplicaciones__Group__0__Impl : ( () ) ;
    public final void rule__ServidorAplicaciones__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3214:1: ( ( () ) )
            // InternalCeffective.g:3215:1: ( () )
            {
            // InternalCeffective.g:3215:1: ( () )
            // InternalCeffective.g:3216:2: ()
            {
             before(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesAction_0()); 
            // InternalCeffective.g:3217:2: ()
            // InternalCeffective.g:3217:3: 
            {
            }

             after(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__1"
    // InternalCeffective.g:3225:1: rule__ServidorAplicaciones__Group__1 : rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2 ;
    public final void rule__ServidorAplicaciones__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3229:1: ( rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2 )
            // InternalCeffective.g:3230:2: rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAplicaciones__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group__1__Impl"
    // InternalCeffective.g:3237:1: rule__ServidorAplicaciones__Group__1__Impl : ( 'ServidorAplicaciones' ) ;
    public final void rule__ServidorAplicaciones__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3241:1: ( ( 'ServidorAplicaciones' ) )
            // InternalCeffective.g:3242:1: ( 'ServidorAplicaciones' )
            {
            // InternalCeffective.g:3242:1: ( 'ServidorAplicaciones' )
            // InternalCeffective.g:3243:2: 'ServidorAplicaciones'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__2"
    // InternalCeffective.g:3252:1: rule__ServidorAplicaciones__Group__2 : rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3 ;
    public final void rule__ServidorAplicaciones__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3256:1: ( rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3 )
            // InternalCeffective.g:3257:2: rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__2"


    // $ANTLR start "rule__ServidorAplicaciones__Group__2__Impl"
    // InternalCeffective.g:3264:1: rule__ServidorAplicaciones__Group__2__Impl : ( '{' ) ;
    public final void rule__ServidorAplicaciones__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3268:1: ( ( '{' ) )
            // InternalCeffective.g:3269:1: ( '{' )
            {
            // InternalCeffective.g:3269:1: ( '{' )
            // InternalCeffective.g:3270:2: '{'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__2__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__3"
    // InternalCeffective.g:3279:1: rule__ServidorAplicaciones__Group__3 : rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4 ;
    public final void rule__ServidorAplicaciones__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3283:1: ( rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4 )
            // InternalCeffective.g:3284:2: rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__3"


    // $ANTLR start "rule__ServidorAplicaciones__Group__3__Impl"
    // InternalCeffective.g:3291:1: rule__ServidorAplicaciones__Group__3__Impl : ( ( rule__ServidorAplicaciones__Group_3__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3295:1: ( ( ( rule__ServidorAplicaciones__Group_3__0 )? ) )
            // InternalCeffective.g:3296:1: ( ( rule__ServidorAplicaciones__Group_3__0 )? )
            {
            // InternalCeffective.g:3296:1: ( ( rule__ServidorAplicaciones__Group_3__0 )? )
            // InternalCeffective.g:3297:2: ( rule__ServidorAplicaciones__Group_3__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_3()); 
            // InternalCeffective.g:3298:2: ( rule__ServidorAplicaciones__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCeffective.g:3298:3: rule__ServidorAplicaciones__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__3__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__4"
    // InternalCeffective.g:3306:1: rule__ServidorAplicaciones__Group__4 : rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5 ;
    public final void rule__ServidorAplicaciones__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3310:1: ( rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5 )
            // InternalCeffective.g:3311:2: rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__4"


    // $ANTLR start "rule__ServidorAplicaciones__Group__4__Impl"
    // InternalCeffective.g:3318:1: rule__ServidorAplicaciones__Group__4__Impl : ( ( rule__ServidorAplicaciones__Group_4__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3322:1: ( ( ( rule__ServidorAplicaciones__Group_4__0 )? ) )
            // InternalCeffective.g:3323:1: ( ( rule__ServidorAplicaciones__Group_4__0 )? )
            {
            // InternalCeffective.g:3323:1: ( ( rule__ServidorAplicaciones__Group_4__0 )? )
            // InternalCeffective.g:3324:2: ( rule__ServidorAplicaciones__Group_4__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_4()); 
            // InternalCeffective.g:3325:2: ( rule__ServidorAplicaciones__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCeffective.g:3325:3: rule__ServidorAplicaciones__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__4__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__5"
    // InternalCeffective.g:3333:1: rule__ServidorAplicaciones__Group__5 : rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6 ;
    public final void rule__ServidorAplicaciones__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3337:1: ( rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6 )
            // InternalCeffective.g:3338:2: rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__5"


    // $ANTLR start "rule__ServidorAplicaciones__Group__5__Impl"
    // InternalCeffective.g:3345:1: rule__ServidorAplicaciones__Group__5__Impl : ( ( rule__ServidorAplicaciones__Group_5__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3349:1: ( ( ( rule__ServidorAplicaciones__Group_5__0 )? ) )
            // InternalCeffective.g:3350:1: ( ( rule__ServidorAplicaciones__Group_5__0 )? )
            {
            // InternalCeffective.g:3350:1: ( ( rule__ServidorAplicaciones__Group_5__0 )? )
            // InternalCeffective.g:3351:2: ( rule__ServidorAplicaciones__Group_5__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_5()); 
            // InternalCeffective.g:3352:2: ( rule__ServidorAplicaciones__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCeffective.g:3352:3: rule__ServidorAplicaciones__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__5__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__6"
    // InternalCeffective.g:3360:1: rule__ServidorAplicaciones__Group__6 : rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7 ;
    public final void rule__ServidorAplicaciones__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3364:1: ( rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7 )
            // InternalCeffective.g:3365:2: rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__6"


    // $ANTLR start "rule__ServidorAplicaciones__Group__6__Impl"
    // InternalCeffective.g:3372:1: rule__ServidorAplicaciones__Group__6__Impl : ( ( rule__ServidorAplicaciones__Group_6__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3376:1: ( ( ( rule__ServidorAplicaciones__Group_6__0 )? ) )
            // InternalCeffective.g:3377:1: ( ( rule__ServidorAplicaciones__Group_6__0 )? )
            {
            // InternalCeffective.g:3377:1: ( ( rule__ServidorAplicaciones__Group_6__0 )? )
            // InternalCeffective.g:3378:2: ( rule__ServidorAplicaciones__Group_6__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_6()); 
            // InternalCeffective.g:3379:2: ( rule__ServidorAplicaciones__Group_6__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCeffective.g:3379:3: rule__ServidorAplicaciones__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__6__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__7"
    // InternalCeffective.g:3387:1: rule__ServidorAplicaciones__Group__7 : rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8 ;
    public final void rule__ServidorAplicaciones__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3391:1: ( rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8 )
            // InternalCeffective.g:3392:2: rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__7"


    // $ANTLR start "rule__ServidorAplicaciones__Group__7__Impl"
    // InternalCeffective.g:3399:1: rule__ServidorAplicaciones__Group__7__Impl : ( ( rule__ServidorAplicaciones__Group_7__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3403:1: ( ( ( rule__ServidorAplicaciones__Group_7__0 )? ) )
            // InternalCeffective.g:3404:1: ( ( rule__ServidorAplicaciones__Group_7__0 )? )
            {
            // InternalCeffective.g:3404:1: ( ( rule__ServidorAplicaciones__Group_7__0 )? )
            // InternalCeffective.g:3405:2: ( rule__ServidorAplicaciones__Group_7__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_7()); 
            // InternalCeffective.g:3406:2: ( rule__ServidorAplicaciones__Group_7__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCeffective.g:3406:3: rule__ServidorAplicaciones__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__7__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__8"
    // InternalCeffective.g:3414:1: rule__ServidorAplicaciones__Group__8 : rule__ServidorAplicaciones__Group__8__Impl rule__ServidorAplicaciones__Group__9 ;
    public final void rule__ServidorAplicaciones__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3418:1: ( rule__ServidorAplicaciones__Group__8__Impl rule__ServidorAplicaciones__Group__9 )
            // InternalCeffective.g:3419:2: rule__ServidorAplicaciones__Group__8__Impl rule__ServidorAplicaciones__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__8"


    // $ANTLR start "rule__ServidorAplicaciones__Group__8__Impl"
    // InternalCeffective.g:3426:1: rule__ServidorAplicaciones__Group__8__Impl : ( ( rule__ServidorAplicaciones__Group_8__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3430:1: ( ( ( rule__ServidorAplicaciones__Group_8__0 )? ) )
            // InternalCeffective.g:3431:1: ( ( rule__ServidorAplicaciones__Group_8__0 )? )
            {
            // InternalCeffective.g:3431:1: ( ( rule__ServidorAplicaciones__Group_8__0 )? )
            // InternalCeffective.g:3432:2: ( rule__ServidorAplicaciones__Group_8__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_8()); 
            // InternalCeffective.g:3433:2: ( rule__ServidorAplicaciones__Group_8__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCeffective.g:3433:3: rule__ServidorAplicaciones__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__8__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__9"
    // InternalCeffective.g:3441:1: rule__ServidorAplicaciones__Group__9 : rule__ServidorAplicaciones__Group__9__Impl rule__ServidorAplicaciones__Group__10 ;
    public final void rule__ServidorAplicaciones__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3445:1: ( rule__ServidorAplicaciones__Group__9__Impl rule__ServidorAplicaciones__Group__10 )
            // InternalCeffective.g:3446:2: rule__ServidorAplicaciones__Group__9__Impl rule__ServidorAplicaciones__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAplicaciones__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__9"


    // $ANTLR start "rule__ServidorAplicaciones__Group__9__Impl"
    // InternalCeffective.g:3453:1: rule__ServidorAplicaciones__Group__9__Impl : ( ( rule__ServidorAplicaciones__Group_9__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3457:1: ( ( ( rule__ServidorAplicaciones__Group_9__0 )? ) )
            // InternalCeffective.g:3458:1: ( ( rule__ServidorAplicaciones__Group_9__0 )? )
            {
            // InternalCeffective.g:3458:1: ( ( rule__ServidorAplicaciones__Group_9__0 )? )
            // InternalCeffective.g:3459:2: ( rule__ServidorAplicaciones__Group_9__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_9()); 
            // InternalCeffective.g:3460:2: ( rule__ServidorAplicaciones__Group_9__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCeffective.g:3460:3: rule__ServidorAplicaciones__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__9__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__10"
    // InternalCeffective.g:3468:1: rule__ServidorAplicaciones__Group__10 : rule__ServidorAplicaciones__Group__10__Impl ;
    public final void rule__ServidorAplicaciones__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3472:1: ( rule__ServidorAplicaciones__Group__10__Impl )
            // InternalCeffective.g:3473:2: rule__ServidorAplicaciones__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__10"


    // $ANTLR start "rule__ServidorAplicaciones__Group__10__Impl"
    // InternalCeffective.g:3479:1: rule__ServidorAplicaciones__Group__10__Impl : ( '}' ) ;
    public final void rule__ServidorAplicaciones__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3483:1: ( ( '}' ) )
            // InternalCeffective.g:3484:1: ( '}' )
            {
            // InternalCeffective.g:3484:1: ( '}' )
            // InternalCeffective.g:3485:2: '}'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__10__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__0"
    // InternalCeffective.g:3495:1: rule__ServidorAplicaciones__Group_3__0 : rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1 ;
    public final void rule__ServidorAplicaciones__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3499:1: ( rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1 )
            // InternalCeffective.g:3500:2: rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__0__Impl"
    // InternalCeffective.g:3507:1: rule__ServidorAplicaciones__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorAplicaciones__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3511:1: ( ( 'nombre' ) )
            // InternalCeffective.g:3512:1: ( 'nombre' )
            {
            // InternalCeffective.g:3512:1: ( 'nombre' )
            // InternalCeffective.g:3513:2: 'nombre'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__1"
    // InternalCeffective.g:3522:1: rule__ServidorAplicaciones__Group_3__1 : rule__ServidorAplicaciones__Group_3__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3526:1: ( rule__ServidorAplicaciones__Group_3__1__Impl )
            // InternalCeffective.g:3527:2: rule__ServidorAplicaciones__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__1__Impl"
    // InternalCeffective.g:3533:1: rule__ServidorAplicaciones__Group_3__1__Impl : ( ( rule__ServidorAplicaciones__NombreAssignment_3_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3537:1: ( ( ( rule__ServidorAplicaciones__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:3538:1: ( ( rule__ServidorAplicaciones__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:3538:1: ( ( rule__ServidorAplicaciones__NombreAssignment_3_1 ) )
            // InternalCeffective.g:3539:2: ( rule__ServidorAplicaciones__NombreAssignment_3_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:3540:2: ( rule__ServidorAplicaciones__NombreAssignment_3_1 )
            // InternalCeffective.g:3540:3: rule__ServidorAplicaciones__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__0"
    // InternalCeffective.g:3549:1: rule__ServidorAplicaciones__Group_4__0 : rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1 ;
    public final void rule__ServidorAplicaciones__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3553:1: ( rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1 )
            // InternalCeffective.g:3554:2: rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__0__Impl"
    // InternalCeffective.g:3561:1: rule__ServidorAplicaciones__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__ServidorAplicaciones__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3565:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:3566:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:3566:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:3567:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__1"
    // InternalCeffective.g:3576:1: rule__ServidorAplicaciones__Group_4__1 : rule__ServidorAplicaciones__Group_4__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3580:1: ( rule__ServidorAplicaciones__Group_4__1__Impl )
            // InternalCeffective.g:3581:2: rule__ServidorAplicaciones__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__1__Impl"
    // InternalCeffective.g:3587:1: rule__ServidorAplicaciones__Group_4__1__Impl : ( ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3591:1: ( ( ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:3592:1: ( ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:3592:1: ( ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:3593:2: ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:3594:2: ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:3594:3: rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__0"
    // InternalCeffective.g:3603:1: rule__ServidorAplicaciones__Group_5__0 : rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1 ;
    public final void rule__ServidorAplicaciones__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3607:1: ( rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1 )
            // InternalCeffective.g:3608:2: rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__0__Impl"
    // InternalCeffective.g:3615:1: rule__ServidorAplicaciones__Group_5__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__ServidorAplicaciones__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3619:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:3620:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:3620:1: ( 'zonaNombre' )
            // InternalCeffective.g:3621:2: 'zonaNombre'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaNombreKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getZonaNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__1"
    // InternalCeffective.g:3630:1: rule__ServidorAplicaciones__Group_5__1 : rule__ServidorAplicaciones__Group_5__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3634:1: ( rule__ServidorAplicaciones__Group_5__1__Impl )
            // InternalCeffective.g:3635:2: rule__ServidorAplicaciones__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__1__Impl"
    // InternalCeffective.g:3641:1: rule__ServidorAplicaciones__Group_5__1__Impl : ( ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3645:1: ( ( ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 ) ) )
            // InternalCeffective.g:3646:1: ( ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:3646:1: ( ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 ) )
            // InternalCeffective.g:3647:2: ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaNombreAssignment_5_1()); 
            // InternalCeffective.g:3648:2: ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 )
            // InternalCeffective.g:3648:3: rule__ServidorAplicaciones__ZonaNombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__ZonaNombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getZonaNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_6__0"
    // InternalCeffective.g:3657:1: rule__ServidorAplicaciones__Group_6__0 : rule__ServidorAplicaciones__Group_6__0__Impl rule__ServidorAplicaciones__Group_6__1 ;
    public final void rule__ServidorAplicaciones__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3661:1: ( rule__ServidorAplicaciones__Group_6__0__Impl rule__ServidorAplicaciones__Group_6__1 )
            // InternalCeffective.g:3662:2: rule__ServidorAplicaciones__Group_6__0__Impl rule__ServidorAplicaciones__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__ServidorAplicaciones__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_6__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_6__0__Impl"
    // InternalCeffective.g:3669:1: rule__ServidorAplicaciones__Group_6__0__Impl : ( 'tamano' ) ;
    public final void rule__ServidorAplicaciones__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3673:1: ( ( 'tamano' ) )
            // InternalCeffective.g:3674:1: ( 'tamano' )
            {
            // InternalCeffective.g:3674:1: ( 'tamano' )
            // InternalCeffective.g:3675:2: 'tamano'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanoKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getTamanoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_6__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_6__1"
    // InternalCeffective.g:3684:1: rule__ServidorAplicaciones__Group_6__1 : rule__ServidorAplicaciones__Group_6__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3688:1: ( rule__ServidorAplicaciones__Group_6__1__Impl )
            // InternalCeffective.g:3689:2: rule__ServidorAplicaciones__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_6__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_6__1__Impl"
    // InternalCeffective.g:3695:1: rule__ServidorAplicaciones__Group_6__1__Impl : ( ( rule__ServidorAplicaciones__TamanoAssignment_6_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3699:1: ( ( ( rule__ServidorAplicaciones__TamanoAssignment_6_1 ) ) )
            // InternalCeffective.g:3700:1: ( ( rule__ServidorAplicaciones__TamanoAssignment_6_1 ) )
            {
            // InternalCeffective.g:3700:1: ( ( rule__ServidorAplicaciones__TamanoAssignment_6_1 ) )
            // InternalCeffective.g:3701:2: ( rule__ServidorAplicaciones__TamanoAssignment_6_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanoAssignment_6_1()); 
            // InternalCeffective.g:3702:2: ( rule__ServidorAplicaciones__TamanoAssignment_6_1 )
            // InternalCeffective.g:3702:3: rule__ServidorAplicaciones__TamanoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__TamanoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getTamanoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_6__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_7__0"
    // InternalCeffective.g:3711:1: rule__ServidorAplicaciones__Group_7__0 : rule__ServidorAplicaciones__Group_7__0__Impl rule__ServidorAplicaciones__Group_7__1 ;
    public final void rule__ServidorAplicaciones__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3715:1: ( rule__ServidorAplicaciones__Group_7__0__Impl rule__ServidorAplicaciones__Group_7__1 )
            // InternalCeffective.g:3716:2: rule__ServidorAplicaciones__Group_7__0__Impl rule__ServidorAplicaciones__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_7__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_7__0__Impl"
    // InternalCeffective.g:3723:1: rule__ServidorAplicaciones__Group_7__0__Impl : ( 'sistemaOperativo' ) ;
    public final void rule__ServidorAplicaciones__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3727:1: ( ( 'sistemaOperativo' ) )
            // InternalCeffective.g:3728:1: ( 'sistemaOperativo' )
            {
            // InternalCeffective.g:3728:1: ( 'sistemaOperativo' )
            // InternalCeffective.g:3729:2: 'sistemaOperativo'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_7_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_7__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_7__1"
    // InternalCeffective.g:3738:1: rule__ServidorAplicaciones__Group_7__1 : rule__ServidorAplicaciones__Group_7__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3742:1: ( rule__ServidorAplicaciones__Group_7__1__Impl )
            // InternalCeffective.g:3743:2: rule__ServidorAplicaciones__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_7__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_7__1__Impl"
    // InternalCeffective.g:3749:1: rule__ServidorAplicaciones__Group_7__1__Impl : ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3753:1: ( ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 ) ) )
            // InternalCeffective.g:3754:1: ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 ) )
            {
            // InternalCeffective.g:3754:1: ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 ) )
            // InternalCeffective.g:3755:2: ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoAssignment_7_1()); 
            // InternalCeffective.g:3756:2: ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 )
            // InternalCeffective.g:3756:3: rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_7__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__0"
    // InternalCeffective.g:3765:1: rule__ServidorAplicaciones__Group_8__0 : rule__ServidorAplicaciones__Group_8__0__Impl rule__ServidorAplicaciones__Group_8__1 ;
    public final void rule__ServidorAplicaciones__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3769:1: ( rule__ServidorAplicaciones__Group_8__0__Impl rule__ServidorAplicaciones__Group_8__1 )
            // InternalCeffective.g:3770:2: rule__ServidorAplicaciones__Group_8__0__Impl rule__ServidorAplicaciones__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__ServidorAplicaciones__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__0__Impl"
    // InternalCeffective.g:3777:1: rule__ServidorAplicaciones__Group_8__0__Impl : ( 'recursos' ) ;
    public final void rule__ServidorAplicaciones__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3781:1: ( ( 'recursos' ) )
            // InternalCeffective.g:3782:1: ( 'recursos' )
            {
            // InternalCeffective.g:3782:1: ( 'recursos' )
            // InternalCeffective.g:3783:2: 'recursos'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getRecursosKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__1"
    // InternalCeffective.g:3792:1: rule__ServidorAplicaciones__Group_8__1 : rule__ServidorAplicaciones__Group_8__1__Impl rule__ServidorAplicaciones__Group_8__2 ;
    public final void rule__ServidorAplicaciones__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3796:1: ( rule__ServidorAplicaciones__Group_8__1__Impl rule__ServidorAplicaciones__Group_8__2 )
            // InternalCeffective.g:3797:2: rule__ServidorAplicaciones__Group_8__1__Impl rule__ServidorAplicaciones__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__1__Impl"
    // InternalCeffective.g:3804:1: rule__ServidorAplicaciones__Group_8__1__Impl : ( '(' ) ;
    public final void rule__ServidorAplicaciones__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3808:1: ( ( '(' ) )
            // InternalCeffective.g:3809:1: ( '(' )
            {
            // InternalCeffective.g:3809:1: ( '(' )
            // InternalCeffective.g:3810:2: '('
            {
             before(grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__2"
    // InternalCeffective.g:3819:1: rule__ServidorAplicaciones__Group_8__2 : rule__ServidorAplicaciones__Group_8__2__Impl rule__ServidorAplicaciones__Group_8__3 ;
    public final void rule__ServidorAplicaciones__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3823:1: ( rule__ServidorAplicaciones__Group_8__2__Impl rule__ServidorAplicaciones__Group_8__3 )
            // InternalCeffective.g:3824:2: rule__ServidorAplicaciones__Group_8__2__Impl rule__ServidorAplicaciones__Group_8__3
            {
            pushFollow(FOLLOW_20);
            rule__ServidorAplicaciones__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__2"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__2__Impl"
    // InternalCeffective.g:3831:1: rule__ServidorAplicaciones__Group_8__2__Impl : ( ( rule__ServidorAplicaciones__RecursosAssignment_8_2 ) ) ;
    public final void rule__ServidorAplicaciones__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3835:1: ( ( ( rule__ServidorAplicaciones__RecursosAssignment_8_2 ) ) )
            // InternalCeffective.g:3836:1: ( ( rule__ServidorAplicaciones__RecursosAssignment_8_2 ) )
            {
            // InternalCeffective.g:3836:1: ( ( rule__ServidorAplicaciones__RecursosAssignment_8_2 ) )
            // InternalCeffective.g:3837:2: ( rule__ServidorAplicaciones__RecursosAssignment_8_2 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosAssignment_8_2()); 
            // InternalCeffective.g:3838:2: ( rule__ServidorAplicaciones__RecursosAssignment_8_2 )
            // InternalCeffective.g:3838:3: rule__ServidorAplicaciones__RecursosAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__RecursosAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__2__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__3"
    // InternalCeffective.g:3846:1: rule__ServidorAplicaciones__Group_8__3 : rule__ServidorAplicaciones__Group_8__3__Impl rule__ServidorAplicaciones__Group_8__4 ;
    public final void rule__ServidorAplicaciones__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3850:1: ( rule__ServidorAplicaciones__Group_8__3__Impl rule__ServidorAplicaciones__Group_8__4 )
            // InternalCeffective.g:3851:2: rule__ServidorAplicaciones__Group_8__3__Impl rule__ServidorAplicaciones__Group_8__4
            {
            pushFollow(FOLLOW_20);
            rule__ServidorAplicaciones__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__3"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__3__Impl"
    // InternalCeffective.g:3858:1: rule__ServidorAplicaciones__Group_8__3__Impl : ( ( rule__ServidorAplicaciones__Group_8_3__0 )* ) ;
    public final void rule__ServidorAplicaciones__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3862:1: ( ( ( rule__ServidorAplicaciones__Group_8_3__0 )* ) )
            // InternalCeffective.g:3863:1: ( ( rule__ServidorAplicaciones__Group_8_3__0 )* )
            {
            // InternalCeffective.g:3863:1: ( ( rule__ServidorAplicaciones__Group_8_3__0 )* )
            // InternalCeffective.g:3864:2: ( rule__ServidorAplicaciones__Group_8_3__0 )*
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_8_3()); 
            // InternalCeffective.g:3865:2: ( rule__ServidorAplicaciones__Group_8_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==29) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCeffective.g:3865:3: rule__ServidorAplicaciones__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ServidorAplicaciones__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__3__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__4"
    // InternalCeffective.g:3873:1: rule__ServidorAplicaciones__Group_8__4 : rule__ServidorAplicaciones__Group_8__4__Impl ;
    public final void rule__ServidorAplicaciones__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3877:1: ( rule__ServidorAplicaciones__Group_8__4__Impl )
            // InternalCeffective.g:3878:2: rule__ServidorAplicaciones__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__4"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__4__Impl"
    // InternalCeffective.g:3884:1: rule__ServidorAplicaciones__Group_8__4__Impl : ( ')' ) ;
    public final void rule__ServidorAplicaciones__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3888:1: ( ( ')' ) )
            // InternalCeffective.g:3889:1: ( ')' )
            {
            // InternalCeffective.g:3889:1: ( ')' )
            // InternalCeffective.g:3890:2: ')'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_8_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__4__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8_3__0"
    // InternalCeffective.g:3900:1: rule__ServidorAplicaciones__Group_8_3__0 : rule__ServidorAplicaciones__Group_8_3__0__Impl rule__ServidorAplicaciones__Group_8_3__1 ;
    public final void rule__ServidorAplicaciones__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3904:1: ( rule__ServidorAplicaciones__Group_8_3__0__Impl rule__ServidorAplicaciones__Group_8_3__1 )
            // InternalCeffective.g:3905:2: rule__ServidorAplicaciones__Group_8_3__0__Impl rule__ServidorAplicaciones__Group_8_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8_3__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8_3__0__Impl"
    // InternalCeffective.g:3912:1: rule__ServidorAplicaciones__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ServidorAplicaciones__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3916:1: ( ( ',' ) )
            // InternalCeffective.g:3917:1: ( ',' )
            {
            // InternalCeffective.g:3917:1: ( ',' )
            // InternalCeffective.g:3918:2: ','
            {
             before(grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_8_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8_3__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8_3__1"
    // InternalCeffective.g:3927:1: rule__ServidorAplicaciones__Group_8_3__1 : rule__ServidorAplicaciones__Group_8_3__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3931:1: ( rule__ServidorAplicaciones__Group_8_3__1__Impl )
            // InternalCeffective.g:3932:2: rule__ServidorAplicaciones__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8_3__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8_3__1__Impl"
    // InternalCeffective.g:3938:1: rule__ServidorAplicaciones__Group_8_3__1__Impl : ( ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3942:1: ( ( ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 ) ) )
            // InternalCeffective.g:3943:1: ( ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 ) )
            {
            // InternalCeffective.g:3943:1: ( ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 ) )
            // InternalCeffective.g:3944:2: ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosAssignment_8_3_1()); 
            // InternalCeffective.g:3945:2: ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 )
            // InternalCeffective.g:3945:3: rule__ServidorAplicaciones__RecursosAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__RecursosAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8_3__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_9__0"
    // InternalCeffective.g:3954:1: rule__ServidorAplicaciones__Group_9__0 : rule__ServidorAplicaciones__Group_9__0__Impl rule__ServidorAplicaciones__Group_9__1 ;
    public final void rule__ServidorAplicaciones__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3958:1: ( rule__ServidorAplicaciones__Group_9__0__Impl rule__ServidorAplicaciones__Group_9__1 )
            // InternalCeffective.g:3959:2: rule__ServidorAplicaciones__Group_9__0__Impl rule__ServidorAplicaciones__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_9__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_9__0__Impl"
    // InternalCeffective.g:3966:1: rule__ServidorAplicaciones__Group_9__0__Impl : ( 'vpc' ) ;
    public final void rule__ServidorAplicaciones__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3970:1: ( ( 'vpc' ) )
            // InternalCeffective.g:3971:1: ( 'vpc' )
            {
            // InternalCeffective.g:3971:1: ( 'vpc' )
            // InternalCeffective.g:3972:2: 'vpc'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_9_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_9__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_9__1"
    // InternalCeffective.g:3981:1: rule__ServidorAplicaciones__Group_9__1 : rule__ServidorAplicaciones__Group_9__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3985:1: ( rule__ServidorAplicaciones__Group_9__1__Impl )
            // InternalCeffective.g:3986:2: rule__ServidorAplicaciones__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_9__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_9__1__Impl"
    // InternalCeffective.g:3992:1: rule__ServidorAplicaciones__Group_9__1__Impl : ( ( rule__ServidorAplicaciones__VpcAssignment_9_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3996:1: ( ( ( rule__ServidorAplicaciones__VpcAssignment_9_1 ) ) )
            // InternalCeffective.g:3997:1: ( ( rule__ServidorAplicaciones__VpcAssignment_9_1 ) )
            {
            // InternalCeffective.g:3997:1: ( ( rule__ServidorAplicaciones__VpcAssignment_9_1 ) )
            // InternalCeffective.g:3998:2: ( rule__ServidorAplicaciones__VpcAssignment_9_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcAssignment_9_1()); 
            // InternalCeffective.g:3999:2: ( rule__ServidorAplicaciones__VpcAssignment_9_1 )
            // InternalCeffective.g:3999:3: rule__ServidorAplicaciones__VpcAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__VpcAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getVpcAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_9__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__0"
    // InternalCeffective.g:4008:1: rule__Almacenamiento__Group__0 : rule__Almacenamiento__Group__0__Impl rule__Almacenamiento__Group__1 ;
    public final void rule__Almacenamiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4012:1: ( rule__Almacenamiento__Group__0__Impl rule__Almacenamiento__Group__1 )
            // InternalCeffective.g:4013:2: rule__Almacenamiento__Group__0__Impl rule__Almacenamiento__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Almacenamiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__0"


    // $ANTLR start "rule__Almacenamiento__Group__0__Impl"
    // InternalCeffective.g:4020:1: rule__Almacenamiento__Group__0__Impl : ( () ) ;
    public final void rule__Almacenamiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4024:1: ( ( () ) )
            // InternalCeffective.g:4025:1: ( () )
            {
            // InternalCeffective.g:4025:1: ( () )
            // InternalCeffective.g:4026:2: ()
            {
             before(grammarAccess.getAlmacenamientoAccess().getAlmacenamientoAction_0()); 
            // InternalCeffective.g:4027:2: ()
            // InternalCeffective.g:4027:3: 
            {
            }

             after(grammarAccess.getAlmacenamientoAccess().getAlmacenamientoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__1"
    // InternalCeffective.g:4035:1: rule__Almacenamiento__Group__1 : rule__Almacenamiento__Group__1__Impl rule__Almacenamiento__Group__2 ;
    public final void rule__Almacenamiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4039:1: ( rule__Almacenamiento__Group__1__Impl rule__Almacenamiento__Group__2 )
            // InternalCeffective.g:4040:2: rule__Almacenamiento__Group__1__Impl rule__Almacenamiento__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Almacenamiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__1"


    // $ANTLR start "rule__Almacenamiento__Group__1__Impl"
    // InternalCeffective.g:4047:1: rule__Almacenamiento__Group__1__Impl : ( 'Almacenamiento' ) ;
    public final void rule__Almacenamiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4051:1: ( ( 'Almacenamiento' ) )
            // InternalCeffective.g:4052:1: ( 'Almacenamiento' )
            {
            // InternalCeffective.g:4052:1: ( 'Almacenamiento' )
            // InternalCeffective.g:4053:2: 'Almacenamiento'
            {
             before(grammarAccess.getAlmacenamientoAccess().getAlmacenamientoKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getAlmacenamientoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__2"
    // InternalCeffective.g:4062:1: rule__Almacenamiento__Group__2 : rule__Almacenamiento__Group__2__Impl rule__Almacenamiento__Group__3 ;
    public final void rule__Almacenamiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4066:1: ( rule__Almacenamiento__Group__2__Impl rule__Almacenamiento__Group__3 )
            // InternalCeffective.g:4067:2: rule__Almacenamiento__Group__2__Impl rule__Almacenamiento__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Almacenamiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__2"


    // $ANTLR start "rule__Almacenamiento__Group__2__Impl"
    // InternalCeffective.g:4074:1: rule__Almacenamiento__Group__2__Impl : ( '{' ) ;
    public final void rule__Almacenamiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4078:1: ( ( '{' ) )
            // InternalCeffective.g:4079:1: ( '{' )
            {
            // InternalCeffective.g:4079:1: ( '{' )
            // InternalCeffective.g:4080:2: '{'
            {
             before(grammarAccess.getAlmacenamientoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__2__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__3"
    // InternalCeffective.g:4089:1: rule__Almacenamiento__Group__3 : rule__Almacenamiento__Group__3__Impl rule__Almacenamiento__Group__4 ;
    public final void rule__Almacenamiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4093:1: ( rule__Almacenamiento__Group__3__Impl rule__Almacenamiento__Group__4 )
            // InternalCeffective.g:4094:2: rule__Almacenamiento__Group__3__Impl rule__Almacenamiento__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Almacenamiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__3"


    // $ANTLR start "rule__Almacenamiento__Group__3__Impl"
    // InternalCeffective.g:4101:1: rule__Almacenamiento__Group__3__Impl : ( ( rule__Almacenamiento__Group_3__0 )? ) ;
    public final void rule__Almacenamiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4105:1: ( ( ( rule__Almacenamiento__Group_3__0 )? ) )
            // InternalCeffective.g:4106:1: ( ( rule__Almacenamiento__Group_3__0 )? )
            {
            // InternalCeffective.g:4106:1: ( ( rule__Almacenamiento__Group_3__0 )? )
            // InternalCeffective.g:4107:2: ( rule__Almacenamiento__Group_3__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_3()); 
            // InternalCeffective.g:4108:2: ( rule__Almacenamiento__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCeffective.g:4108:3: rule__Almacenamiento__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__3__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__4"
    // InternalCeffective.g:4116:1: rule__Almacenamiento__Group__4 : rule__Almacenamiento__Group__4__Impl rule__Almacenamiento__Group__5 ;
    public final void rule__Almacenamiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4120:1: ( rule__Almacenamiento__Group__4__Impl rule__Almacenamiento__Group__5 )
            // InternalCeffective.g:4121:2: rule__Almacenamiento__Group__4__Impl rule__Almacenamiento__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Almacenamiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__4"


    // $ANTLR start "rule__Almacenamiento__Group__4__Impl"
    // InternalCeffective.g:4128:1: rule__Almacenamiento__Group__4__Impl : ( ( rule__Almacenamiento__Group_4__0 )? ) ;
    public final void rule__Almacenamiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4132:1: ( ( ( rule__Almacenamiento__Group_4__0 )? ) )
            // InternalCeffective.g:4133:1: ( ( rule__Almacenamiento__Group_4__0 )? )
            {
            // InternalCeffective.g:4133:1: ( ( rule__Almacenamiento__Group_4__0 )? )
            // InternalCeffective.g:4134:2: ( rule__Almacenamiento__Group_4__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_4()); 
            // InternalCeffective.g:4135:2: ( rule__Almacenamiento__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCeffective.g:4135:3: rule__Almacenamiento__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__4__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__5"
    // InternalCeffective.g:4143:1: rule__Almacenamiento__Group__5 : rule__Almacenamiento__Group__5__Impl rule__Almacenamiento__Group__6 ;
    public final void rule__Almacenamiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4147:1: ( rule__Almacenamiento__Group__5__Impl rule__Almacenamiento__Group__6 )
            // InternalCeffective.g:4148:2: rule__Almacenamiento__Group__5__Impl rule__Almacenamiento__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Almacenamiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__5"


    // $ANTLR start "rule__Almacenamiento__Group__5__Impl"
    // InternalCeffective.g:4155:1: rule__Almacenamiento__Group__5__Impl : ( ( rule__Almacenamiento__Group_5__0 )? ) ;
    public final void rule__Almacenamiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4159:1: ( ( ( rule__Almacenamiento__Group_5__0 )? ) )
            // InternalCeffective.g:4160:1: ( ( rule__Almacenamiento__Group_5__0 )? )
            {
            // InternalCeffective.g:4160:1: ( ( rule__Almacenamiento__Group_5__0 )? )
            // InternalCeffective.g:4161:2: ( rule__Almacenamiento__Group_5__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_5()); 
            // InternalCeffective.g:4162:2: ( rule__Almacenamiento__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCeffective.g:4162:3: rule__Almacenamiento__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__5__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__6"
    // InternalCeffective.g:4170:1: rule__Almacenamiento__Group__6 : rule__Almacenamiento__Group__6__Impl rule__Almacenamiento__Group__7 ;
    public final void rule__Almacenamiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4174:1: ( rule__Almacenamiento__Group__6__Impl rule__Almacenamiento__Group__7 )
            // InternalCeffective.g:4175:2: rule__Almacenamiento__Group__6__Impl rule__Almacenamiento__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__Almacenamiento__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__6"


    // $ANTLR start "rule__Almacenamiento__Group__6__Impl"
    // InternalCeffective.g:4182:1: rule__Almacenamiento__Group__6__Impl : ( ( rule__Almacenamiento__Group_6__0 )? ) ;
    public final void rule__Almacenamiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4186:1: ( ( ( rule__Almacenamiento__Group_6__0 )? ) )
            // InternalCeffective.g:4187:1: ( ( rule__Almacenamiento__Group_6__0 )? )
            {
            // InternalCeffective.g:4187:1: ( ( rule__Almacenamiento__Group_6__0 )? )
            // InternalCeffective.g:4188:2: ( rule__Almacenamiento__Group_6__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_6()); 
            // InternalCeffective.g:4189:2: ( rule__Almacenamiento__Group_6__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCeffective.g:4189:3: rule__Almacenamiento__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__6__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__7"
    // InternalCeffective.g:4197:1: rule__Almacenamiento__Group__7 : rule__Almacenamiento__Group__7__Impl rule__Almacenamiento__Group__8 ;
    public final void rule__Almacenamiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4201:1: ( rule__Almacenamiento__Group__7__Impl rule__Almacenamiento__Group__8 )
            // InternalCeffective.g:4202:2: rule__Almacenamiento__Group__7__Impl rule__Almacenamiento__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Almacenamiento__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__7"


    // $ANTLR start "rule__Almacenamiento__Group__7__Impl"
    // InternalCeffective.g:4209:1: rule__Almacenamiento__Group__7__Impl : ( ( rule__Almacenamiento__Group_7__0 )? ) ;
    public final void rule__Almacenamiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4213:1: ( ( ( rule__Almacenamiento__Group_7__0 )? ) )
            // InternalCeffective.g:4214:1: ( ( rule__Almacenamiento__Group_7__0 )? )
            {
            // InternalCeffective.g:4214:1: ( ( rule__Almacenamiento__Group_7__0 )? )
            // InternalCeffective.g:4215:2: ( rule__Almacenamiento__Group_7__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_7()); 
            // InternalCeffective.g:4216:2: ( rule__Almacenamiento__Group_7__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCeffective.g:4216:3: rule__Almacenamiento__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__7__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__8"
    // InternalCeffective.g:4224:1: rule__Almacenamiento__Group__8 : rule__Almacenamiento__Group__8__Impl rule__Almacenamiento__Group__9 ;
    public final void rule__Almacenamiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4228:1: ( rule__Almacenamiento__Group__8__Impl rule__Almacenamiento__Group__9 )
            // InternalCeffective.g:4229:2: rule__Almacenamiento__Group__8__Impl rule__Almacenamiento__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__Almacenamiento__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__8"


    // $ANTLR start "rule__Almacenamiento__Group__8__Impl"
    // InternalCeffective.g:4236:1: rule__Almacenamiento__Group__8__Impl : ( ( rule__Almacenamiento__Group_8__0 )? ) ;
    public final void rule__Almacenamiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4240:1: ( ( ( rule__Almacenamiento__Group_8__0 )? ) )
            // InternalCeffective.g:4241:1: ( ( rule__Almacenamiento__Group_8__0 )? )
            {
            // InternalCeffective.g:4241:1: ( ( rule__Almacenamiento__Group_8__0 )? )
            // InternalCeffective.g:4242:2: ( rule__Almacenamiento__Group_8__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_8()); 
            // InternalCeffective.g:4243:2: ( rule__Almacenamiento__Group_8__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCeffective.g:4243:3: rule__Almacenamiento__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__8__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__9"
    // InternalCeffective.g:4251:1: rule__Almacenamiento__Group__9 : rule__Almacenamiento__Group__9__Impl ;
    public final void rule__Almacenamiento__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4255:1: ( rule__Almacenamiento__Group__9__Impl )
            // InternalCeffective.g:4256:2: rule__Almacenamiento__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__9"


    // $ANTLR start "rule__Almacenamiento__Group__9__Impl"
    // InternalCeffective.g:4262:1: rule__Almacenamiento__Group__9__Impl : ( '}' ) ;
    public final void rule__Almacenamiento__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4266:1: ( ( '}' ) )
            // InternalCeffective.g:4267:1: ( '}' )
            {
            // InternalCeffective.g:4267:1: ( '}' )
            // InternalCeffective.g:4268:2: '}'
            {
             before(grammarAccess.getAlmacenamientoAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__9__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_3__0"
    // InternalCeffective.g:4278:1: rule__Almacenamiento__Group_3__0 : rule__Almacenamiento__Group_3__0__Impl rule__Almacenamiento__Group_3__1 ;
    public final void rule__Almacenamiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4282:1: ( rule__Almacenamiento__Group_3__0__Impl rule__Almacenamiento__Group_3__1 )
            // InternalCeffective.g:4283:2: rule__Almacenamiento__Group_3__0__Impl rule__Almacenamiento__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_3__0"


    // $ANTLR start "rule__Almacenamiento__Group_3__0__Impl"
    // InternalCeffective.g:4290:1: rule__Almacenamiento__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Almacenamiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4294:1: ( ( 'nombre' ) )
            // InternalCeffective.g:4295:1: ( 'nombre' )
            {
            // InternalCeffective.g:4295:1: ( 'nombre' )
            // InternalCeffective.g:4296:2: 'nombre'
            {
             before(grammarAccess.getAlmacenamientoAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_3__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_3__1"
    // InternalCeffective.g:4305:1: rule__Almacenamiento__Group_3__1 : rule__Almacenamiento__Group_3__1__Impl ;
    public final void rule__Almacenamiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4309:1: ( rule__Almacenamiento__Group_3__1__Impl )
            // InternalCeffective.g:4310:2: rule__Almacenamiento__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_3__1"


    // $ANTLR start "rule__Almacenamiento__Group_3__1__Impl"
    // InternalCeffective.g:4316:1: rule__Almacenamiento__Group_3__1__Impl : ( ( rule__Almacenamiento__NombreAssignment_3_1 ) ) ;
    public final void rule__Almacenamiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4320:1: ( ( ( rule__Almacenamiento__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:4321:1: ( ( rule__Almacenamiento__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:4321:1: ( ( rule__Almacenamiento__NombreAssignment_3_1 ) )
            // InternalCeffective.g:4322:2: ( rule__Almacenamiento__NombreAssignment_3_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:4323:2: ( rule__Almacenamiento__NombreAssignment_3_1 )
            // InternalCeffective.g:4323:3: rule__Almacenamiento__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_3__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_4__0"
    // InternalCeffective.g:4332:1: rule__Almacenamiento__Group_4__0 : rule__Almacenamiento__Group_4__0__Impl rule__Almacenamiento__Group_4__1 ;
    public final void rule__Almacenamiento__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4336:1: ( rule__Almacenamiento__Group_4__0__Impl rule__Almacenamiento__Group_4__1 )
            // InternalCeffective.g:4337:2: rule__Almacenamiento__Group_4__0__Impl rule__Almacenamiento__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_4__0"


    // $ANTLR start "rule__Almacenamiento__Group_4__0__Impl"
    // InternalCeffective.g:4344:1: rule__Almacenamiento__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__Almacenamiento__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4348:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:4349:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:4349:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:4350:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_4__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_4__1"
    // InternalCeffective.g:4359:1: rule__Almacenamiento__Group_4__1 : rule__Almacenamiento__Group_4__1__Impl ;
    public final void rule__Almacenamiento__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4363:1: ( rule__Almacenamiento__Group_4__1__Impl )
            // InternalCeffective.g:4364:2: rule__Almacenamiento__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_4__1"


    // $ANTLR start "rule__Almacenamiento__Group_4__1__Impl"
    // InternalCeffective.g:4370:1: rule__Almacenamiento__Group_4__1__Impl : ( ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__Almacenamiento__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4374:1: ( ( ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:4375:1: ( ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:4375:1: ( ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:4376:2: ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:4377:2: ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:4377:3: rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_4__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_5__0"
    // InternalCeffective.g:4386:1: rule__Almacenamiento__Group_5__0 : rule__Almacenamiento__Group_5__0__Impl rule__Almacenamiento__Group_5__1 ;
    public final void rule__Almacenamiento__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4390:1: ( rule__Almacenamiento__Group_5__0__Impl rule__Almacenamiento__Group_5__1 )
            // InternalCeffective.g:4391:2: rule__Almacenamiento__Group_5__0__Impl rule__Almacenamiento__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_5__0"


    // $ANTLR start "rule__Almacenamiento__Group_5__0__Impl"
    // InternalCeffective.g:4398:1: rule__Almacenamiento__Group_5__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__Almacenamiento__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4402:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:4403:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:4403:1: ( 'zonaNombre' )
            // InternalCeffective.g:4404:2: 'zonaNombre'
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaNombreKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getZonaNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_5__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_5__1"
    // InternalCeffective.g:4413:1: rule__Almacenamiento__Group_5__1 : rule__Almacenamiento__Group_5__1__Impl ;
    public final void rule__Almacenamiento__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4417:1: ( rule__Almacenamiento__Group_5__1__Impl )
            // InternalCeffective.g:4418:2: rule__Almacenamiento__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_5__1"


    // $ANTLR start "rule__Almacenamiento__Group_5__1__Impl"
    // InternalCeffective.g:4424:1: rule__Almacenamiento__Group_5__1__Impl : ( ( rule__Almacenamiento__ZonaNombreAssignment_5_1 ) ) ;
    public final void rule__Almacenamiento__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4428:1: ( ( ( rule__Almacenamiento__ZonaNombreAssignment_5_1 ) ) )
            // InternalCeffective.g:4429:1: ( ( rule__Almacenamiento__ZonaNombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:4429:1: ( ( rule__Almacenamiento__ZonaNombreAssignment_5_1 ) )
            // InternalCeffective.g:4430:2: ( rule__Almacenamiento__ZonaNombreAssignment_5_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaNombreAssignment_5_1()); 
            // InternalCeffective.g:4431:2: ( rule__Almacenamiento__ZonaNombreAssignment_5_1 )
            // InternalCeffective.g:4431:3: rule__Almacenamiento__ZonaNombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__ZonaNombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getZonaNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_5__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_6__0"
    // InternalCeffective.g:4440:1: rule__Almacenamiento__Group_6__0 : rule__Almacenamiento__Group_6__0__Impl rule__Almacenamiento__Group_6__1 ;
    public final void rule__Almacenamiento__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4444:1: ( rule__Almacenamiento__Group_6__0__Impl rule__Almacenamiento__Group_6__1 )
            // InternalCeffective.g:4445:2: rule__Almacenamiento__Group_6__0__Impl rule__Almacenamiento__Group_6__1
            {
            pushFollow(FOLLOW_29);
            rule__Almacenamiento__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_6__0"


    // $ANTLR start "rule__Almacenamiento__Group_6__0__Impl"
    // InternalCeffective.g:4452:1: rule__Almacenamiento__Group_6__0__Impl : ( 'tamanoInicial' ) ;
    public final void rule__Almacenamiento__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4456:1: ( ( 'tamanoInicial' ) )
            // InternalCeffective.g:4457:1: ( 'tamanoInicial' )
            {
            // InternalCeffective.g:4457:1: ( 'tamanoInicial' )
            // InternalCeffective.g:4458:2: 'tamanoInicial'
            {
             before(grammarAccess.getAlmacenamientoAccess().getTamanoInicialKeyword_6_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getTamanoInicialKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_6__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_6__1"
    // InternalCeffective.g:4467:1: rule__Almacenamiento__Group_6__1 : rule__Almacenamiento__Group_6__1__Impl ;
    public final void rule__Almacenamiento__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4471:1: ( rule__Almacenamiento__Group_6__1__Impl )
            // InternalCeffective.g:4472:2: rule__Almacenamiento__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_6__1"


    // $ANTLR start "rule__Almacenamiento__Group_6__1__Impl"
    // InternalCeffective.g:4478:1: rule__Almacenamiento__Group_6__1__Impl : ( ( rule__Almacenamiento__TamanoInicialAssignment_6_1 ) ) ;
    public final void rule__Almacenamiento__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4482:1: ( ( ( rule__Almacenamiento__TamanoInicialAssignment_6_1 ) ) )
            // InternalCeffective.g:4483:1: ( ( rule__Almacenamiento__TamanoInicialAssignment_6_1 ) )
            {
            // InternalCeffective.g:4483:1: ( ( rule__Almacenamiento__TamanoInicialAssignment_6_1 ) )
            // InternalCeffective.g:4484:2: ( rule__Almacenamiento__TamanoInicialAssignment_6_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getTamanoInicialAssignment_6_1()); 
            // InternalCeffective.g:4485:2: ( rule__Almacenamiento__TamanoInicialAssignment_6_1 )
            // InternalCeffective.g:4485:3: rule__Almacenamiento__TamanoInicialAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__TamanoInicialAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getTamanoInicialAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_6__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__0"
    // InternalCeffective.g:4494:1: rule__Almacenamiento__Group_7__0 : rule__Almacenamiento__Group_7__0__Impl rule__Almacenamiento__Group_7__1 ;
    public final void rule__Almacenamiento__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4498:1: ( rule__Almacenamiento__Group_7__0__Impl rule__Almacenamiento__Group_7__1 )
            // InternalCeffective.g:4499:2: rule__Almacenamiento__Group_7__0__Impl rule__Almacenamiento__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__Almacenamiento__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__0"


    // $ANTLR start "rule__Almacenamiento__Group_7__0__Impl"
    // InternalCeffective.g:4506:1: rule__Almacenamiento__Group_7__0__Impl : ( 'recursos' ) ;
    public final void rule__Almacenamiento__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4510:1: ( ( 'recursos' ) )
            // InternalCeffective.g:4511:1: ( 'recursos' )
            {
            // InternalCeffective.g:4511:1: ( 'recursos' )
            // InternalCeffective.g:4512:2: 'recursos'
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getRecursosKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__1"
    // InternalCeffective.g:4521:1: rule__Almacenamiento__Group_7__1 : rule__Almacenamiento__Group_7__1__Impl rule__Almacenamiento__Group_7__2 ;
    public final void rule__Almacenamiento__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4525:1: ( rule__Almacenamiento__Group_7__1__Impl rule__Almacenamiento__Group_7__2 )
            // InternalCeffective.g:4526:2: rule__Almacenamiento__Group_7__1__Impl rule__Almacenamiento__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__1"


    // $ANTLR start "rule__Almacenamiento__Group_7__1__Impl"
    // InternalCeffective.g:4533:1: rule__Almacenamiento__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Almacenamiento__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4537:1: ( ( '(' ) )
            // InternalCeffective.g:4538:1: ( '(' )
            {
            // InternalCeffective.g:4538:1: ( '(' )
            // InternalCeffective.g:4539:2: '('
            {
             before(grammarAccess.getAlmacenamientoAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__2"
    // InternalCeffective.g:4548:1: rule__Almacenamiento__Group_7__2 : rule__Almacenamiento__Group_7__2__Impl rule__Almacenamiento__Group_7__3 ;
    public final void rule__Almacenamiento__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4552:1: ( rule__Almacenamiento__Group_7__2__Impl rule__Almacenamiento__Group_7__3 )
            // InternalCeffective.g:4553:2: rule__Almacenamiento__Group_7__2__Impl rule__Almacenamiento__Group_7__3
            {
            pushFollow(FOLLOW_20);
            rule__Almacenamiento__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__2"


    // $ANTLR start "rule__Almacenamiento__Group_7__2__Impl"
    // InternalCeffective.g:4560:1: rule__Almacenamiento__Group_7__2__Impl : ( ( rule__Almacenamiento__RecursosAssignment_7_2 ) ) ;
    public final void rule__Almacenamiento__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4564:1: ( ( ( rule__Almacenamiento__RecursosAssignment_7_2 ) ) )
            // InternalCeffective.g:4565:1: ( ( rule__Almacenamiento__RecursosAssignment_7_2 ) )
            {
            // InternalCeffective.g:4565:1: ( ( rule__Almacenamiento__RecursosAssignment_7_2 ) )
            // InternalCeffective.g:4566:2: ( rule__Almacenamiento__RecursosAssignment_7_2 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosAssignment_7_2()); 
            // InternalCeffective.g:4567:2: ( rule__Almacenamiento__RecursosAssignment_7_2 )
            // InternalCeffective.g:4567:3: rule__Almacenamiento__RecursosAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__RecursosAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getRecursosAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__2__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__3"
    // InternalCeffective.g:4575:1: rule__Almacenamiento__Group_7__3 : rule__Almacenamiento__Group_7__3__Impl rule__Almacenamiento__Group_7__4 ;
    public final void rule__Almacenamiento__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4579:1: ( rule__Almacenamiento__Group_7__3__Impl rule__Almacenamiento__Group_7__4 )
            // InternalCeffective.g:4580:2: rule__Almacenamiento__Group_7__3__Impl rule__Almacenamiento__Group_7__4
            {
            pushFollow(FOLLOW_20);
            rule__Almacenamiento__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__3"


    // $ANTLR start "rule__Almacenamiento__Group_7__3__Impl"
    // InternalCeffective.g:4587:1: rule__Almacenamiento__Group_7__3__Impl : ( ( rule__Almacenamiento__Group_7_3__0 )* ) ;
    public final void rule__Almacenamiento__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4591:1: ( ( ( rule__Almacenamiento__Group_7_3__0 )* ) )
            // InternalCeffective.g:4592:1: ( ( rule__Almacenamiento__Group_7_3__0 )* )
            {
            // InternalCeffective.g:4592:1: ( ( rule__Almacenamiento__Group_7_3__0 )* )
            // InternalCeffective.g:4593:2: ( rule__Almacenamiento__Group_7_3__0 )*
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_7_3()); 
            // InternalCeffective.g:4594:2: ( rule__Almacenamiento__Group_7_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==29) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalCeffective.g:4594:3: rule__Almacenamiento__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Almacenamiento__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getAlmacenamientoAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__3__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__4"
    // InternalCeffective.g:4602:1: rule__Almacenamiento__Group_7__4 : rule__Almacenamiento__Group_7__4__Impl ;
    public final void rule__Almacenamiento__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4606:1: ( rule__Almacenamiento__Group_7__4__Impl )
            // InternalCeffective.g:4607:2: rule__Almacenamiento__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__4"


    // $ANTLR start "rule__Almacenamiento__Group_7__4__Impl"
    // InternalCeffective.g:4613:1: rule__Almacenamiento__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Almacenamiento__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4617:1: ( ( ')' ) )
            // InternalCeffective.g:4618:1: ( ')' )
            {
            // InternalCeffective.g:4618:1: ( ')' )
            // InternalCeffective.g:4619:2: ')'
            {
             before(grammarAccess.getAlmacenamientoAccess().getRightParenthesisKeyword_7_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__4__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7_3__0"
    // InternalCeffective.g:4629:1: rule__Almacenamiento__Group_7_3__0 : rule__Almacenamiento__Group_7_3__0__Impl rule__Almacenamiento__Group_7_3__1 ;
    public final void rule__Almacenamiento__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4633:1: ( rule__Almacenamiento__Group_7_3__0__Impl rule__Almacenamiento__Group_7_3__1 )
            // InternalCeffective.g:4634:2: rule__Almacenamiento__Group_7_3__0__Impl rule__Almacenamiento__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7_3__0"


    // $ANTLR start "rule__Almacenamiento__Group_7_3__0__Impl"
    // InternalCeffective.g:4641:1: rule__Almacenamiento__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Almacenamiento__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4645:1: ( ( ',' ) )
            // InternalCeffective.g:4646:1: ( ',' )
            {
            // InternalCeffective.g:4646:1: ( ',' )
            // InternalCeffective.g:4647:2: ','
            {
             before(grammarAccess.getAlmacenamientoAccess().getCommaKeyword_7_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7_3__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7_3__1"
    // InternalCeffective.g:4656:1: rule__Almacenamiento__Group_7_3__1 : rule__Almacenamiento__Group_7_3__1__Impl ;
    public final void rule__Almacenamiento__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4660:1: ( rule__Almacenamiento__Group_7_3__1__Impl )
            // InternalCeffective.g:4661:2: rule__Almacenamiento__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7_3__1"


    // $ANTLR start "rule__Almacenamiento__Group_7_3__1__Impl"
    // InternalCeffective.g:4667:1: rule__Almacenamiento__Group_7_3__1__Impl : ( ( rule__Almacenamiento__RecursosAssignment_7_3_1 ) ) ;
    public final void rule__Almacenamiento__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4671:1: ( ( ( rule__Almacenamiento__RecursosAssignment_7_3_1 ) ) )
            // InternalCeffective.g:4672:1: ( ( rule__Almacenamiento__RecursosAssignment_7_3_1 ) )
            {
            // InternalCeffective.g:4672:1: ( ( rule__Almacenamiento__RecursosAssignment_7_3_1 ) )
            // InternalCeffective.g:4673:2: ( rule__Almacenamiento__RecursosAssignment_7_3_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosAssignment_7_3_1()); 
            // InternalCeffective.g:4674:2: ( rule__Almacenamiento__RecursosAssignment_7_3_1 )
            // InternalCeffective.g:4674:3: rule__Almacenamiento__RecursosAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__RecursosAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getRecursosAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7_3__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_8__0"
    // InternalCeffective.g:4683:1: rule__Almacenamiento__Group_8__0 : rule__Almacenamiento__Group_8__0__Impl rule__Almacenamiento__Group_8__1 ;
    public final void rule__Almacenamiento__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4687:1: ( rule__Almacenamiento__Group_8__0__Impl rule__Almacenamiento__Group_8__1 )
            // InternalCeffective.g:4688:2: rule__Almacenamiento__Group_8__0__Impl rule__Almacenamiento__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_8__0"


    // $ANTLR start "rule__Almacenamiento__Group_8__0__Impl"
    // InternalCeffective.g:4695:1: rule__Almacenamiento__Group_8__0__Impl : ( 'vpc' ) ;
    public final void rule__Almacenamiento__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4699:1: ( ( 'vpc' ) )
            // InternalCeffective.g:4700:1: ( 'vpc' )
            {
            // InternalCeffective.g:4700:1: ( 'vpc' )
            // InternalCeffective.g:4701:2: 'vpc'
            {
             before(grammarAccess.getAlmacenamientoAccess().getVpcKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getVpcKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_8__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_8__1"
    // InternalCeffective.g:4710:1: rule__Almacenamiento__Group_8__1 : rule__Almacenamiento__Group_8__1__Impl ;
    public final void rule__Almacenamiento__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4714:1: ( rule__Almacenamiento__Group_8__1__Impl )
            // InternalCeffective.g:4715:2: rule__Almacenamiento__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_8__1"


    // $ANTLR start "rule__Almacenamiento__Group_8__1__Impl"
    // InternalCeffective.g:4721:1: rule__Almacenamiento__Group_8__1__Impl : ( ( rule__Almacenamiento__VpcAssignment_8_1 ) ) ;
    public final void rule__Almacenamiento__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4725:1: ( ( ( rule__Almacenamiento__VpcAssignment_8_1 ) ) )
            // InternalCeffective.g:4726:1: ( ( rule__Almacenamiento__VpcAssignment_8_1 ) )
            {
            // InternalCeffective.g:4726:1: ( ( rule__Almacenamiento__VpcAssignment_8_1 ) )
            // InternalCeffective.g:4727:2: ( rule__Almacenamiento__VpcAssignment_8_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getVpcAssignment_8_1()); 
            // InternalCeffective.g:4728:2: ( rule__Almacenamiento__VpcAssignment_8_1 )
            // InternalCeffective.g:4728:3: rule__Almacenamiento__VpcAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__VpcAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getVpcAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group__0"
    // InternalCeffective.g:4737:1: rule__ServidorBD__Group__0 : rule__ServidorBD__Group__0__Impl rule__ServidorBD__Group__1 ;
    public final void rule__ServidorBD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4741:1: ( rule__ServidorBD__Group__0__Impl rule__ServidorBD__Group__1 )
            // InternalCeffective.g:4742:2: rule__ServidorBD__Group__0__Impl rule__ServidorBD__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ServidorBD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__0"


    // $ANTLR start "rule__ServidorBD__Group__0__Impl"
    // InternalCeffective.g:4749:1: rule__ServidorBD__Group__0__Impl : ( () ) ;
    public final void rule__ServidorBD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4753:1: ( ( () ) )
            // InternalCeffective.g:4754:1: ( () )
            {
            // InternalCeffective.g:4754:1: ( () )
            // InternalCeffective.g:4755:2: ()
            {
             before(grammarAccess.getServidorBDAccess().getServidorBDAction_0()); 
            // InternalCeffective.g:4756:2: ()
            // InternalCeffective.g:4756:3: 
            {
            }

             after(grammarAccess.getServidorBDAccess().getServidorBDAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group__1"
    // InternalCeffective.g:4764:1: rule__ServidorBD__Group__1 : rule__ServidorBD__Group__1__Impl rule__ServidorBD__Group__2 ;
    public final void rule__ServidorBD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4768:1: ( rule__ServidorBD__Group__1__Impl rule__ServidorBD__Group__2 )
            // InternalCeffective.g:4769:2: rule__ServidorBD__Group__1__Impl rule__ServidorBD__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServidorBD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__1"


    // $ANTLR start "rule__ServidorBD__Group__1__Impl"
    // InternalCeffective.g:4776:1: rule__ServidorBD__Group__1__Impl : ( 'ServidorBD' ) ;
    public final void rule__ServidorBD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4780:1: ( ( 'ServidorBD' ) )
            // InternalCeffective.g:4781:1: ( 'ServidorBD' )
            {
            // InternalCeffective.g:4781:1: ( 'ServidorBD' )
            // InternalCeffective.g:4782:2: 'ServidorBD'
            {
             before(grammarAccess.getServidorBDAccess().getServidorBDKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getServidorBDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group__2"
    // InternalCeffective.g:4791:1: rule__ServidorBD__Group__2 : rule__ServidorBD__Group__2__Impl rule__ServidorBD__Group__3 ;
    public final void rule__ServidorBD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4795:1: ( rule__ServidorBD__Group__2__Impl rule__ServidorBD__Group__3 )
            // InternalCeffective.g:4796:2: rule__ServidorBD__Group__2__Impl rule__ServidorBD__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__2"


    // $ANTLR start "rule__ServidorBD__Group__2__Impl"
    // InternalCeffective.g:4803:1: rule__ServidorBD__Group__2__Impl : ( '{' ) ;
    public final void rule__ServidorBD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4807:1: ( ( '{' ) )
            // InternalCeffective.g:4808:1: ( '{' )
            {
            // InternalCeffective.g:4808:1: ( '{' )
            // InternalCeffective.g:4809:2: '{'
            {
             before(grammarAccess.getServidorBDAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__2__Impl"


    // $ANTLR start "rule__ServidorBD__Group__3"
    // InternalCeffective.g:4818:1: rule__ServidorBD__Group__3 : rule__ServidorBD__Group__3__Impl rule__ServidorBD__Group__4 ;
    public final void rule__ServidorBD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4822:1: ( rule__ServidorBD__Group__3__Impl rule__ServidorBD__Group__4 )
            // InternalCeffective.g:4823:2: rule__ServidorBD__Group__3__Impl rule__ServidorBD__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__3"


    // $ANTLR start "rule__ServidorBD__Group__3__Impl"
    // InternalCeffective.g:4830:1: rule__ServidorBD__Group__3__Impl : ( ( rule__ServidorBD__Group_3__0 )? ) ;
    public final void rule__ServidorBD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4834:1: ( ( ( rule__ServidorBD__Group_3__0 )? ) )
            // InternalCeffective.g:4835:1: ( ( rule__ServidorBD__Group_3__0 )? )
            {
            // InternalCeffective.g:4835:1: ( ( rule__ServidorBD__Group_3__0 )? )
            // InternalCeffective.g:4836:2: ( rule__ServidorBD__Group_3__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_3()); 
            // InternalCeffective.g:4837:2: ( rule__ServidorBD__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCeffective.g:4837:3: rule__ServidorBD__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__3__Impl"


    // $ANTLR start "rule__ServidorBD__Group__4"
    // InternalCeffective.g:4845:1: rule__ServidorBD__Group__4 : rule__ServidorBD__Group__4__Impl rule__ServidorBD__Group__5 ;
    public final void rule__ServidorBD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4849:1: ( rule__ServidorBD__Group__4__Impl rule__ServidorBD__Group__5 )
            // InternalCeffective.g:4850:2: rule__ServidorBD__Group__4__Impl rule__ServidorBD__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__4"


    // $ANTLR start "rule__ServidorBD__Group__4__Impl"
    // InternalCeffective.g:4857:1: rule__ServidorBD__Group__4__Impl : ( ( rule__ServidorBD__Group_4__0 )? ) ;
    public final void rule__ServidorBD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4861:1: ( ( ( rule__ServidorBD__Group_4__0 )? ) )
            // InternalCeffective.g:4862:1: ( ( rule__ServidorBD__Group_4__0 )? )
            {
            // InternalCeffective.g:4862:1: ( ( rule__ServidorBD__Group_4__0 )? )
            // InternalCeffective.g:4863:2: ( rule__ServidorBD__Group_4__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_4()); 
            // InternalCeffective.g:4864:2: ( rule__ServidorBD__Group_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==45) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCeffective.g:4864:3: rule__ServidorBD__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__4__Impl"


    // $ANTLR start "rule__ServidorBD__Group__5"
    // InternalCeffective.g:4872:1: rule__ServidorBD__Group__5 : rule__ServidorBD__Group__5__Impl rule__ServidorBD__Group__6 ;
    public final void rule__ServidorBD__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4876:1: ( rule__ServidorBD__Group__5__Impl rule__ServidorBD__Group__6 )
            // InternalCeffective.g:4877:2: rule__ServidorBD__Group__5__Impl rule__ServidorBD__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__5"


    // $ANTLR start "rule__ServidorBD__Group__5__Impl"
    // InternalCeffective.g:4884:1: rule__ServidorBD__Group__5__Impl : ( ( rule__ServidorBD__Group_5__0 )? ) ;
    public final void rule__ServidorBD__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4888:1: ( ( ( rule__ServidorBD__Group_5__0 )? ) )
            // InternalCeffective.g:4889:1: ( ( rule__ServidorBD__Group_5__0 )? )
            {
            // InternalCeffective.g:4889:1: ( ( rule__ServidorBD__Group_5__0 )? )
            // InternalCeffective.g:4890:2: ( rule__ServidorBD__Group_5__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_5()); 
            // InternalCeffective.g:4891:2: ( rule__ServidorBD__Group_5__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCeffective.g:4891:3: rule__ServidorBD__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__5__Impl"


    // $ANTLR start "rule__ServidorBD__Group__6"
    // InternalCeffective.g:4899:1: rule__ServidorBD__Group__6 : rule__ServidorBD__Group__6__Impl rule__ServidorBD__Group__7 ;
    public final void rule__ServidorBD__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4903:1: ( rule__ServidorBD__Group__6__Impl rule__ServidorBD__Group__7 )
            // InternalCeffective.g:4904:2: rule__ServidorBD__Group__6__Impl rule__ServidorBD__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__6"


    // $ANTLR start "rule__ServidorBD__Group__6__Impl"
    // InternalCeffective.g:4911:1: rule__ServidorBD__Group__6__Impl : ( ( rule__ServidorBD__Group_6__0 )? ) ;
    public final void rule__ServidorBD__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4915:1: ( ( ( rule__ServidorBD__Group_6__0 )? ) )
            // InternalCeffective.g:4916:1: ( ( rule__ServidorBD__Group_6__0 )? )
            {
            // InternalCeffective.g:4916:1: ( ( rule__ServidorBD__Group_6__0 )? )
            // InternalCeffective.g:4917:2: ( rule__ServidorBD__Group_6__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_6()); 
            // InternalCeffective.g:4918:2: ( rule__ServidorBD__Group_6__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCeffective.g:4918:3: rule__ServidorBD__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__6__Impl"


    // $ANTLR start "rule__ServidorBD__Group__7"
    // InternalCeffective.g:4926:1: rule__ServidorBD__Group__7 : rule__ServidorBD__Group__7__Impl rule__ServidorBD__Group__8 ;
    public final void rule__ServidorBD__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4930:1: ( rule__ServidorBD__Group__7__Impl rule__ServidorBD__Group__8 )
            // InternalCeffective.g:4931:2: rule__ServidorBD__Group__7__Impl rule__ServidorBD__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__7"


    // $ANTLR start "rule__ServidorBD__Group__7__Impl"
    // InternalCeffective.g:4938:1: rule__ServidorBD__Group__7__Impl : ( ( rule__ServidorBD__Group_7__0 )? ) ;
    public final void rule__ServidorBD__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4942:1: ( ( ( rule__ServidorBD__Group_7__0 )? ) )
            // InternalCeffective.g:4943:1: ( ( rule__ServidorBD__Group_7__0 )? )
            {
            // InternalCeffective.g:4943:1: ( ( rule__ServidorBD__Group_7__0 )? )
            // InternalCeffective.g:4944:2: ( rule__ServidorBD__Group_7__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_7()); 
            // InternalCeffective.g:4945:2: ( rule__ServidorBD__Group_7__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==52) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCeffective.g:4945:3: rule__ServidorBD__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__7__Impl"


    // $ANTLR start "rule__ServidorBD__Group__8"
    // InternalCeffective.g:4953:1: rule__ServidorBD__Group__8 : rule__ServidorBD__Group__8__Impl rule__ServidorBD__Group__9 ;
    public final void rule__ServidorBD__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4957:1: ( rule__ServidorBD__Group__8__Impl rule__ServidorBD__Group__9 )
            // InternalCeffective.g:4958:2: rule__ServidorBD__Group__8__Impl rule__ServidorBD__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__8"


    // $ANTLR start "rule__ServidorBD__Group__8__Impl"
    // InternalCeffective.g:4965:1: rule__ServidorBD__Group__8__Impl : ( ( rule__ServidorBD__Group_8__0 )? ) ;
    public final void rule__ServidorBD__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4969:1: ( ( ( rule__ServidorBD__Group_8__0 )? ) )
            // InternalCeffective.g:4970:1: ( ( rule__ServidorBD__Group_8__0 )? )
            {
            // InternalCeffective.g:4970:1: ( ( rule__ServidorBD__Group_8__0 )? )
            // InternalCeffective.g:4971:2: ( rule__ServidorBD__Group_8__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_8()); 
            // InternalCeffective.g:4972:2: ( rule__ServidorBD__Group_8__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==53) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCeffective.g:4972:3: rule__ServidorBD__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__8__Impl"


    // $ANTLR start "rule__ServidorBD__Group__9"
    // InternalCeffective.g:4980:1: rule__ServidorBD__Group__9 : rule__ServidorBD__Group__9__Impl rule__ServidorBD__Group__10 ;
    public final void rule__ServidorBD__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4984:1: ( rule__ServidorBD__Group__9__Impl rule__ServidorBD__Group__10 )
            // InternalCeffective.g:4985:2: rule__ServidorBD__Group__9__Impl rule__ServidorBD__Group__10
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__9"


    // $ANTLR start "rule__ServidorBD__Group__9__Impl"
    // InternalCeffective.g:4992:1: rule__ServidorBD__Group__9__Impl : ( ( rule__ServidorBD__Group_9__0 )? ) ;
    public final void rule__ServidorBD__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4996:1: ( ( ( rule__ServidorBD__Group_9__0 )? ) )
            // InternalCeffective.g:4997:1: ( ( rule__ServidorBD__Group_9__0 )? )
            {
            // InternalCeffective.g:4997:1: ( ( rule__ServidorBD__Group_9__0 )? )
            // InternalCeffective.g:4998:2: ( rule__ServidorBD__Group_9__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_9()); 
            // InternalCeffective.g:4999:2: ( rule__ServidorBD__Group_9__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCeffective.g:4999:3: rule__ServidorBD__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__9__Impl"


    // $ANTLR start "rule__ServidorBD__Group__10"
    // InternalCeffective.g:5007:1: rule__ServidorBD__Group__10 : rule__ServidorBD__Group__10__Impl rule__ServidorBD__Group__11 ;
    public final void rule__ServidorBD__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5011:1: ( rule__ServidorBD__Group__10__Impl rule__ServidorBD__Group__11 )
            // InternalCeffective.g:5012:2: rule__ServidorBD__Group__10__Impl rule__ServidorBD__Group__11
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBD__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__10"


    // $ANTLR start "rule__ServidorBD__Group__10__Impl"
    // InternalCeffective.g:5019:1: rule__ServidorBD__Group__10__Impl : ( ( rule__ServidorBD__Group_10__0 )? ) ;
    public final void rule__ServidorBD__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5023:1: ( ( ( rule__ServidorBD__Group_10__0 )? ) )
            // InternalCeffective.g:5024:1: ( ( rule__ServidorBD__Group_10__0 )? )
            {
            // InternalCeffective.g:5024:1: ( ( rule__ServidorBD__Group_10__0 )? )
            // InternalCeffective.g:5025:2: ( rule__ServidorBD__Group_10__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_10()); 
            // InternalCeffective.g:5026:2: ( rule__ServidorBD__Group_10__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==28) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCeffective.g:5026:3: rule__ServidorBD__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__10__Impl"


    // $ANTLR start "rule__ServidorBD__Group__11"
    // InternalCeffective.g:5034:1: rule__ServidorBD__Group__11 : rule__ServidorBD__Group__11__Impl ;
    public final void rule__ServidorBD__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5038:1: ( rule__ServidorBD__Group__11__Impl )
            // InternalCeffective.g:5039:2: rule__ServidorBD__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__11"


    // $ANTLR start "rule__ServidorBD__Group__11__Impl"
    // InternalCeffective.g:5045:1: rule__ServidorBD__Group__11__Impl : ( '}' ) ;
    public final void rule__ServidorBD__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5049:1: ( ( '}' ) )
            // InternalCeffective.g:5050:1: ( '}' )
            {
            // InternalCeffective.g:5050:1: ( '}' )
            // InternalCeffective.g:5051:2: '}'
            {
             before(grammarAccess.getServidorBDAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__11__Impl"


    // $ANTLR start "rule__ServidorBD__Group_3__0"
    // InternalCeffective.g:5061:1: rule__ServidorBD__Group_3__0 : rule__ServidorBD__Group_3__0__Impl rule__ServidorBD__Group_3__1 ;
    public final void rule__ServidorBD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5065:1: ( rule__ServidorBD__Group_3__0__Impl rule__ServidorBD__Group_3__1 )
            // InternalCeffective.g:5066:2: rule__ServidorBD__Group_3__0__Impl rule__ServidorBD__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_3__0"


    // $ANTLR start "rule__ServidorBD__Group_3__0__Impl"
    // InternalCeffective.g:5073:1: rule__ServidorBD__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorBD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5077:1: ( ( 'nombre' ) )
            // InternalCeffective.g:5078:1: ( 'nombre' )
            {
            // InternalCeffective.g:5078:1: ( 'nombre' )
            // InternalCeffective.g:5079:2: 'nombre'
            {
             before(grammarAccess.getServidorBDAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_3__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_3__1"
    // InternalCeffective.g:5088:1: rule__ServidorBD__Group_3__1 : rule__ServidorBD__Group_3__1__Impl ;
    public final void rule__ServidorBD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5092:1: ( rule__ServidorBD__Group_3__1__Impl )
            // InternalCeffective.g:5093:2: rule__ServidorBD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_3__1"


    // $ANTLR start "rule__ServidorBD__Group_3__1__Impl"
    // InternalCeffective.g:5099:1: rule__ServidorBD__Group_3__1__Impl : ( ( rule__ServidorBD__NombreAssignment_3_1 ) ) ;
    public final void rule__ServidorBD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5103:1: ( ( ( rule__ServidorBD__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:5104:1: ( ( rule__ServidorBD__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:5104:1: ( ( rule__ServidorBD__NombreAssignment_3_1 ) )
            // InternalCeffective.g:5105:2: ( rule__ServidorBD__NombreAssignment_3_1 )
            {
             before(grammarAccess.getServidorBDAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:5106:2: ( rule__ServidorBD__NombreAssignment_3_1 )
            // InternalCeffective.g:5106:3: rule__ServidorBD__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_3__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_4__0"
    // InternalCeffective.g:5115:1: rule__ServidorBD__Group_4__0 : rule__ServidorBD__Group_4__0__Impl rule__ServidorBD__Group_4__1 ;
    public final void rule__ServidorBD__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5119:1: ( rule__ServidorBD__Group_4__0__Impl rule__ServidorBD__Group_4__1 )
            // InternalCeffective.g:5120:2: rule__ServidorBD__Group_4__0__Impl rule__ServidorBD__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_4__0"


    // $ANTLR start "rule__ServidorBD__Group_4__0__Impl"
    // InternalCeffective.g:5127:1: rule__ServidorBD__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__ServidorBD__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5131:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:5132:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:5132:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:5133:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getServidorBDAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_4__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_4__1"
    // InternalCeffective.g:5142:1: rule__ServidorBD__Group_4__1 : rule__ServidorBD__Group_4__1__Impl ;
    public final void rule__ServidorBD__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5146:1: ( rule__ServidorBD__Group_4__1__Impl )
            // InternalCeffective.g:5147:2: rule__ServidorBD__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_4__1"


    // $ANTLR start "rule__ServidorBD__Group_4__1__Impl"
    // InternalCeffective.g:5153:1: rule__ServidorBD__Group_4__1__Impl : ( ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__ServidorBD__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5157:1: ( ( ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:5158:1: ( ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:5158:1: ( ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:5159:2: ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getServidorBDAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:5160:2: ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:5160:3: rule__ServidorBD__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_4__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_5__0"
    // InternalCeffective.g:5169:1: rule__ServidorBD__Group_5__0 : rule__ServidorBD__Group_5__0__Impl rule__ServidorBD__Group_5__1 ;
    public final void rule__ServidorBD__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5173:1: ( rule__ServidorBD__Group_5__0__Impl rule__ServidorBD__Group_5__1 )
            // InternalCeffective.g:5174:2: rule__ServidorBD__Group_5__0__Impl rule__ServidorBD__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_5__0"


    // $ANTLR start "rule__ServidorBD__Group_5__0__Impl"
    // InternalCeffective.g:5181:1: rule__ServidorBD__Group_5__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__ServidorBD__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5185:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:5186:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:5186:1: ( 'zonaNombre' )
            // InternalCeffective.g:5187:2: 'zonaNombre'
            {
             before(grammarAccess.getServidorBDAccess().getZonaNombreKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getZonaNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_5__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_5__1"
    // InternalCeffective.g:5196:1: rule__ServidorBD__Group_5__1 : rule__ServidorBD__Group_5__1__Impl ;
    public final void rule__ServidorBD__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5200:1: ( rule__ServidorBD__Group_5__1__Impl )
            // InternalCeffective.g:5201:2: rule__ServidorBD__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_5__1"


    // $ANTLR start "rule__ServidorBD__Group_5__1__Impl"
    // InternalCeffective.g:5207:1: rule__ServidorBD__Group_5__1__Impl : ( ( rule__ServidorBD__ZonaNombreAssignment_5_1 ) ) ;
    public final void rule__ServidorBD__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5211:1: ( ( ( rule__ServidorBD__ZonaNombreAssignment_5_1 ) ) )
            // InternalCeffective.g:5212:1: ( ( rule__ServidorBD__ZonaNombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:5212:1: ( ( rule__ServidorBD__ZonaNombreAssignment_5_1 ) )
            // InternalCeffective.g:5213:2: ( rule__ServidorBD__ZonaNombreAssignment_5_1 )
            {
             before(grammarAccess.getServidorBDAccess().getZonaNombreAssignment_5_1()); 
            // InternalCeffective.g:5214:2: ( rule__ServidorBD__ZonaNombreAssignment_5_1 )
            // InternalCeffective.g:5214:3: rule__ServidorBD__ZonaNombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__ZonaNombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getZonaNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_5__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_6__0"
    // InternalCeffective.g:5223:1: rule__ServidorBD__Group_6__0 : rule__ServidorBD__Group_6__0__Impl rule__ServidorBD__Group_6__1 ;
    public final void rule__ServidorBD__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5227:1: ( rule__ServidorBD__Group_6__0__Impl rule__ServidorBD__Group_6__1 )
            // InternalCeffective.g:5228:2: rule__ServidorBD__Group_6__0__Impl rule__ServidorBD__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__ServidorBD__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_6__0"


    // $ANTLR start "rule__ServidorBD__Group_6__0__Impl"
    // InternalCeffective.g:5235:1: rule__ServidorBD__Group_6__0__Impl : ( 'tamano' ) ;
    public final void rule__ServidorBD__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5239:1: ( ( 'tamano' ) )
            // InternalCeffective.g:5240:1: ( 'tamano' )
            {
            // InternalCeffective.g:5240:1: ( 'tamano' )
            // InternalCeffective.g:5241:2: 'tamano'
            {
             before(grammarAccess.getServidorBDAccess().getTamanoKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getTamanoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_6__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_6__1"
    // InternalCeffective.g:5250:1: rule__ServidorBD__Group_6__1 : rule__ServidorBD__Group_6__1__Impl ;
    public final void rule__ServidorBD__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5254:1: ( rule__ServidorBD__Group_6__1__Impl )
            // InternalCeffective.g:5255:2: rule__ServidorBD__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_6__1"


    // $ANTLR start "rule__ServidorBD__Group_6__1__Impl"
    // InternalCeffective.g:5261:1: rule__ServidorBD__Group_6__1__Impl : ( ( rule__ServidorBD__TamanoAssignment_6_1 ) ) ;
    public final void rule__ServidorBD__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5265:1: ( ( ( rule__ServidorBD__TamanoAssignment_6_1 ) ) )
            // InternalCeffective.g:5266:1: ( ( rule__ServidorBD__TamanoAssignment_6_1 ) )
            {
            // InternalCeffective.g:5266:1: ( ( rule__ServidorBD__TamanoAssignment_6_1 ) )
            // InternalCeffective.g:5267:2: ( rule__ServidorBD__TamanoAssignment_6_1 )
            {
             before(grammarAccess.getServidorBDAccess().getTamanoAssignment_6_1()); 
            // InternalCeffective.g:5268:2: ( rule__ServidorBD__TamanoAssignment_6_1 )
            // InternalCeffective.g:5268:3: rule__ServidorBD__TamanoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__TamanoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getTamanoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_6__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_7__0"
    // InternalCeffective.g:5277:1: rule__ServidorBD__Group_7__0 : rule__ServidorBD__Group_7__0__Impl rule__ServidorBD__Group_7__1 ;
    public final void rule__ServidorBD__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5281:1: ( rule__ServidorBD__Group_7__0__Impl rule__ServidorBD__Group_7__1 )
            // InternalCeffective.g:5282:2: rule__ServidorBD__Group_7__0__Impl rule__ServidorBD__Group_7__1
            {
            pushFollow(FOLLOW_32);
            rule__ServidorBD__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_7__0"


    // $ANTLR start "rule__ServidorBD__Group_7__0__Impl"
    // InternalCeffective.g:5289:1: rule__ServidorBD__Group_7__0__Impl : ( 'tipo' ) ;
    public final void rule__ServidorBD__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5293:1: ( ( 'tipo' ) )
            // InternalCeffective.g:5294:1: ( 'tipo' )
            {
            // InternalCeffective.g:5294:1: ( 'tipo' )
            // InternalCeffective.g:5295:2: 'tipo'
            {
             before(grammarAccess.getServidorBDAccess().getTipoKeyword_7_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getTipoKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_7__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_7__1"
    // InternalCeffective.g:5304:1: rule__ServidorBD__Group_7__1 : rule__ServidorBD__Group_7__1__Impl ;
    public final void rule__ServidorBD__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5308:1: ( rule__ServidorBD__Group_7__1__Impl )
            // InternalCeffective.g:5309:2: rule__ServidorBD__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_7__1"


    // $ANTLR start "rule__ServidorBD__Group_7__1__Impl"
    // InternalCeffective.g:5315:1: rule__ServidorBD__Group_7__1__Impl : ( ( rule__ServidorBD__TipoAssignment_7_1 ) ) ;
    public final void rule__ServidorBD__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5319:1: ( ( ( rule__ServidorBD__TipoAssignment_7_1 ) ) )
            // InternalCeffective.g:5320:1: ( ( rule__ServidorBD__TipoAssignment_7_1 ) )
            {
            // InternalCeffective.g:5320:1: ( ( rule__ServidorBD__TipoAssignment_7_1 ) )
            // InternalCeffective.g:5321:2: ( rule__ServidorBD__TipoAssignment_7_1 )
            {
             before(grammarAccess.getServidorBDAccess().getTipoAssignment_7_1()); 
            // InternalCeffective.g:5322:2: ( rule__ServidorBD__TipoAssignment_7_1 )
            // InternalCeffective.g:5322:3: rule__ServidorBD__TipoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__TipoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getTipoAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_7__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_8__0"
    // InternalCeffective.g:5331:1: rule__ServidorBD__Group_8__0 : rule__ServidorBD__Group_8__0__Impl rule__ServidorBD__Group_8__1 ;
    public final void rule__ServidorBD__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5335:1: ( rule__ServidorBD__Group_8__0__Impl rule__ServidorBD__Group_8__1 )
            // InternalCeffective.g:5336:2: rule__ServidorBD__Group_8__0__Impl rule__ServidorBD__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_8__0"


    // $ANTLR start "rule__ServidorBD__Group_8__0__Impl"
    // InternalCeffective.g:5343:1: rule__ServidorBD__Group_8__0__Impl : ( 'sistemaManejador' ) ;
    public final void rule__ServidorBD__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5347:1: ( ( 'sistemaManejador' ) )
            // InternalCeffective.g:5348:1: ( 'sistemaManejador' )
            {
            // InternalCeffective.g:5348:1: ( 'sistemaManejador' )
            // InternalCeffective.g:5349:2: 'sistemaManejador'
            {
             before(grammarAccess.getServidorBDAccess().getSistemaManejadorKeyword_8_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getSistemaManejadorKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_8__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_8__1"
    // InternalCeffective.g:5358:1: rule__ServidorBD__Group_8__1 : rule__ServidorBD__Group_8__1__Impl ;
    public final void rule__ServidorBD__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5362:1: ( rule__ServidorBD__Group_8__1__Impl )
            // InternalCeffective.g:5363:2: rule__ServidorBD__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_8__1"


    // $ANTLR start "rule__ServidorBD__Group_8__1__Impl"
    // InternalCeffective.g:5369:1: rule__ServidorBD__Group_8__1__Impl : ( ( rule__ServidorBD__SistemaManejadorAssignment_8_1 ) ) ;
    public final void rule__ServidorBD__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5373:1: ( ( ( rule__ServidorBD__SistemaManejadorAssignment_8_1 ) ) )
            // InternalCeffective.g:5374:1: ( ( rule__ServidorBD__SistemaManejadorAssignment_8_1 ) )
            {
            // InternalCeffective.g:5374:1: ( ( rule__ServidorBD__SistemaManejadorAssignment_8_1 ) )
            // InternalCeffective.g:5375:2: ( rule__ServidorBD__SistemaManejadorAssignment_8_1 )
            {
             before(grammarAccess.getServidorBDAccess().getSistemaManejadorAssignment_8_1()); 
            // InternalCeffective.g:5376:2: ( rule__ServidorBD__SistemaManejadorAssignment_8_1 )
            // InternalCeffective.g:5376:3: rule__ServidorBD__SistemaManejadorAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__SistemaManejadorAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getSistemaManejadorAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__0"
    // InternalCeffective.g:5385:1: rule__ServidorBD__Group_9__0 : rule__ServidorBD__Group_9__0__Impl rule__ServidorBD__Group_9__1 ;
    public final void rule__ServidorBD__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5389:1: ( rule__ServidorBD__Group_9__0__Impl rule__ServidorBD__Group_9__1 )
            // InternalCeffective.g:5390:2: rule__ServidorBD__Group_9__0__Impl rule__ServidorBD__Group_9__1
            {
            pushFollow(FOLLOW_19);
            rule__ServidorBD__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__0"


    // $ANTLR start "rule__ServidorBD__Group_9__0__Impl"
    // InternalCeffective.g:5397:1: rule__ServidorBD__Group_9__0__Impl : ( 'recursos' ) ;
    public final void rule__ServidorBD__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5401:1: ( ( 'recursos' ) )
            // InternalCeffective.g:5402:1: ( 'recursos' )
            {
            // InternalCeffective.g:5402:1: ( 'recursos' )
            // InternalCeffective.g:5403:2: 'recursos'
            {
             before(grammarAccess.getServidorBDAccess().getRecursosKeyword_9_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getRecursosKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__1"
    // InternalCeffective.g:5412:1: rule__ServidorBD__Group_9__1 : rule__ServidorBD__Group_9__1__Impl rule__ServidorBD__Group_9__2 ;
    public final void rule__ServidorBD__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5416:1: ( rule__ServidorBD__Group_9__1__Impl rule__ServidorBD__Group_9__2 )
            // InternalCeffective.g:5417:2: rule__ServidorBD__Group_9__1__Impl rule__ServidorBD__Group_9__2
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__1"


    // $ANTLR start "rule__ServidorBD__Group_9__1__Impl"
    // InternalCeffective.g:5424:1: rule__ServidorBD__Group_9__1__Impl : ( '(' ) ;
    public final void rule__ServidorBD__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5428:1: ( ( '(' ) )
            // InternalCeffective.g:5429:1: ( '(' )
            {
            // InternalCeffective.g:5429:1: ( '(' )
            // InternalCeffective.g:5430:2: '('
            {
             before(grammarAccess.getServidorBDAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__2"
    // InternalCeffective.g:5439:1: rule__ServidorBD__Group_9__2 : rule__ServidorBD__Group_9__2__Impl rule__ServidorBD__Group_9__3 ;
    public final void rule__ServidorBD__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5443:1: ( rule__ServidorBD__Group_9__2__Impl rule__ServidorBD__Group_9__3 )
            // InternalCeffective.g:5444:2: rule__ServidorBD__Group_9__2__Impl rule__ServidorBD__Group_9__3
            {
            pushFollow(FOLLOW_20);
            rule__ServidorBD__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__2"


    // $ANTLR start "rule__ServidorBD__Group_9__2__Impl"
    // InternalCeffective.g:5451:1: rule__ServidorBD__Group_9__2__Impl : ( ( rule__ServidorBD__RecursosAssignment_9_2 ) ) ;
    public final void rule__ServidorBD__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5455:1: ( ( ( rule__ServidorBD__RecursosAssignment_9_2 ) ) )
            // InternalCeffective.g:5456:1: ( ( rule__ServidorBD__RecursosAssignment_9_2 ) )
            {
            // InternalCeffective.g:5456:1: ( ( rule__ServidorBD__RecursosAssignment_9_2 ) )
            // InternalCeffective.g:5457:2: ( rule__ServidorBD__RecursosAssignment_9_2 )
            {
             before(grammarAccess.getServidorBDAccess().getRecursosAssignment_9_2()); 
            // InternalCeffective.g:5458:2: ( rule__ServidorBD__RecursosAssignment_9_2 )
            // InternalCeffective.g:5458:3: rule__ServidorBD__RecursosAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__RecursosAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getRecursosAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__2__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__3"
    // InternalCeffective.g:5466:1: rule__ServidorBD__Group_9__3 : rule__ServidorBD__Group_9__3__Impl rule__ServidorBD__Group_9__4 ;
    public final void rule__ServidorBD__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5470:1: ( rule__ServidorBD__Group_9__3__Impl rule__ServidorBD__Group_9__4 )
            // InternalCeffective.g:5471:2: rule__ServidorBD__Group_9__3__Impl rule__ServidorBD__Group_9__4
            {
            pushFollow(FOLLOW_20);
            rule__ServidorBD__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__3"


    // $ANTLR start "rule__ServidorBD__Group_9__3__Impl"
    // InternalCeffective.g:5478:1: rule__ServidorBD__Group_9__3__Impl : ( ( rule__ServidorBD__Group_9_3__0 )* ) ;
    public final void rule__ServidorBD__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5482:1: ( ( ( rule__ServidorBD__Group_9_3__0 )* ) )
            // InternalCeffective.g:5483:1: ( ( rule__ServidorBD__Group_9_3__0 )* )
            {
            // InternalCeffective.g:5483:1: ( ( rule__ServidorBD__Group_9_3__0 )* )
            // InternalCeffective.g:5484:2: ( rule__ServidorBD__Group_9_3__0 )*
            {
             before(grammarAccess.getServidorBDAccess().getGroup_9_3()); 
            // InternalCeffective.g:5485:2: ( rule__ServidorBD__Group_9_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==29) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalCeffective.g:5485:3: rule__ServidorBD__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ServidorBD__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getServidorBDAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__3__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__4"
    // InternalCeffective.g:5493:1: rule__ServidorBD__Group_9__4 : rule__ServidorBD__Group_9__4__Impl ;
    public final void rule__ServidorBD__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5497:1: ( rule__ServidorBD__Group_9__4__Impl )
            // InternalCeffective.g:5498:2: rule__ServidorBD__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__4"


    // $ANTLR start "rule__ServidorBD__Group_9__4__Impl"
    // InternalCeffective.g:5504:1: rule__ServidorBD__Group_9__4__Impl : ( ')' ) ;
    public final void rule__ServidorBD__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5508:1: ( ( ')' ) )
            // InternalCeffective.g:5509:1: ( ')' )
            {
            // InternalCeffective.g:5509:1: ( ')' )
            // InternalCeffective.g:5510:2: ')'
            {
             before(grammarAccess.getServidorBDAccess().getRightParenthesisKeyword_9_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__4__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9_3__0"
    // InternalCeffective.g:5520:1: rule__ServidorBD__Group_9_3__0 : rule__ServidorBD__Group_9_3__0__Impl rule__ServidorBD__Group_9_3__1 ;
    public final void rule__ServidorBD__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5524:1: ( rule__ServidorBD__Group_9_3__0__Impl rule__ServidorBD__Group_9_3__1 )
            // InternalCeffective.g:5525:2: rule__ServidorBD__Group_9_3__0__Impl rule__ServidorBD__Group_9_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9_3__0"


    // $ANTLR start "rule__ServidorBD__Group_9_3__0__Impl"
    // InternalCeffective.g:5532:1: rule__ServidorBD__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ServidorBD__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5536:1: ( ( ',' ) )
            // InternalCeffective.g:5537:1: ( ',' )
            {
            // InternalCeffective.g:5537:1: ( ',' )
            // InternalCeffective.g:5538:2: ','
            {
             before(grammarAccess.getServidorBDAccess().getCommaKeyword_9_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9_3__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9_3__1"
    // InternalCeffective.g:5547:1: rule__ServidorBD__Group_9_3__1 : rule__ServidorBD__Group_9_3__1__Impl ;
    public final void rule__ServidorBD__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5551:1: ( rule__ServidorBD__Group_9_3__1__Impl )
            // InternalCeffective.g:5552:2: rule__ServidorBD__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9_3__1"


    // $ANTLR start "rule__ServidorBD__Group_9_3__1__Impl"
    // InternalCeffective.g:5558:1: rule__ServidorBD__Group_9_3__1__Impl : ( ( rule__ServidorBD__RecursosAssignment_9_3_1 ) ) ;
    public final void rule__ServidorBD__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5562:1: ( ( ( rule__ServidorBD__RecursosAssignment_9_3_1 ) ) )
            // InternalCeffective.g:5563:1: ( ( rule__ServidorBD__RecursosAssignment_9_3_1 ) )
            {
            // InternalCeffective.g:5563:1: ( ( rule__ServidorBD__RecursosAssignment_9_3_1 ) )
            // InternalCeffective.g:5564:2: ( rule__ServidorBD__RecursosAssignment_9_3_1 )
            {
             before(grammarAccess.getServidorBDAccess().getRecursosAssignment_9_3_1()); 
            // InternalCeffective.g:5565:2: ( rule__ServidorBD__RecursosAssignment_9_3_1 )
            // InternalCeffective.g:5565:3: rule__ServidorBD__RecursosAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__RecursosAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getRecursosAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9_3__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_10__0"
    // InternalCeffective.g:5574:1: rule__ServidorBD__Group_10__0 : rule__ServidorBD__Group_10__0__Impl rule__ServidorBD__Group_10__1 ;
    public final void rule__ServidorBD__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5578:1: ( rule__ServidorBD__Group_10__0__Impl rule__ServidorBD__Group_10__1 )
            // InternalCeffective.g:5579:2: rule__ServidorBD__Group_10__0__Impl rule__ServidorBD__Group_10__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_10__0"


    // $ANTLR start "rule__ServidorBD__Group_10__0__Impl"
    // InternalCeffective.g:5586:1: rule__ServidorBD__Group_10__0__Impl : ( 'vpc' ) ;
    public final void rule__ServidorBD__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5590:1: ( ( 'vpc' ) )
            // InternalCeffective.g:5591:1: ( 'vpc' )
            {
            // InternalCeffective.g:5591:1: ( 'vpc' )
            // InternalCeffective.g:5592:2: 'vpc'
            {
             before(grammarAccess.getServidorBDAccess().getVpcKeyword_10_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getVpcKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_10__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_10__1"
    // InternalCeffective.g:5601:1: rule__ServidorBD__Group_10__1 : rule__ServidorBD__Group_10__1__Impl ;
    public final void rule__ServidorBD__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5605:1: ( rule__ServidorBD__Group_10__1__Impl )
            // InternalCeffective.g:5606:2: rule__ServidorBD__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_10__1"


    // $ANTLR start "rule__ServidorBD__Group_10__1__Impl"
    // InternalCeffective.g:5612:1: rule__ServidorBD__Group_10__1__Impl : ( ( rule__ServidorBD__VpcAssignment_10_1 ) ) ;
    public final void rule__ServidorBD__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5616:1: ( ( ( rule__ServidorBD__VpcAssignment_10_1 ) ) )
            // InternalCeffective.g:5617:1: ( ( rule__ServidorBD__VpcAssignment_10_1 ) )
            {
            // InternalCeffective.g:5617:1: ( ( rule__ServidorBD__VpcAssignment_10_1 ) )
            // InternalCeffective.g:5618:2: ( rule__ServidorBD__VpcAssignment_10_1 )
            {
             before(grammarAccess.getServidorBDAccess().getVpcAssignment_10_1()); 
            // InternalCeffective.g:5619:2: ( rule__ServidorBD__VpcAssignment_10_1 )
            // InternalCeffective.g:5619:3: rule__ServidorBD__VpcAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__VpcAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getVpcAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_10__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__0"
    // InternalCeffective.g:5628:1: rule__Servidor_Impl__Group__0 : rule__Servidor_Impl__Group__0__Impl rule__Servidor_Impl__Group__1 ;
    public final void rule__Servidor_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5632:1: ( rule__Servidor_Impl__Group__0__Impl rule__Servidor_Impl__Group__1 )
            // InternalCeffective.g:5633:2: rule__Servidor_Impl__Group__0__Impl rule__Servidor_Impl__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Servidor_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__0"


    // $ANTLR start "rule__Servidor_Impl__Group__0__Impl"
    // InternalCeffective.g:5640:1: rule__Servidor_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Servidor_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5644:1: ( ( () ) )
            // InternalCeffective.g:5645:1: ( () )
            {
            // InternalCeffective.g:5645:1: ( () )
            // InternalCeffective.g:5646:2: ()
            {
             before(grammarAccess.getServidor_ImplAccess().getServidorAction_0()); 
            // InternalCeffective.g:5647:2: ()
            // InternalCeffective.g:5647:3: 
            {
            }

             after(grammarAccess.getServidor_ImplAccess().getServidorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__1"
    // InternalCeffective.g:5655:1: rule__Servidor_Impl__Group__1 : rule__Servidor_Impl__Group__1__Impl rule__Servidor_Impl__Group__2 ;
    public final void rule__Servidor_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5659:1: ( rule__Servidor_Impl__Group__1__Impl rule__Servidor_Impl__Group__2 )
            // InternalCeffective.g:5660:2: rule__Servidor_Impl__Group__1__Impl rule__Servidor_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Servidor_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__1"


    // $ANTLR start "rule__Servidor_Impl__Group__1__Impl"
    // InternalCeffective.g:5667:1: rule__Servidor_Impl__Group__1__Impl : ( 'Servidor' ) ;
    public final void rule__Servidor_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5671:1: ( ( 'Servidor' ) )
            // InternalCeffective.g:5672:1: ( 'Servidor' )
            {
            // InternalCeffective.g:5672:1: ( 'Servidor' )
            // InternalCeffective.g:5673:2: 'Servidor'
            {
             before(grammarAccess.getServidor_ImplAccess().getServidorKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getServidorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__2"
    // InternalCeffective.g:5682:1: rule__Servidor_Impl__Group__2 : rule__Servidor_Impl__Group__2__Impl rule__Servidor_Impl__Group__3 ;
    public final void rule__Servidor_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5686:1: ( rule__Servidor_Impl__Group__2__Impl rule__Servidor_Impl__Group__3 )
            // InternalCeffective.g:5687:2: rule__Servidor_Impl__Group__2__Impl rule__Servidor_Impl__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Servidor_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__2"


    // $ANTLR start "rule__Servidor_Impl__Group__2__Impl"
    // InternalCeffective.g:5694:1: rule__Servidor_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Servidor_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5698:1: ( ( '{' ) )
            // InternalCeffective.g:5699:1: ( '{' )
            {
            // InternalCeffective.g:5699:1: ( '{' )
            // InternalCeffective.g:5700:2: '{'
            {
             before(grammarAccess.getServidor_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__2__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__3"
    // InternalCeffective.g:5709:1: rule__Servidor_Impl__Group__3 : rule__Servidor_Impl__Group__3__Impl rule__Servidor_Impl__Group__4 ;
    public final void rule__Servidor_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5713:1: ( rule__Servidor_Impl__Group__3__Impl rule__Servidor_Impl__Group__4 )
            // InternalCeffective.g:5714:2: rule__Servidor_Impl__Group__3__Impl rule__Servidor_Impl__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Servidor_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__3"


    // $ANTLR start "rule__Servidor_Impl__Group__3__Impl"
    // InternalCeffective.g:5721:1: rule__Servidor_Impl__Group__3__Impl : ( ( rule__Servidor_Impl__Group_3__0 )? ) ;
    public final void rule__Servidor_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5725:1: ( ( ( rule__Servidor_Impl__Group_3__0 )? ) )
            // InternalCeffective.g:5726:1: ( ( rule__Servidor_Impl__Group_3__0 )? )
            {
            // InternalCeffective.g:5726:1: ( ( rule__Servidor_Impl__Group_3__0 )? )
            // InternalCeffective.g:5727:2: ( rule__Servidor_Impl__Group_3__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_3()); 
            // InternalCeffective.g:5728:2: ( rule__Servidor_Impl__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==27) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCeffective.g:5728:3: rule__Servidor_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__3__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__4"
    // InternalCeffective.g:5736:1: rule__Servidor_Impl__Group__4 : rule__Servidor_Impl__Group__4__Impl rule__Servidor_Impl__Group__5 ;
    public final void rule__Servidor_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5740:1: ( rule__Servidor_Impl__Group__4__Impl rule__Servidor_Impl__Group__5 )
            // InternalCeffective.g:5741:2: rule__Servidor_Impl__Group__4__Impl rule__Servidor_Impl__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Servidor_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__4"


    // $ANTLR start "rule__Servidor_Impl__Group__4__Impl"
    // InternalCeffective.g:5748:1: rule__Servidor_Impl__Group__4__Impl : ( ( rule__Servidor_Impl__Group_4__0 )? ) ;
    public final void rule__Servidor_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5752:1: ( ( ( rule__Servidor_Impl__Group_4__0 )? ) )
            // InternalCeffective.g:5753:1: ( ( rule__Servidor_Impl__Group_4__0 )? )
            {
            // InternalCeffective.g:5753:1: ( ( rule__Servidor_Impl__Group_4__0 )? )
            // InternalCeffective.g:5754:2: ( rule__Servidor_Impl__Group_4__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_4()); 
            // InternalCeffective.g:5755:2: ( rule__Servidor_Impl__Group_4__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==45) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCeffective.g:5755:3: rule__Servidor_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__4__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__5"
    // InternalCeffective.g:5763:1: rule__Servidor_Impl__Group__5 : rule__Servidor_Impl__Group__5__Impl rule__Servidor_Impl__Group__6 ;
    public final void rule__Servidor_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5767:1: ( rule__Servidor_Impl__Group__5__Impl rule__Servidor_Impl__Group__6 )
            // InternalCeffective.g:5768:2: rule__Servidor_Impl__Group__5__Impl rule__Servidor_Impl__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Servidor_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__5"


    // $ANTLR start "rule__Servidor_Impl__Group__5__Impl"
    // InternalCeffective.g:5775:1: rule__Servidor_Impl__Group__5__Impl : ( ( rule__Servidor_Impl__Group_5__0 )? ) ;
    public final void rule__Servidor_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5779:1: ( ( ( rule__Servidor_Impl__Group_5__0 )? ) )
            // InternalCeffective.g:5780:1: ( ( rule__Servidor_Impl__Group_5__0 )? )
            {
            // InternalCeffective.g:5780:1: ( ( rule__Servidor_Impl__Group_5__0 )? )
            // InternalCeffective.g:5781:2: ( rule__Servidor_Impl__Group_5__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_5()); 
            // InternalCeffective.g:5782:2: ( rule__Servidor_Impl__Group_5__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCeffective.g:5782:3: rule__Servidor_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__5__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__6"
    // InternalCeffective.g:5790:1: rule__Servidor_Impl__Group__6 : rule__Servidor_Impl__Group__6__Impl rule__Servidor_Impl__Group__7 ;
    public final void rule__Servidor_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5794:1: ( rule__Servidor_Impl__Group__6__Impl rule__Servidor_Impl__Group__7 )
            // InternalCeffective.g:5795:2: rule__Servidor_Impl__Group__6__Impl rule__Servidor_Impl__Group__7
            {
            pushFollow(FOLLOW_34);
            rule__Servidor_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__6"


    // $ANTLR start "rule__Servidor_Impl__Group__6__Impl"
    // InternalCeffective.g:5802:1: rule__Servidor_Impl__Group__6__Impl : ( ( rule__Servidor_Impl__Group_6__0 )? ) ;
    public final void rule__Servidor_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5806:1: ( ( ( rule__Servidor_Impl__Group_6__0 )? ) )
            // InternalCeffective.g:5807:1: ( ( rule__Servidor_Impl__Group_6__0 )? )
            {
            // InternalCeffective.g:5807:1: ( ( rule__Servidor_Impl__Group_6__0 )? )
            // InternalCeffective.g:5808:2: ( rule__Servidor_Impl__Group_6__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_6()); 
            // InternalCeffective.g:5809:2: ( rule__Servidor_Impl__Group_6__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCeffective.g:5809:3: rule__Servidor_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__6__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__7"
    // InternalCeffective.g:5817:1: rule__Servidor_Impl__Group__7 : rule__Servidor_Impl__Group__7__Impl rule__Servidor_Impl__Group__8 ;
    public final void rule__Servidor_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5821:1: ( rule__Servidor_Impl__Group__7__Impl rule__Servidor_Impl__Group__8 )
            // InternalCeffective.g:5822:2: rule__Servidor_Impl__Group__7__Impl rule__Servidor_Impl__Group__8
            {
            pushFollow(FOLLOW_34);
            rule__Servidor_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__7"


    // $ANTLR start "rule__Servidor_Impl__Group__7__Impl"
    // InternalCeffective.g:5829:1: rule__Servidor_Impl__Group__7__Impl : ( ( rule__Servidor_Impl__Group_7__0 )? ) ;
    public final void rule__Servidor_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5833:1: ( ( ( rule__Servidor_Impl__Group_7__0 )? ) )
            // InternalCeffective.g:5834:1: ( ( rule__Servidor_Impl__Group_7__0 )? )
            {
            // InternalCeffective.g:5834:1: ( ( rule__Servidor_Impl__Group_7__0 )? )
            // InternalCeffective.g:5835:2: ( rule__Servidor_Impl__Group_7__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_7()); 
            // InternalCeffective.g:5836:2: ( rule__Servidor_Impl__Group_7__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==37) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCeffective.g:5836:3: rule__Servidor_Impl__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__7__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__8"
    // InternalCeffective.g:5844:1: rule__Servidor_Impl__Group__8 : rule__Servidor_Impl__Group__8__Impl rule__Servidor_Impl__Group__9 ;
    public final void rule__Servidor_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5848:1: ( rule__Servidor_Impl__Group__8__Impl rule__Servidor_Impl__Group__9 )
            // InternalCeffective.g:5849:2: rule__Servidor_Impl__Group__8__Impl rule__Servidor_Impl__Group__9
            {
            pushFollow(FOLLOW_34);
            rule__Servidor_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__8"


    // $ANTLR start "rule__Servidor_Impl__Group__8__Impl"
    // InternalCeffective.g:5856:1: rule__Servidor_Impl__Group__8__Impl : ( ( rule__Servidor_Impl__Group_8__0 )? ) ;
    public final void rule__Servidor_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5860:1: ( ( ( rule__Servidor_Impl__Group_8__0 )? ) )
            // InternalCeffective.g:5861:1: ( ( rule__Servidor_Impl__Group_8__0 )? )
            {
            // InternalCeffective.g:5861:1: ( ( rule__Servidor_Impl__Group_8__0 )? )
            // InternalCeffective.g:5862:2: ( rule__Servidor_Impl__Group_8__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_8()); 
            // InternalCeffective.g:5863:2: ( rule__Servidor_Impl__Group_8__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==28) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCeffective.g:5863:3: rule__Servidor_Impl__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__8__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__9"
    // InternalCeffective.g:5871:1: rule__Servidor_Impl__Group__9 : rule__Servidor_Impl__Group__9__Impl ;
    public final void rule__Servidor_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5875:1: ( rule__Servidor_Impl__Group__9__Impl )
            // InternalCeffective.g:5876:2: rule__Servidor_Impl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__9"


    // $ANTLR start "rule__Servidor_Impl__Group__9__Impl"
    // InternalCeffective.g:5882:1: rule__Servidor_Impl__Group__9__Impl : ( '}' ) ;
    public final void rule__Servidor_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5886:1: ( ( '}' ) )
            // InternalCeffective.g:5887:1: ( '}' )
            {
            // InternalCeffective.g:5887:1: ( '}' )
            // InternalCeffective.g:5888:2: '}'
            {
             before(grammarAccess.getServidor_ImplAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__9__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_3__0"
    // InternalCeffective.g:5898:1: rule__Servidor_Impl__Group_3__0 : rule__Servidor_Impl__Group_3__0__Impl rule__Servidor_Impl__Group_3__1 ;
    public final void rule__Servidor_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5902:1: ( rule__Servidor_Impl__Group_3__0__Impl rule__Servidor_Impl__Group_3__1 )
            // InternalCeffective.g:5903:2: rule__Servidor_Impl__Group_3__0__Impl rule__Servidor_Impl__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_3__0"


    // $ANTLR start "rule__Servidor_Impl__Group_3__0__Impl"
    // InternalCeffective.g:5910:1: rule__Servidor_Impl__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Servidor_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5914:1: ( ( 'nombre' ) )
            // InternalCeffective.g:5915:1: ( 'nombre' )
            {
            // InternalCeffective.g:5915:1: ( 'nombre' )
            // InternalCeffective.g:5916:2: 'nombre'
            {
             before(grammarAccess.getServidor_ImplAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_3__1"
    // InternalCeffective.g:5925:1: rule__Servidor_Impl__Group_3__1 : rule__Servidor_Impl__Group_3__1__Impl ;
    public final void rule__Servidor_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5929:1: ( rule__Servidor_Impl__Group_3__1__Impl )
            // InternalCeffective.g:5930:2: rule__Servidor_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_3__1"


    // $ANTLR start "rule__Servidor_Impl__Group_3__1__Impl"
    // InternalCeffective.g:5936:1: rule__Servidor_Impl__Group_3__1__Impl : ( ( rule__Servidor_Impl__NombreAssignment_3_1 ) ) ;
    public final void rule__Servidor_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5940:1: ( ( ( rule__Servidor_Impl__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:5941:1: ( ( rule__Servidor_Impl__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:5941:1: ( ( rule__Servidor_Impl__NombreAssignment_3_1 ) )
            // InternalCeffective.g:5942:2: ( rule__Servidor_Impl__NombreAssignment_3_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:5943:2: ( rule__Servidor_Impl__NombreAssignment_3_1 )
            // InternalCeffective.g:5943:3: rule__Servidor_Impl__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_4__0"
    // InternalCeffective.g:5952:1: rule__Servidor_Impl__Group_4__0 : rule__Servidor_Impl__Group_4__0__Impl rule__Servidor_Impl__Group_4__1 ;
    public final void rule__Servidor_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5956:1: ( rule__Servidor_Impl__Group_4__0__Impl rule__Servidor_Impl__Group_4__1 )
            // InternalCeffective.g:5957:2: rule__Servidor_Impl__Group_4__0__Impl rule__Servidor_Impl__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_4__0"


    // $ANTLR start "rule__Servidor_Impl__Group_4__0__Impl"
    // InternalCeffective.g:5964:1: rule__Servidor_Impl__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__Servidor_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5968:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:5969:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:5969:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:5970:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_4__1"
    // InternalCeffective.g:5979:1: rule__Servidor_Impl__Group_4__1 : rule__Servidor_Impl__Group_4__1__Impl ;
    public final void rule__Servidor_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5983:1: ( rule__Servidor_Impl__Group_4__1__Impl )
            // InternalCeffective.g:5984:2: rule__Servidor_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_4__1"


    // $ANTLR start "rule__Servidor_Impl__Group_4__1__Impl"
    // InternalCeffective.g:5990:1: rule__Servidor_Impl__Group_4__1__Impl : ( ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__Servidor_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5994:1: ( ( ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:5995:1: ( ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:5995:1: ( ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:5996:2: ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:5997:2: ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:5997:3: rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_5__0"
    // InternalCeffective.g:6006:1: rule__Servidor_Impl__Group_5__0 : rule__Servidor_Impl__Group_5__0__Impl rule__Servidor_Impl__Group_5__1 ;
    public final void rule__Servidor_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6010:1: ( rule__Servidor_Impl__Group_5__0__Impl rule__Servidor_Impl__Group_5__1 )
            // InternalCeffective.g:6011:2: rule__Servidor_Impl__Group_5__0__Impl rule__Servidor_Impl__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_5__0"


    // $ANTLR start "rule__Servidor_Impl__Group_5__0__Impl"
    // InternalCeffective.g:6018:1: rule__Servidor_Impl__Group_5__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__Servidor_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6022:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:6023:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:6023:1: ( 'zonaNombre' )
            // InternalCeffective.g:6024:2: 'zonaNombre'
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaNombreKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getZonaNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_5__1"
    // InternalCeffective.g:6033:1: rule__Servidor_Impl__Group_5__1 : rule__Servidor_Impl__Group_5__1__Impl ;
    public final void rule__Servidor_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6037:1: ( rule__Servidor_Impl__Group_5__1__Impl )
            // InternalCeffective.g:6038:2: rule__Servidor_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_5__1"


    // $ANTLR start "rule__Servidor_Impl__Group_5__1__Impl"
    // InternalCeffective.g:6044:1: rule__Servidor_Impl__Group_5__1__Impl : ( ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 ) ) ;
    public final void rule__Servidor_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6048:1: ( ( ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 ) ) )
            // InternalCeffective.g:6049:1: ( ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:6049:1: ( ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 ) )
            // InternalCeffective.g:6050:2: ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaNombreAssignment_5_1()); 
            // InternalCeffective.g:6051:2: ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 )
            // InternalCeffective.g:6051:3: rule__Servidor_Impl__ZonaNombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__ZonaNombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getZonaNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_6__0"
    // InternalCeffective.g:6060:1: rule__Servidor_Impl__Group_6__0 : rule__Servidor_Impl__Group_6__0__Impl rule__Servidor_Impl__Group_6__1 ;
    public final void rule__Servidor_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6064:1: ( rule__Servidor_Impl__Group_6__0__Impl rule__Servidor_Impl__Group_6__1 )
            // InternalCeffective.g:6065:2: rule__Servidor_Impl__Group_6__0__Impl rule__Servidor_Impl__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__Servidor_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_6__0"


    // $ANTLR start "rule__Servidor_Impl__Group_6__0__Impl"
    // InternalCeffective.g:6072:1: rule__Servidor_Impl__Group_6__0__Impl : ( 'tamano' ) ;
    public final void rule__Servidor_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6076:1: ( ( 'tamano' ) )
            // InternalCeffective.g:6077:1: ( 'tamano' )
            {
            // InternalCeffective.g:6077:1: ( 'tamano' )
            // InternalCeffective.g:6078:2: 'tamano'
            {
             before(grammarAccess.getServidor_ImplAccess().getTamanoKeyword_6_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getTamanoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_6__1"
    // InternalCeffective.g:6087:1: rule__Servidor_Impl__Group_6__1 : rule__Servidor_Impl__Group_6__1__Impl ;
    public final void rule__Servidor_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6091:1: ( rule__Servidor_Impl__Group_6__1__Impl )
            // InternalCeffective.g:6092:2: rule__Servidor_Impl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_6__1"


    // $ANTLR start "rule__Servidor_Impl__Group_6__1__Impl"
    // InternalCeffective.g:6098:1: rule__Servidor_Impl__Group_6__1__Impl : ( ( rule__Servidor_Impl__TamanoAssignment_6_1 ) ) ;
    public final void rule__Servidor_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6102:1: ( ( ( rule__Servidor_Impl__TamanoAssignment_6_1 ) ) )
            // InternalCeffective.g:6103:1: ( ( rule__Servidor_Impl__TamanoAssignment_6_1 ) )
            {
            // InternalCeffective.g:6103:1: ( ( rule__Servidor_Impl__TamanoAssignment_6_1 ) )
            // InternalCeffective.g:6104:2: ( rule__Servidor_Impl__TamanoAssignment_6_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getTamanoAssignment_6_1()); 
            // InternalCeffective.g:6105:2: ( rule__Servidor_Impl__TamanoAssignment_6_1 )
            // InternalCeffective.g:6105:3: rule__Servidor_Impl__TamanoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__TamanoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getTamanoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__0"
    // InternalCeffective.g:6114:1: rule__Servidor_Impl__Group_7__0 : rule__Servidor_Impl__Group_7__0__Impl rule__Servidor_Impl__Group_7__1 ;
    public final void rule__Servidor_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6118:1: ( rule__Servidor_Impl__Group_7__0__Impl rule__Servidor_Impl__Group_7__1 )
            // InternalCeffective.g:6119:2: rule__Servidor_Impl__Group_7__0__Impl rule__Servidor_Impl__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__Servidor_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__0"


    // $ANTLR start "rule__Servidor_Impl__Group_7__0__Impl"
    // InternalCeffective.g:6126:1: rule__Servidor_Impl__Group_7__0__Impl : ( 'recursos' ) ;
    public final void rule__Servidor_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6130:1: ( ( 'recursos' ) )
            // InternalCeffective.g:6131:1: ( 'recursos' )
            {
            // InternalCeffective.g:6131:1: ( 'recursos' )
            // InternalCeffective.g:6132:2: 'recursos'
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getRecursosKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__1"
    // InternalCeffective.g:6141:1: rule__Servidor_Impl__Group_7__1 : rule__Servidor_Impl__Group_7__1__Impl rule__Servidor_Impl__Group_7__2 ;
    public final void rule__Servidor_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6145:1: ( rule__Servidor_Impl__Group_7__1__Impl rule__Servidor_Impl__Group_7__2 )
            // InternalCeffective.g:6146:2: rule__Servidor_Impl__Group_7__1__Impl rule__Servidor_Impl__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__1"


    // $ANTLR start "rule__Servidor_Impl__Group_7__1__Impl"
    // InternalCeffective.g:6153:1: rule__Servidor_Impl__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Servidor_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6157:1: ( ( '(' ) )
            // InternalCeffective.g:6158:1: ( '(' )
            {
            // InternalCeffective.g:6158:1: ( '(' )
            // InternalCeffective.g:6159:2: '('
            {
             before(grammarAccess.getServidor_ImplAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__2"
    // InternalCeffective.g:6168:1: rule__Servidor_Impl__Group_7__2 : rule__Servidor_Impl__Group_7__2__Impl rule__Servidor_Impl__Group_7__3 ;
    public final void rule__Servidor_Impl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6172:1: ( rule__Servidor_Impl__Group_7__2__Impl rule__Servidor_Impl__Group_7__3 )
            // InternalCeffective.g:6173:2: rule__Servidor_Impl__Group_7__2__Impl rule__Servidor_Impl__Group_7__3
            {
            pushFollow(FOLLOW_20);
            rule__Servidor_Impl__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__2"


    // $ANTLR start "rule__Servidor_Impl__Group_7__2__Impl"
    // InternalCeffective.g:6180:1: rule__Servidor_Impl__Group_7__2__Impl : ( ( rule__Servidor_Impl__RecursosAssignment_7_2 ) ) ;
    public final void rule__Servidor_Impl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6184:1: ( ( ( rule__Servidor_Impl__RecursosAssignment_7_2 ) ) )
            // InternalCeffective.g:6185:1: ( ( rule__Servidor_Impl__RecursosAssignment_7_2 ) )
            {
            // InternalCeffective.g:6185:1: ( ( rule__Servidor_Impl__RecursosAssignment_7_2 ) )
            // InternalCeffective.g:6186:2: ( rule__Servidor_Impl__RecursosAssignment_7_2 )
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosAssignment_7_2()); 
            // InternalCeffective.g:6187:2: ( rule__Servidor_Impl__RecursosAssignment_7_2 )
            // InternalCeffective.g:6187:3: rule__Servidor_Impl__RecursosAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__RecursosAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getRecursosAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__2__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__3"
    // InternalCeffective.g:6195:1: rule__Servidor_Impl__Group_7__3 : rule__Servidor_Impl__Group_7__3__Impl rule__Servidor_Impl__Group_7__4 ;
    public final void rule__Servidor_Impl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6199:1: ( rule__Servidor_Impl__Group_7__3__Impl rule__Servidor_Impl__Group_7__4 )
            // InternalCeffective.g:6200:2: rule__Servidor_Impl__Group_7__3__Impl rule__Servidor_Impl__Group_7__4
            {
            pushFollow(FOLLOW_20);
            rule__Servidor_Impl__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__3"


    // $ANTLR start "rule__Servidor_Impl__Group_7__3__Impl"
    // InternalCeffective.g:6207:1: rule__Servidor_Impl__Group_7__3__Impl : ( ( rule__Servidor_Impl__Group_7_3__0 )* ) ;
    public final void rule__Servidor_Impl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6211:1: ( ( ( rule__Servidor_Impl__Group_7_3__0 )* ) )
            // InternalCeffective.g:6212:1: ( ( rule__Servidor_Impl__Group_7_3__0 )* )
            {
            // InternalCeffective.g:6212:1: ( ( rule__Servidor_Impl__Group_7_3__0 )* )
            // InternalCeffective.g:6213:2: ( rule__Servidor_Impl__Group_7_3__0 )*
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_7_3()); 
            // InternalCeffective.g:6214:2: ( rule__Servidor_Impl__Group_7_3__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==29) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalCeffective.g:6214:3: rule__Servidor_Impl__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Servidor_Impl__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getServidor_ImplAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__3__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__4"
    // InternalCeffective.g:6222:1: rule__Servidor_Impl__Group_7__4 : rule__Servidor_Impl__Group_7__4__Impl ;
    public final void rule__Servidor_Impl__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6226:1: ( rule__Servidor_Impl__Group_7__4__Impl )
            // InternalCeffective.g:6227:2: rule__Servidor_Impl__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__4"


    // $ANTLR start "rule__Servidor_Impl__Group_7__4__Impl"
    // InternalCeffective.g:6233:1: rule__Servidor_Impl__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Servidor_Impl__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6237:1: ( ( ')' ) )
            // InternalCeffective.g:6238:1: ( ')' )
            {
            // InternalCeffective.g:6238:1: ( ')' )
            // InternalCeffective.g:6239:2: ')'
            {
             before(grammarAccess.getServidor_ImplAccess().getRightParenthesisKeyword_7_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__4__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7_3__0"
    // InternalCeffective.g:6249:1: rule__Servidor_Impl__Group_7_3__0 : rule__Servidor_Impl__Group_7_3__0__Impl rule__Servidor_Impl__Group_7_3__1 ;
    public final void rule__Servidor_Impl__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6253:1: ( rule__Servidor_Impl__Group_7_3__0__Impl rule__Servidor_Impl__Group_7_3__1 )
            // InternalCeffective.g:6254:2: rule__Servidor_Impl__Group_7_3__0__Impl rule__Servidor_Impl__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7_3__0"


    // $ANTLR start "rule__Servidor_Impl__Group_7_3__0__Impl"
    // InternalCeffective.g:6261:1: rule__Servidor_Impl__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Servidor_Impl__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6265:1: ( ( ',' ) )
            // InternalCeffective.g:6266:1: ( ',' )
            {
            // InternalCeffective.g:6266:1: ( ',' )
            // InternalCeffective.g:6267:2: ','
            {
             before(grammarAccess.getServidor_ImplAccess().getCommaKeyword_7_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7_3__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7_3__1"
    // InternalCeffective.g:6276:1: rule__Servidor_Impl__Group_7_3__1 : rule__Servidor_Impl__Group_7_3__1__Impl ;
    public final void rule__Servidor_Impl__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6280:1: ( rule__Servidor_Impl__Group_7_3__1__Impl )
            // InternalCeffective.g:6281:2: rule__Servidor_Impl__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7_3__1"


    // $ANTLR start "rule__Servidor_Impl__Group_7_3__1__Impl"
    // InternalCeffective.g:6287:1: rule__Servidor_Impl__Group_7_3__1__Impl : ( ( rule__Servidor_Impl__RecursosAssignment_7_3_1 ) ) ;
    public final void rule__Servidor_Impl__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6291:1: ( ( ( rule__Servidor_Impl__RecursosAssignment_7_3_1 ) ) )
            // InternalCeffective.g:6292:1: ( ( rule__Servidor_Impl__RecursosAssignment_7_3_1 ) )
            {
            // InternalCeffective.g:6292:1: ( ( rule__Servidor_Impl__RecursosAssignment_7_3_1 ) )
            // InternalCeffective.g:6293:2: ( rule__Servidor_Impl__RecursosAssignment_7_3_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosAssignment_7_3_1()); 
            // InternalCeffective.g:6294:2: ( rule__Servidor_Impl__RecursosAssignment_7_3_1 )
            // InternalCeffective.g:6294:3: rule__Servidor_Impl__RecursosAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__RecursosAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getRecursosAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7_3__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_8__0"
    // InternalCeffective.g:6303:1: rule__Servidor_Impl__Group_8__0 : rule__Servidor_Impl__Group_8__0__Impl rule__Servidor_Impl__Group_8__1 ;
    public final void rule__Servidor_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6307:1: ( rule__Servidor_Impl__Group_8__0__Impl rule__Servidor_Impl__Group_8__1 )
            // InternalCeffective.g:6308:2: rule__Servidor_Impl__Group_8__0__Impl rule__Servidor_Impl__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_8__0"


    // $ANTLR start "rule__Servidor_Impl__Group_8__0__Impl"
    // InternalCeffective.g:6315:1: rule__Servidor_Impl__Group_8__0__Impl : ( 'vpc' ) ;
    public final void rule__Servidor_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6319:1: ( ( 'vpc' ) )
            // InternalCeffective.g:6320:1: ( 'vpc' )
            {
            // InternalCeffective.g:6320:1: ( 'vpc' )
            // InternalCeffective.g:6321:2: 'vpc'
            {
             before(grammarAccess.getServidor_ImplAccess().getVpcKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getVpcKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_8__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_8__1"
    // InternalCeffective.g:6330:1: rule__Servidor_Impl__Group_8__1 : rule__Servidor_Impl__Group_8__1__Impl ;
    public final void rule__Servidor_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6334:1: ( rule__Servidor_Impl__Group_8__1__Impl )
            // InternalCeffective.g:6335:2: rule__Servidor_Impl__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_8__1"


    // $ANTLR start "rule__Servidor_Impl__Group_8__1__Impl"
    // InternalCeffective.g:6341:1: rule__Servidor_Impl__Group_8__1__Impl : ( ( rule__Servidor_Impl__VpcAssignment_8_1 ) ) ;
    public final void rule__Servidor_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6345:1: ( ( ( rule__Servidor_Impl__VpcAssignment_8_1 ) ) )
            // InternalCeffective.g:6346:1: ( ( rule__Servidor_Impl__VpcAssignment_8_1 ) )
            {
            // InternalCeffective.g:6346:1: ( ( rule__Servidor_Impl__VpcAssignment_8_1 ) )
            // InternalCeffective.g:6347:2: ( rule__Servidor_Impl__VpcAssignment_8_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getVpcAssignment_8_1()); 
            // InternalCeffective.g:6348:2: ( rule__Servidor_Impl__VpcAssignment_8_1 )
            // InternalCeffective.g:6348:3: rule__Servidor_Impl__VpcAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__VpcAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getVpcAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_8__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalCeffective.g:6357:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6361:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCeffective.g:6362:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalCeffective.g:6369:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6373:1: ( ( ( '-' )? ) )
            // InternalCeffective.g:6374:1: ( ( '-' )? )
            {
            // InternalCeffective.g:6374:1: ( ( '-' )? )
            // InternalCeffective.g:6375:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCeffective.g:6376:2: ( '-' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==55) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCeffective.g:6376:3: '-'
                    {
                    match(input,55,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalCeffective.g:6384:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6388:1: ( rule__EInt__Group__1__Impl )
            // InternalCeffective.g:6389:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalCeffective.g:6395:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6399:1: ( ( RULE_INT ) )
            // InternalCeffective.g:6400:1: ( RULE_INT )
            {
            // InternalCeffective.g:6400:1: ( RULE_INT )
            // InternalCeffective.g:6401:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Subred__Group__0"
    // InternalCeffective.g:6411:1: rule__Subred__Group__0 : rule__Subred__Group__0__Impl rule__Subred__Group__1 ;
    public final void rule__Subred__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6415:1: ( rule__Subred__Group__0__Impl rule__Subred__Group__1 )
            // InternalCeffective.g:6416:2: rule__Subred__Group__0__Impl rule__Subred__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Subred__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__0"


    // $ANTLR start "rule__Subred__Group__0__Impl"
    // InternalCeffective.g:6423:1: rule__Subred__Group__0__Impl : ( () ) ;
    public final void rule__Subred__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6427:1: ( ( () ) )
            // InternalCeffective.g:6428:1: ( () )
            {
            // InternalCeffective.g:6428:1: ( () )
            // InternalCeffective.g:6429:2: ()
            {
             before(grammarAccess.getSubredAccess().getSubredAction_0()); 
            // InternalCeffective.g:6430:2: ()
            // InternalCeffective.g:6430:3: 
            {
            }

             after(grammarAccess.getSubredAccess().getSubredAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__0__Impl"


    // $ANTLR start "rule__Subred__Group__1"
    // InternalCeffective.g:6438:1: rule__Subred__Group__1 : rule__Subred__Group__1__Impl rule__Subred__Group__2 ;
    public final void rule__Subred__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6442:1: ( rule__Subred__Group__1__Impl rule__Subred__Group__2 )
            // InternalCeffective.g:6443:2: rule__Subred__Group__1__Impl rule__Subred__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Subred__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__1"


    // $ANTLR start "rule__Subred__Group__1__Impl"
    // InternalCeffective.g:6450:1: rule__Subred__Group__1__Impl : ( 'Subred' ) ;
    public final void rule__Subred__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6454:1: ( ( 'Subred' ) )
            // InternalCeffective.g:6455:1: ( 'Subred' )
            {
            // InternalCeffective.g:6455:1: ( 'Subred' )
            // InternalCeffective.g:6456:2: 'Subred'
            {
             before(grammarAccess.getSubredAccess().getSubredKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getSubredKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__1__Impl"


    // $ANTLR start "rule__Subred__Group__2"
    // InternalCeffective.g:6465:1: rule__Subred__Group__2 : rule__Subred__Group__2__Impl rule__Subred__Group__3 ;
    public final void rule__Subred__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6469:1: ( rule__Subred__Group__2__Impl rule__Subred__Group__3 )
            // InternalCeffective.g:6470:2: rule__Subred__Group__2__Impl rule__Subred__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Subred__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__2"


    // $ANTLR start "rule__Subred__Group__2__Impl"
    // InternalCeffective.g:6477:1: rule__Subred__Group__2__Impl : ( '{' ) ;
    public final void rule__Subred__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6481:1: ( ( '{' ) )
            // InternalCeffective.g:6482:1: ( '{' )
            {
            // InternalCeffective.g:6482:1: ( '{' )
            // InternalCeffective.g:6483:2: '{'
            {
             before(grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__2__Impl"


    // $ANTLR start "rule__Subred__Group__3"
    // InternalCeffective.g:6492:1: rule__Subred__Group__3 : rule__Subred__Group__3__Impl rule__Subred__Group__4 ;
    public final void rule__Subred__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6496:1: ( rule__Subred__Group__3__Impl rule__Subred__Group__4 )
            // InternalCeffective.g:6497:2: rule__Subred__Group__3__Impl rule__Subred__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Subred__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__3"


    // $ANTLR start "rule__Subred__Group__3__Impl"
    // InternalCeffective.g:6504:1: rule__Subred__Group__3__Impl : ( ( rule__Subred__Group_3__0 )? ) ;
    public final void rule__Subred__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6508:1: ( ( ( rule__Subred__Group_3__0 )? ) )
            // InternalCeffective.g:6509:1: ( ( rule__Subred__Group_3__0 )? )
            {
            // InternalCeffective.g:6509:1: ( ( rule__Subred__Group_3__0 )? )
            // InternalCeffective.g:6510:2: ( rule__Subred__Group_3__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_3()); 
            // InternalCeffective.g:6511:2: ( rule__Subred__Group_3__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==27) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCeffective.g:6511:3: rule__Subred__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__3__Impl"


    // $ANTLR start "rule__Subred__Group__4"
    // InternalCeffective.g:6519:1: rule__Subred__Group__4 : rule__Subred__Group__4__Impl rule__Subred__Group__5 ;
    public final void rule__Subred__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6523:1: ( rule__Subred__Group__4__Impl rule__Subred__Group__5 )
            // InternalCeffective.g:6524:2: rule__Subred__Group__4__Impl rule__Subred__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Subred__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__4"


    // $ANTLR start "rule__Subred__Group__4__Impl"
    // InternalCeffective.g:6531:1: rule__Subred__Group__4__Impl : ( ( rule__Subred__Group_4__0 )? ) ;
    public final void rule__Subred__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6535:1: ( ( ( rule__Subred__Group_4__0 )? ) )
            // InternalCeffective.g:6536:1: ( ( rule__Subred__Group_4__0 )? )
            {
            // InternalCeffective.g:6536:1: ( ( rule__Subred__Group_4__0 )? )
            // InternalCeffective.g:6537:2: ( rule__Subred__Group_4__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_4()); 
            // InternalCeffective.g:6538:2: ( rule__Subred__Group_4__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCeffective.g:6538:3: rule__Subred__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__4__Impl"


    // $ANTLR start "rule__Subred__Group__5"
    // InternalCeffective.g:6546:1: rule__Subred__Group__5 : rule__Subred__Group__5__Impl rule__Subred__Group__6 ;
    public final void rule__Subred__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6550:1: ( rule__Subred__Group__5__Impl rule__Subred__Group__6 )
            // InternalCeffective.g:6551:2: rule__Subred__Group__5__Impl rule__Subred__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Subred__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__5"


    // $ANTLR start "rule__Subred__Group__5__Impl"
    // InternalCeffective.g:6558:1: rule__Subred__Group__5__Impl : ( ( rule__Subred__Group_5__0 )? ) ;
    public final void rule__Subred__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6562:1: ( ( ( rule__Subred__Group_5__0 )? ) )
            // InternalCeffective.g:6563:1: ( ( rule__Subred__Group_5__0 )? )
            {
            // InternalCeffective.g:6563:1: ( ( rule__Subred__Group_5__0 )? )
            // InternalCeffective.g:6564:2: ( rule__Subred__Group_5__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_5()); 
            // InternalCeffective.g:6565:2: ( rule__Subred__Group_5__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==45) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCeffective.g:6565:3: rule__Subred__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__5__Impl"


    // $ANTLR start "rule__Subred__Group__6"
    // InternalCeffective.g:6573:1: rule__Subred__Group__6 : rule__Subred__Group__6__Impl rule__Subred__Group__7 ;
    public final void rule__Subred__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6577:1: ( rule__Subred__Group__6__Impl rule__Subred__Group__7 )
            // InternalCeffective.g:6578:2: rule__Subred__Group__6__Impl rule__Subred__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Subred__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__6"


    // $ANTLR start "rule__Subred__Group__6__Impl"
    // InternalCeffective.g:6585:1: rule__Subred__Group__6__Impl : ( ( rule__Subred__Group_6__0 )? ) ;
    public final void rule__Subred__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6589:1: ( ( ( rule__Subred__Group_6__0 )? ) )
            // InternalCeffective.g:6590:1: ( ( rule__Subred__Group_6__0 )? )
            {
            // InternalCeffective.g:6590:1: ( ( rule__Subred__Group_6__0 )? )
            // InternalCeffective.g:6591:2: ( rule__Subred__Group_6__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_6()); 
            // InternalCeffective.g:6592:2: ( rule__Subred__Group_6__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==57) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCeffective.g:6592:3: rule__Subred__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__6__Impl"


    // $ANTLR start "rule__Subred__Group__7"
    // InternalCeffective.g:6600:1: rule__Subred__Group__7 : rule__Subred__Group__7__Impl rule__Subred__Group__8 ;
    public final void rule__Subred__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6604:1: ( rule__Subred__Group__7__Impl rule__Subred__Group__8 )
            // InternalCeffective.g:6605:2: rule__Subred__Group__7__Impl rule__Subred__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Subred__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__7"


    // $ANTLR start "rule__Subred__Group__7__Impl"
    // InternalCeffective.g:6612:1: rule__Subred__Group__7__Impl : ( ( rule__Subred__Group_7__0 )? ) ;
    public final void rule__Subred__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6616:1: ( ( ( rule__Subred__Group_7__0 )? ) )
            // InternalCeffective.g:6617:1: ( ( rule__Subred__Group_7__0 )? )
            {
            // InternalCeffective.g:6617:1: ( ( rule__Subred__Group_7__0 )? )
            // InternalCeffective.g:6618:2: ( rule__Subred__Group_7__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_7()); 
            // InternalCeffective.g:6619:2: ( rule__Subred__Group_7__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==28) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCeffective.g:6619:3: rule__Subred__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__7__Impl"


    // $ANTLR start "rule__Subred__Group__8"
    // InternalCeffective.g:6627:1: rule__Subred__Group__8 : rule__Subred__Group__8__Impl ;
    public final void rule__Subred__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6631:1: ( rule__Subred__Group__8__Impl )
            // InternalCeffective.g:6632:2: rule__Subred__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__8"


    // $ANTLR start "rule__Subred__Group__8__Impl"
    // InternalCeffective.g:6638:1: rule__Subred__Group__8__Impl : ( '}' ) ;
    public final void rule__Subred__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6642:1: ( ( '}' ) )
            // InternalCeffective.g:6643:1: ( '}' )
            {
            // InternalCeffective.g:6643:1: ( '}' )
            // InternalCeffective.g:6644:2: '}'
            {
             before(grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__8__Impl"


    // $ANTLR start "rule__Subred__Group_3__0"
    // InternalCeffective.g:6654:1: rule__Subred__Group_3__0 : rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1 ;
    public final void rule__Subred__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6658:1: ( rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1 )
            // InternalCeffective.g:6659:2: rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__0"


    // $ANTLR start "rule__Subred__Group_3__0__Impl"
    // InternalCeffective.g:6666:1: rule__Subred__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Subred__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6670:1: ( ( 'nombre' ) )
            // InternalCeffective.g:6671:1: ( 'nombre' )
            {
            // InternalCeffective.g:6671:1: ( 'nombre' )
            // InternalCeffective.g:6672:2: 'nombre'
            {
             before(grammarAccess.getSubredAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__0__Impl"


    // $ANTLR start "rule__Subred__Group_3__1"
    // InternalCeffective.g:6681:1: rule__Subred__Group_3__1 : rule__Subred__Group_3__1__Impl ;
    public final void rule__Subred__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6685:1: ( rule__Subred__Group_3__1__Impl )
            // InternalCeffective.g:6686:2: rule__Subred__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__1"


    // $ANTLR start "rule__Subred__Group_3__1__Impl"
    // InternalCeffective.g:6692:1: rule__Subred__Group_3__1__Impl : ( ( rule__Subred__NombreAssignment_3_1 ) ) ;
    public final void rule__Subred__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6696:1: ( ( ( rule__Subred__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:6697:1: ( ( rule__Subred__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:6697:1: ( ( rule__Subred__NombreAssignment_3_1 ) )
            // InternalCeffective.g:6698:2: ( rule__Subred__NombreAssignment_3_1 )
            {
             before(grammarAccess.getSubredAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:6699:2: ( rule__Subred__NombreAssignment_3_1 )
            // InternalCeffective.g:6699:3: rule__Subred__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__1__Impl"


    // $ANTLR start "rule__Subred__Group_4__0"
    // InternalCeffective.g:6708:1: rule__Subred__Group_4__0 : rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 ;
    public final void rule__Subred__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6712:1: ( rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 )
            // InternalCeffective.g:6713:2: rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__0"


    // $ANTLR start "rule__Subred__Group_4__0__Impl"
    // InternalCeffective.g:6720:1: rule__Subred__Group_4__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__Subred__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6724:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:6725:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:6725:1: ( 'zonaNombre' )
            // InternalCeffective.g:6726:2: 'zonaNombre'
            {
             before(grammarAccess.getSubredAccess().getZonaNombreKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getZonaNombreKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__0__Impl"


    // $ANTLR start "rule__Subred__Group_4__1"
    // InternalCeffective.g:6735:1: rule__Subred__Group_4__1 : rule__Subred__Group_4__1__Impl ;
    public final void rule__Subred__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6739:1: ( rule__Subred__Group_4__1__Impl )
            // InternalCeffective.g:6740:2: rule__Subred__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__1"


    // $ANTLR start "rule__Subred__Group_4__1__Impl"
    // InternalCeffective.g:6746:1: rule__Subred__Group_4__1__Impl : ( ( rule__Subred__ZonaNombreAssignment_4_1 ) ) ;
    public final void rule__Subred__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6750:1: ( ( ( rule__Subred__ZonaNombreAssignment_4_1 ) ) )
            // InternalCeffective.g:6751:1: ( ( rule__Subred__ZonaNombreAssignment_4_1 ) )
            {
            // InternalCeffective.g:6751:1: ( ( rule__Subred__ZonaNombreAssignment_4_1 ) )
            // InternalCeffective.g:6752:2: ( rule__Subred__ZonaNombreAssignment_4_1 )
            {
             before(grammarAccess.getSubredAccess().getZonaNombreAssignment_4_1()); 
            // InternalCeffective.g:6753:2: ( rule__Subred__ZonaNombreAssignment_4_1 )
            // InternalCeffective.g:6753:3: rule__Subred__ZonaNombreAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__ZonaNombreAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getZonaNombreAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__1__Impl"


    // $ANTLR start "rule__Subred__Group_5__0"
    // InternalCeffective.g:6762:1: rule__Subred__Group_5__0 : rule__Subred__Group_5__0__Impl rule__Subred__Group_5__1 ;
    public final void rule__Subred__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6766:1: ( rule__Subred__Group_5__0__Impl rule__Subred__Group_5__1 )
            // InternalCeffective.g:6767:2: rule__Subred__Group_5__0__Impl rule__Subred__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_5__0"


    // $ANTLR start "rule__Subred__Group_5__0__Impl"
    // InternalCeffective.g:6774:1: rule__Subred__Group_5__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__Subred__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6778:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:6779:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:6779:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:6780:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_5__0__Impl"


    // $ANTLR start "rule__Subred__Group_5__1"
    // InternalCeffective.g:6789:1: rule__Subred__Group_5__1 : rule__Subred__Group_5__1__Impl ;
    public final void rule__Subred__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6793:1: ( rule__Subred__Group_5__1__Impl )
            // InternalCeffective.g:6794:2: rule__Subred__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_5__1"


    // $ANTLR start "rule__Subred__Group_5__1__Impl"
    // InternalCeffective.g:6800:1: rule__Subred__Group_5__1__Impl : ( ( rule__Subred__ZonaDisponibilidadAssignment_5_1 ) ) ;
    public final void rule__Subred__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6804:1: ( ( ( rule__Subred__ZonaDisponibilidadAssignment_5_1 ) ) )
            // InternalCeffective.g:6805:1: ( ( rule__Subred__ZonaDisponibilidadAssignment_5_1 ) )
            {
            // InternalCeffective.g:6805:1: ( ( rule__Subred__ZonaDisponibilidadAssignment_5_1 ) )
            // InternalCeffective.g:6806:2: ( rule__Subred__ZonaDisponibilidadAssignment_5_1 )
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadAssignment_5_1()); 
            // InternalCeffective.g:6807:2: ( rule__Subred__ZonaDisponibilidadAssignment_5_1 )
            // InternalCeffective.g:6807:3: rule__Subred__ZonaDisponibilidadAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__ZonaDisponibilidadAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getZonaDisponibilidadAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_5__1__Impl"


    // $ANTLR start "rule__Subred__Group_6__0"
    // InternalCeffective.g:6816:1: rule__Subred__Group_6__0 : rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1 ;
    public final void rule__Subred__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6820:1: ( rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1 )
            // InternalCeffective.g:6821:2: rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__0"


    // $ANTLR start "rule__Subred__Group_6__0__Impl"
    // InternalCeffective.g:6828:1: rule__Subred__Group_6__0__Impl : ( 'cidrBlock' ) ;
    public final void rule__Subred__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6832:1: ( ( 'cidrBlock' ) )
            // InternalCeffective.g:6833:1: ( 'cidrBlock' )
            {
            // InternalCeffective.g:6833:1: ( 'cidrBlock' )
            // InternalCeffective.g:6834:2: 'cidrBlock'
            {
             before(grammarAccess.getSubredAccess().getCidrBlockKeyword_6_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getCidrBlockKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__0__Impl"


    // $ANTLR start "rule__Subred__Group_6__1"
    // InternalCeffective.g:6843:1: rule__Subred__Group_6__1 : rule__Subred__Group_6__1__Impl ;
    public final void rule__Subred__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6847:1: ( rule__Subred__Group_6__1__Impl )
            // InternalCeffective.g:6848:2: rule__Subred__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__1"


    // $ANTLR start "rule__Subred__Group_6__1__Impl"
    // InternalCeffective.g:6854:1: rule__Subred__Group_6__1__Impl : ( ( rule__Subred__CidrBlockAssignment_6_1 ) ) ;
    public final void rule__Subred__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6858:1: ( ( ( rule__Subred__CidrBlockAssignment_6_1 ) ) )
            // InternalCeffective.g:6859:1: ( ( rule__Subred__CidrBlockAssignment_6_1 ) )
            {
            // InternalCeffective.g:6859:1: ( ( rule__Subred__CidrBlockAssignment_6_1 ) )
            // InternalCeffective.g:6860:2: ( rule__Subred__CidrBlockAssignment_6_1 )
            {
             before(grammarAccess.getSubredAccess().getCidrBlockAssignment_6_1()); 
            // InternalCeffective.g:6861:2: ( rule__Subred__CidrBlockAssignment_6_1 )
            // InternalCeffective.g:6861:3: rule__Subred__CidrBlockAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__CidrBlockAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getCidrBlockAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__1__Impl"


    // $ANTLR start "rule__Subred__Group_7__0"
    // InternalCeffective.g:6870:1: rule__Subred__Group_7__0 : rule__Subred__Group_7__0__Impl rule__Subred__Group_7__1 ;
    public final void rule__Subred__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6874:1: ( rule__Subred__Group_7__0__Impl rule__Subred__Group_7__1 )
            // InternalCeffective.g:6875:2: rule__Subred__Group_7__0__Impl rule__Subred__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_7__0"


    // $ANTLR start "rule__Subred__Group_7__0__Impl"
    // InternalCeffective.g:6882:1: rule__Subred__Group_7__0__Impl : ( 'vpc' ) ;
    public final void rule__Subred__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6886:1: ( ( 'vpc' ) )
            // InternalCeffective.g:6887:1: ( 'vpc' )
            {
            // InternalCeffective.g:6887:1: ( 'vpc' )
            // InternalCeffective.g:6888:2: 'vpc'
            {
             before(grammarAccess.getSubredAccess().getVpcKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getVpcKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_7__0__Impl"


    // $ANTLR start "rule__Subred__Group_7__1"
    // InternalCeffective.g:6897:1: rule__Subred__Group_7__1 : rule__Subred__Group_7__1__Impl ;
    public final void rule__Subred__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6901:1: ( rule__Subred__Group_7__1__Impl )
            // InternalCeffective.g:6902:2: rule__Subred__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_7__1"


    // $ANTLR start "rule__Subred__Group_7__1__Impl"
    // InternalCeffective.g:6908:1: rule__Subred__Group_7__1__Impl : ( ( rule__Subred__VpcAssignment_7_1 ) ) ;
    public final void rule__Subred__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6912:1: ( ( ( rule__Subred__VpcAssignment_7_1 ) ) )
            // InternalCeffective.g:6913:1: ( ( rule__Subred__VpcAssignment_7_1 ) )
            {
            // InternalCeffective.g:6913:1: ( ( rule__Subred__VpcAssignment_7_1 ) )
            // InternalCeffective.g:6914:2: ( rule__Subred__VpcAssignment_7_1 )
            {
             before(grammarAccess.getSubredAccess().getVpcAssignment_7_1()); 
            // InternalCeffective.g:6915:2: ( rule__Subred__VpcAssignment_7_1 )
            // InternalCeffective.g:6915:3: rule__Subred__VpcAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__VpcAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getVpcAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_7__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group__0"
    // InternalCeffective.g:6924:1: rule__InternetGateway__Group__0 : rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1 ;
    public final void rule__InternetGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6928:1: ( rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1 )
            // InternalCeffective.g:6929:2: rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__InternetGateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__0"


    // $ANTLR start "rule__InternetGateway__Group__0__Impl"
    // InternalCeffective.g:6936:1: rule__InternetGateway__Group__0__Impl : ( () ) ;
    public final void rule__InternetGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6940:1: ( ( () ) )
            // InternalCeffective.g:6941:1: ( () )
            {
            // InternalCeffective.g:6941:1: ( () )
            // InternalCeffective.g:6942:2: ()
            {
             before(grammarAccess.getInternetGatewayAccess().getInternetGatewayAction_0()); 
            // InternalCeffective.g:6943:2: ()
            // InternalCeffective.g:6943:3: 
            {
            }

             after(grammarAccess.getInternetGatewayAccess().getInternetGatewayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group__1"
    // InternalCeffective.g:6951:1: rule__InternetGateway__Group__1 : rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2 ;
    public final void rule__InternetGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6955:1: ( rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2 )
            // InternalCeffective.g:6956:2: rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InternetGateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__1"


    // $ANTLR start "rule__InternetGateway__Group__1__Impl"
    // InternalCeffective.g:6963:1: rule__InternetGateway__Group__1__Impl : ( 'InternetGateway' ) ;
    public final void rule__InternetGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6967:1: ( ( 'InternetGateway' ) )
            // InternalCeffective.g:6968:1: ( 'InternetGateway' )
            {
            // InternalCeffective.g:6968:1: ( 'InternetGateway' )
            // InternalCeffective.g:6969:2: 'InternetGateway'
            {
             before(grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group__2"
    // InternalCeffective.g:6978:1: rule__InternetGateway__Group__2 : rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3 ;
    public final void rule__InternetGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6982:1: ( rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3 )
            // InternalCeffective.g:6983:2: rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__InternetGateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__2"


    // $ANTLR start "rule__InternetGateway__Group__2__Impl"
    // InternalCeffective.g:6990:1: rule__InternetGateway__Group__2__Impl : ( '{' ) ;
    public final void rule__InternetGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6994:1: ( ( '{' ) )
            // InternalCeffective.g:6995:1: ( '{' )
            {
            // InternalCeffective.g:6995:1: ( '{' )
            // InternalCeffective.g:6996:2: '{'
            {
             before(grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__2__Impl"


    // $ANTLR start "rule__InternetGateway__Group__3"
    // InternalCeffective.g:7005:1: rule__InternetGateway__Group__3 : rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4 ;
    public final void rule__InternetGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7009:1: ( rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4 )
            // InternalCeffective.g:7010:2: rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__InternetGateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__3"


    // $ANTLR start "rule__InternetGateway__Group__3__Impl"
    // InternalCeffective.g:7017:1: rule__InternetGateway__Group__3__Impl : ( ( rule__InternetGateway__Group_3__0 )? ) ;
    public final void rule__InternetGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7021:1: ( ( ( rule__InternetGateway__Group_3__0 )? ) )
            // InternalCeffective.g:7022:1: ( ( rule__InternetGateway__Group_3__0 )? )
            {
            // InternalCeffective.g:7022:1: ( ( rule__InternetGateway__Group_3__0 )? )
            // InternalCeffective.g:7023:2: ( rule__InternetGateway__Group_3__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_3()); 
            // InternalCeffective.g:7024:2: ( rule__InternetGateway__Group_3__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==27) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCeffective.g:7024:3: rule__InternetGateway__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternetGateway__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternetGatewayAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__3__Impl"


    // $ANTLR start "rule__InternetGateway__Group__4"
    // InternalCeffective.g:7032:1: rule__InternetGateway__Group__4 : rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5 ;
    public final void rule__InternetGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7036:1: ( rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5 )
            // InternalCeffective.g:7037:2: rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__InternetGateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__4"


    // $ANTLR start "rule__InternetGateway__Group__4__Impl"
    // InternalCeffective.g:7044:1: rule__InternetGateway__Group__4__Impl : ( ( rule__InternetGateway__Group_4__0 )? ) ;
    public final void rule__InternetGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7048:1: ( ( ( rule__InternetGateway__Group_4__0 )? ) )
            // InternalCeffective.g:7049:1: ( ( rule__InternetGateway__Group_4__0 )? )
            {
            // InternalCeffective.g:7049:1: ( ( rule__InternetGateway__Group_4__0 )? )
            // InternalCeffective.g:7050:2: ( rule__InternetGateway__Group_4__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_4()); 
            // InternalCeffective.g:7051:2: ( rule__InternetGateway__Group_4__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalCeffective.g:7051:3: rule__InternetGateway__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternetGateway__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternetGatewayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__4__Impl"


    // $ANTLR start "rule__InternetGateway__Group__5"
    // InternalCeffective.g:7059:1: rule__InternetGateway__Group__5 : rule__InternetGateway__Group__5__Impl rule__InternetGateway__Group__6 ;
    public final void rule__InternetGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7063:1: ( rule__InternetGateway__Group__5__Impl rule__InternetGateway__Group__6 )
            // InternalCeffective.g:7064:2: rule__InternetGateway__Group__5__Impl rule__InternetGateway__Group__6
            {
            pushFollow(FOLLOW_38);
            rule__InternetGateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__5"


    // $ANTLR start "rule__InternetGateway__Group__5__Impl"
    // InternalCeffective.g:7071:1: rule__InternetGateway__Group__5__Impl : ( ( rule__InternetGateway__Group_5__0 )? ) ;
    public final void rule__InternetGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7075:1: ( ( ( rule__InternetGateway__Group_5__0 )? ) )
            // InternalCeffective.g:7076:1: ( ( rule__InternetGateway__Group_5__0 )? )
            {
            // InternalCeffective.g:7076:1: ( ( rule__InternetGateway__Group_5__0 )? )
            // InternalCeffective.g:7077:2: ( rule__InternetGateway__Group_5__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_5()); 
            // InternalCeffective.g:7078:2: ( rule__InternetGateway__Group_5__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==45) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCeffective.g:7078:3: rule__InternetGateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternetGateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternetGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__5__Impl"


    // $ANTLR start "rule__InternetGateway__Group__6"
    // InternalCeffective.g:7086:1: rule__InternetGateway__Group__6 : rule__InternetGateway__Group__6__Impl rule__InternetGateway__Group__7 ;
    public final void rule__InternetGateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7090:1: ( rule__InternetGateway__Group__6__Impl rule__InternetGateway__Group__7 )
            // InternalCeffective.g:7091:2: rule__InternetGateway__Group__6__Impl rule__InternetGateway__Group__7
            {
            pushFollow(FOLLOW_38);
            rule__InternetGateway__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__6"


    // $ANTLR start "rule__InternetGateway__Group__6__Impl"
    // InternalCeffective.g:7098:1: rule__InternetGateway__Group__6__Impl : ( ( rule__InternetGateway__Group_6__0 )? ) ;
    public final void rule__InternetGateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7102:1: ( ( ( rule__InternetGateway__Group_6__0 )? ) )
            // InternalCeffective.g:7103:1: ( ( rule__InternetGateway__Group_6__0 )? )
            {
            // InternalCeffective.g:7103:1: ( ( rule__InternetGateway__Group_6__0 )? )
            // InternalCeffective.g:7104:2: ( rule__InternetGateway__Group_6__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_6()); 
            // InternalCeffective.g:7105:2: ( rule__InternetGateway__Group_6__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==28) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalCeffective.g:7105:3: rule__InternetGateway__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternetGateway__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternetGatewayAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__6__Impl"


    // $ANTLR start "rule__InternetGateway__Group__7"
    // InternalCeffective.g:7113:1: rule__InternetGateway__Group__7 : rule__InternetGateway__Group__7__Impl ;
    public final void rule__InternetGateway__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7117:1: ( rule__InternetGateway__Group__7__Impl )
            // InternalCeffective.g:7118:2: rule__InternetGateway__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__7"


    // $ANTLR start "rule__InternetGateway__Group__7__Impl"
    // InternalCeffective.g:7124:1: rule__InternetGateway__Group__7__Impl : ( '}' ) ;
    public final void rule__InternetGateway__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7128:1: ( ( '}' ) )
            // InternalCeffective.g:7129:1: ( '}' )
            {
            // InternalCeffective.g:7129:1: ( '}' )
            // InternalCeffective.g:7130:2: '}'
            {
             before(grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__7__Impl"


    // $ANTLR start "rule__InternetGateway__Group_3__0"
    // InternalCeffective.g:7140:1: rule__InternetGateway__Group_3__0 : rule__InternetGateway__Group_3__0__Impl rule__InternetGateway__Group_3__1 ;
    public final void rule__InternetGateway__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7144:1: ( rule__InternetGateway__Group_3__0__Impl rule__InternetGateway__Group_3__1 )
            // InternalCeffective.g:7145:2: rule__InternetGateway__Group_3__0__Impl rule__InternetGateway__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__InternetGateway__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_3__0"


    // $ANTLR start "rule__InternetGateway__Group_3__0__Impl"
    // InternalCeffective.g:7152:1: rule__InternetGateway__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__InternetGateway__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7156:1: ( ( 'nombre' ) )
            // InternalCeffective.g:7157:1: ( 'nombre' )
            {
            // InternalCeffective.g:7157:1: ( 'nombre' )
            // InternalCeffective.g:7158:2: 'nombre'
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_3__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group_3__1"
    // InternalCeffective.g:7167:1: rule__InternetGateway__Group_3__1 : rule__InternetGateway__Group_3__1__Impl ;
    public final void rule__InternetGateway__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7171:1: ( rule__InternetGateway__Group_3__1__Impl )
            // InternalCeffective.g:7172:2: rule__InternetGateway__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_3__1"


    // $ANTLR start "rule__InternetGateway__Group_3__1__Impl"
    // InternalCeffective.g:7178:1: rule__InternetGateway__Group_3__1__Impl : ( ( rule__InternetGateway__NombreAssignment_3_1 ) ) ;
    public final void rule__InternetGateway__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7182:1: ( ( ( rule__InternetGateway__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:7183:1: ( ( rule__InternetGateway__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:7183:1: ( ( rule__InternetGateway__NombreAssignment_3_1 ) )
            // InternalCeffective.g:7184:2: ( rule__InternetGateway__NombreAssignment_3_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:7185:2: ( rule__InternetGateway__NombreAssignment_3_1 )
            // InternalCeffective.g:7185:3: rule__InternetGateway__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_3__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group_4__0"
    // InternalCeffective.g:7194:1: rule__InternetGateway__Group_4__0 : rule__InternetGateway__Group_4__0__Impl rule__InternetGateway__Group_4__1 ;
    public final void rule__InternetGateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7198:1: ( rule__InternetGateway__Group_4__0__Impl rule__InternetGateway__Group_4__1 )
            // InternalCeffective.g:7199:2: rule__InternetGateway__Group_4__0__Impl rule__InternetGateway__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__InternetGateway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_4__0"


    // $ANTLR start "rule__InternetGateway__Group_4__0__Impl"
    // InternalCeffective.g:7206:1: rule__InternetGateway__Group_4__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__InternetGateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7210:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:7211:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:7211:1: ( 'zonaNombre' )
            // InternalCeffective.g:7212:2: 'zonaNombre'
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaNombreKeyword_4_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getZonaNombreKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_4__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group_4__1"
    // InternalCeffective.g:7221:1: rule__InternetGateway__Group_4__1 : rule__InternetGateway__Group_4__1__Impl ;
    public final void rule__InternetGateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7225:1: ( rule__InternetGateway__Group_4__1__Impl )
            // InternalCeffective.g:7226:2: rule__InternetGateway__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_4__1"


    // $ANTLR start "rule__InternetGateway__Group_4__1__Impl"
    // InternalCeffective.g:7232:1: rule__InternetGateway__Group_4__1__Impl : ( ( rule__InternetGateway__ZonaNombreAssignment_4_1 ) ) ;
    public final void rule__InternetGateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7236:1: ( ( ( rule__InternetGateway__ZonaNombreAssignment_4_1 ) ) )
            // InternalCeffective.g:7237:1: ( ( rule__InternetGateway__ZonaNombreAssignment_4_1 ) )
            {
            // InternalCeffective.g:7237:1: ( ( rule__InternetGateway__ZonaNombreAssignment_4_1 ) )
            // InternalCeffective.g:7238:2: ( rule__InternetGateway__ZonaNombreAssignment_4_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaNombreAssignment_4_1()); 
            // InternalCeffective.g:7239:2: ( rule__InternetGateway__ZonaNombreAssignment_4_1 )
            // InternalCeffective.g:7239:3: rule__InternetGateway__ZonaNombreAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__ZonaNombreAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getZonaNombreAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_4__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group_5__0"
    // InternalCeffective.g:7248:1: rule__InternetGateway__Group_5__0 : rule__InternetGateway__Group_5__0__Impl rule__InternetGateway__Group_5__1 ;
    public final void rule__InternetGateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7252:1: ( rule__InternetGateway__Group_5__0__Impl rule__InternetGateway__Group_5__1 )
            // InternalCeffective.g:7253:2: rule__InternetGateway__Group_5__0__Impl rule__InternetGateway__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__InternetGateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_5__0"


    // $ANTLR start "rule__InternetGateway__Group_5__0__Impl"
    // InternalCeffective.g:7260:1: rule__InternetGateway__Group_5__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__InternetGateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7264:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:7265:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:7265:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:7266:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadKeyword_5_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_5__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group_5__1"
    // InternalCeffective.g:7275:1: rule__InternetGateway__Group_5__1 : rule__InternetGateway__Group_5__1__Impl ;
    public final void rule__InternetGateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7279:1: ( rule__InternetGateway__Group_5__1__Impl )
            // InternalCeffective.g:7280:2: rule__InternetGateway__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_5__1"


    // $ANTLR start "rule__InternetGateway__Group_5__1__Impl"
    // InternalCeffective.g:7286:1: rule__InternetGateway__Group_5__1__Impl : ( ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 ) ) ;
    public final void rule__InternetGateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7290:1: ( ( ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 ) ) )
            // InternalCeffective.g:7291:1: ( ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 ) )
            {
            // InternalCeffective.g:7291:1: ( ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 ) )
            // InternalCeffective.g:7292:2: ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadAssignment_5_1()); 
            // InternalCeffective.g:7293:2: ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 )
            // InternalCeffective.g:7293:3: rule__InternetGateway__ZonaDisponibilidadAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__ZonaDisponibilidadAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_5__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group_6__0"
    // InternalCeffective.g:7302:1: rule__InternetGateway__Group_6__0 : rule__InternetGateway__Group_6__0__Impl rule__InternetGateway__Group_6__1 ;
    public final void rule__InternetGateway__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7306:1: ( rule__InternetGateway__Group_6__0__Impl rule__InternetGateway__Group_6__1 )
            // InternalCeffective.g:7307:2: rule__InternetGateway__Group_6__0__Impl rule__InternetGateway__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__InternetGateway__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_6__0"


    // $ANTLR start "rule__InternetGateway__Group_6__0__Impl"
    // InternalCeffective.g:7314:1: rule__InternetGateway__Group_6__0__Impl : ( 'vpc' ) ;
    public final void rule__InternetGateway__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7318:1: ( ( 'vpc' ) )
            // InternalCeffective.g:7319:1: ( 'vpc' )
            {
            // InternalCeffective.g:7319:1: ( 'vpc' )
            // InternalCeffective.g:7320:2: 'vpc'
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getVpcKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_6__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group_6__1"
    // InternalCeffective.g:7329:1: rule__InternetGateway__Group_6__1 : rule__InternetGateway__Group_6__1__Impl ;
    public final void rule__InternetGateway__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7333:1: ( rule__InternetGateway__Group_6__1__Impl )
            // InternalCeffective.g:7334:2: rule__InternetGateway__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_6__1"


    // $ANTLR start "rule__InternetGateway__Group_6__1__Impl"
    // InternalCeffective.g:7340:1: rule__InternetGateway__Group_6__1__Impl : ( ( rule__InternetGateway__VpcAssignment_6_1 ) ) ;
    public final void rule__InternetGateway__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7344:1: ( ( ( rule__InternetGateway__VpcAssignment_6_1 ) ) )
            // InternalCeffective.g:7345:1: ( ( rule__InternetGateway__VpcAssignment_6_1 ) )
            {
            // InternalCeffective.g:7345:1: ( ( rule__InternetGateway__VpcAssignment_6_1 ) )
            // InternalCeffective.g:7346:2: ( rule__InternetGateway__VpcAssignment_6_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcAssignment_6_1()); 
            // InternalCeffective.g:7347:2: ( rule__InternetGateway__VpcAssignment_6_1 )
            // InternalCeffective.g:7347:3: rule__InternetGateway__VpcAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__VpcAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getVpcAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_6__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__0"
    // InternalCeffective.g:7356:1: rule__GrupoSeguridad__Group__0 : rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1 ;
    public final void rule__GrupoSeguridad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7360:1: ( rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1 )
            // InternalCeffective.g:7361:2: rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GrupoSeguridad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__0"


    // $ANTLR start "rule__GrupoSeguridad__Group__0__Impl"
    // InternalCeffective.g:7368:1: rule__GrupoSeguridad__Group__0__Impl : ( 'GrupoSeguridad' ) ;
    public final void rule__GrupoSeguridad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7372:1: ( ( 'GrupoSeguridad' ) )
            // InternalCeffective.g:7373:1: ( 'GrupoSeguridad' )
            {
            // InternalCeffective.g:7373:1: ( 'GrupoSeguridad' )
            // InternalCeffective.g:7374:2: 'GrupoSeguridad'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__1"
    // InternalCeffective.g:7383:1: rule__GrupoSeguridad__Group__1 : rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2 ;
    public final void rule__GrupoSeguridad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7387:1: ( rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2 )
            // InternalCeffective.g:7388:2: rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__1"


    // $ANTLR start "rule__GrupoSeguridad__Group__1__Impl"
    // InternalCeffective.g:7395:1: rule__GrupoSeguridad__Group__1__Impl : ( '{' ) ;
    public final void rule__GrupoSeguridad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7399:1: ( ( '{' ) )
            // InternalCeffective.g:7400:1: ( '{' )
            {
            // InternalCeffective.g:7400:1: ( '{' )
            // InternalCeffective.g:7401:2: '{'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__2"
    // InternalCeffective.g:7410:1: rule__GrupoSeguridad__Group__2 : rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3 ;
    public final void rule__GrupoSeguridad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7414:1: ( rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3 )
            // InternalCeffective.g:7415:2: rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__2"


    // $ANTLR start "rule__GrupoSeguridad__Group__2__Impl"
    // InternalCeffective.g:7422:1: rule__GrupoSeguridad__Group__2__Impl : ( ( rule__GrupoSeguridad__Group_2__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7426:1: ( ( ( rule__GrupoSeguridad__Group_2__0 )? ) )
            // InternalCeffective.g:7427:1: ( ( rule__GrupoSeguridad__Group_2__0 )? )
            {
            // InternalCeffective.g:7427:1: ( ( rule__GrupoSeguridad__Group_2__0 )? )
            // InternalCeffective.g:7428:2: ( rule__GrupoSeguridad__Group_2__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_2()); 
            // InternalCeffective.g:7429:2: ( rule__GrupoSeguridad__Group_2__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==27) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCeffective.g:7429:3: rule__GrupoSeguridad__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__2__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__3"
    // InternalCeffective.g:7437:1: rule__GrupoSeguridad__Group__3 : rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4 ;
    public final void rule__GrupoSeguridad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7441:1: ( rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4 )
            // InternalCeffective.g:7442:2: rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__3"


    // $ANTLR start "rule__GrupoSeguridad__Group__3__Impl"
    // InternalCeffective.g:7449:1: rule__GrupoSeguridad__Group__3__Impl : ( ( rule__GrupoSeguridad__Group_3__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7453:1: ( ( ( rule__GrupoSeguridad__Group_3__0 )? ) )
            // InternalCeffective.g:7454:1: ( ( rule__GrupoSeguridad__Group_3__0 )? )
            {
            // InternalCeffective.g:7454:1: ( ( rule__GrupoSeguridad__Group_3__0 )? )
            // InternalCeffective.g:7455:2: ( rule__GrupoSeguridad__Group_3__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_3()); 
            // InternalCeffective.g:7456:2: ( rule__GrupoSeguridad__Group_3__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==46) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalCeffective.g:7456:3: rule__GrupoSeguridad__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__3__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__4"
    // InternalCeffective.g:7464:1: rule__GrupoSeguridad__Group__4 : rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5 ;
    public final void rule__GrupoSeguridad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7468:1: ( rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5 )
            // InternalCeffective.g:7469:2: rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__4"


    // $ANTLR start "rule__GrupoSeguridad__Group__4__Impl"
    // InternalCeffective.g:7476:1: rule__GrupoSeguridad__Group__4__Impl : ( ( rule__GrupoSeguridad__Group_4__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7480:1: ( ( ( rule__GrupoSeguridad__Group_4__0 )? ) )
            // InternalCeffective.g:7481:1: ( ( rule__GrupoSeguridad__Group_4__0 )? )
            {
            // InternalCeffective.g:7481:1: ( ( rule__GrupoSeguridad__Group_4__0 )? )
            // InternalCeffective.g:7482:2: ( rule__GrupoSeguridad__Group_4__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_4()); 
            // InternalCeffective.g:7483:2: ( rule__GrupoSeguridad__Group_4__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==45) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalCeffective.g:7483:3: rule__GrupoSeguridad__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__4__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__5"
    // InternalCeffective.g:7491:1: rule__GrupoSeguridad__Group__5 : rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6 ;
    public final void rule__GrupoSeguridad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7495:1: ( rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6 )
            // InternalCeffective.g:7496:2: rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__5"


    // $ANTLR start "rule__GrupoSeguridad__Group__5__Impl"
    // InternalCeffective.g:7503:1: rule__GrupoSeguridad__Group__5__Impl : ( ( rule__GrupoSeguridad__Group_5__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7507:1: ( ( ( rule__GrupoSeguridad__Group_5__0 )? ) )
            // InternalCeffective.g:7508:1: ( ( rule__GrupoSeguridad__Group_5__0 )? )
            {
            // InternalCeffective.g:7508:1: ( ( rule__GrupoSeguridad__Group_5__0 )? )
            // InternalCeffective.g:7509:2: ( rule__GrupoSeguridad__Group_5__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_5()); 
            // InternalCeffective.g:7510:2: ( rule__GrupoSeguridad__Group_5__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==62) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalCeffective.g:7510:3: rule__GrupoSeguridad__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__5__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__6"
    // InternalCeffective.g:7518:1: rule__GrupoSeguridad__Group__6 : rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7 ;
    public final void rule__GrupoSeguridad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7522:1: ( rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7 )
            // InternalCeffective.g:7523:2: rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__GrupoSeguridad__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__6"


    // $ANTLR start "rule__GrupoSeguridad__Group__6__Impl"
    // InternalCeffective.g:7530:1: rule__GrupoSeguridad__Group__6__Impl : ( ( rule__GrupoSeguridad__Group_6__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7534:1: ( ( ( rule__GrupoSeguridad__Group_6__0 )? ) )
            // InternalCeffective.g:7535:1: ( ( rule__GrupoSeguridad__Group_6__0 )? )
            {
            // InternalCeffective.g:7535:1: ( ( rule__GrupoSeguridad__Group_6__0 )? )
            // InternalCeffective.g:7536:2: ( rule__GrupoSeguridad__Group_6__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_6()); 
            // InternalCeffective.g:7537:2: ( rule__GrupoSeguridad__Group_6__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==28) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalCeffective.g:7537:3: rule__GrupoSeguridad__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__6__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__7"
    // InternalCeffective.g:7545:1: rule__GrupoSeguridad__Group__7 : rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8 ;
    public final void rule__GrupoSeguridad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7549:1: ( rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8 )
            // InternalCeffective.g:7550:2: rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__GrupoSeguridad__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__7"


    // $ANTLR start "rule__GrupoSeguridad__Group__7__Impl"
    // InternalCeffective.g:7557:1: rule__GrupoSeguridad__Group__7__Impl : ( 'reglasSalida' ) ;
    public final void rule__GrupoSeguridad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7561:1: ( ( 'reglasSalida' ) )
            // InternalCeffective.g:7562:1: ( 'reglasSalida' )
            {
            // InternalCeffective.g:7562:1: ( 'reglasSalida' )
            // InternalCeffective.g:7563:2: 'reglasSalida'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_7()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__7__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__8"
    // InternalCeffective.g:7572:1: rule__GrupoSeguridad__Group__8 : rule__GrupoSeguridad__Group__8__Impl rule__GrupoSeguridad__Group__9 ;
    public final void rule__GrupoSeguridad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7576:1: ( rule__GrupoSeguridad__Group__8__Impl rule__GrupoSeguridad__Group__9 )
            // InternalCeffective.g:7577:2: rule__GrupoSeguridad__Group__8__Impl rule__GrupoSeguridad__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__8"


    // $ANTLR start "rule__GrupoSeguridad__Group__8__Impl"
    // InternalCeffective.g:7584:1: rule__GrupoSeguridad__Group__8__Impl : ( '(' ) ;
    public final void rule__GrupoSeguridad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7588:1: ( ( '(' ) )
            // InternalCeffective.g:7589:1: ( '(' )
            {
            // InternalCeffective.g:7589:1: ( '(' )
            // InternalCeffective.g:7590:2: '('
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_8()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__8__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__9"
    // InternalCeffective.g:7599:1: rule__GrupoSeguridad__Group__9 : rule__GrupoSeguridad__Group__9__Impl rule__GrupoSeguridad__Group__10 ;
    public final void rule__GrupoSeguridad__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7603:1: ( rule__GrupoSeguridad__Group__9__Impl rule__GrupoSeguridad__Group__10 )
            // InternalCeffective.g:7604:2: rule__GrupoSeguridad__Group__9__Impl rule__GrupoSeguridad__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__GrupoSeguridad__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__9"


    // $ANTLR start "rule__GrupoSeguridad__Group__9__Impl"
    // InternalCeffective.g:7611:1: rule__GrupoSeguridad__Group__9__Impl : ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_9 ) ) ;
    public final void rule__GrupoSeguridad__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7615:1: ( ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_9 ) ) )
            // InternalCeffective.g:7616:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_9 ) )
            {
            // InternalCeffective.g:7616:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_9 ) )
            // InternalCeffective.g:7617:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_9 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_9()); 
            // InternalCeffective.g:7618:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_9 )
            // InternalCeffective.g:7618:3: rule__GrupoSeguridad__ReglasSalidaAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasSalidaAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__9__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__10"
    // InternalCeffective.g:7626:1: rule__GrupoSeguridad__Group__10 : rule__GrupoSeguridad__Group__10__Impl rule__GrupoSeguridad__Group__11 ;
    public final void rule__GrupoSeguridad__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7630:1: ( rule__GrupoSeguridad__Group__10__Impl rule__GrupoSeguridad__Group__11 )
            // InternalCeffective.g:7631:2: rule__GrupoSeguridad__Group__10__Impl rule__GrupoSeguridad__Group__11
            {
            pushFollow(FOLLOW_20);
            rule__GrupoSeguridad__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__10"


    // $ANTLR start "rule__GrupoSeguridad__Group__10__Impl"
    // InternalCeffective.g:7638:1: rule__GrupoSeguridad__Group__10__Impl : ( ( rule__GrupoSeguridad__Group_10__0 )* ) ;
    public final void rule__GrupoSeguridad__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7642:1: ( ( ( rule__GrupoSeguridad__Group_10__0 )* ) )
            // InternalCeffective.g:7643:1: ( ( rule__GrupoSeguridad__Group_10__0 )* )
            {
            // InternalCeffective.g:7643:1: ( ( rule__GrupoSeguridad__Group_10__0 )* )
            // InternalCeffective.g:7644:2: ( rule__GrupoSeguridad__Group_10__0 )*
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_10()); 
            // InternalCeffective.g:7645:2: ( rule__GrupoSeguridad__Group_10__0 )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==29) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalCeffective.g:7645:3: rule__GrupoSeguridad__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GrupoSeguridad__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__10__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__11"
    // InternalCeffective.g:7653:1: rule__GrupoSeguridad__Group__11 : rule__GrupoSeguridad__Group__11__Impl rule__GrupoSeguridad__Group__12 ;
    public final void rule__GrupoSeguridad__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7657:1: ( rule__GrupoSeguridad__Group__11__Impl rule__GrupoSeguridad__Group__12 )
            // InternalCeffective.g:7658:2: rule__GrupoSeguridad__Group__11__Impl rule__GrupoSeguridad__Group__12
            {
            pushFollow(FOLLOW_40);
            rule__GrupoSeguridad__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__11"


    // $ANTLR start "rule__GrupoSeguridad__Group__11__Impl"
    // InternalCeffective.g:7665:1: rule__GrupoSeguridad__Group__11__Impl : ( ')' ) ;
    public final void rule__GrupoSeguridad__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7669:1: ( ( ')' ) )
            // InternalCeffective.g:7670:1: ( ')' )
            {
            // InternalCeffective.g:7670:1: ( ')' )
            // InternalCeffective.g:7671:2: ')'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_11()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__11__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__12"
    // InternalCeffective.g:7680:1: rule__GrupoSeguridad__Group__12 : rule__GrupoSeguridad__Group__12__Impl rule__GrupoSeguridad__Group__13 ;
    public final void rule__GrupoSeguridad__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7684:1: ( rule__GrupoSeguridad__Group__12__Impl rule__GrupoSeguridad__Group__13 )
            // InternalCeffective.g:7685:2: rule__GrupoSeguridad__Group__12__Impl rule__GrupoSeguridad__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__GrupoSeguridad__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__12"


    // $ANTLR start "rule__GrupoSeguridad__Group__12__Impl"
    // InternalCeffective.g:7692:1: rule__GrupoSeguridad__Group__12__Impl : ( 'reglasEntrada' ) ;
    public final void rule__GrupoSeguridad__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7696:1: ( ( 'reglasEntrada' ) )
            // InternalCeffective.g:7697:1: ( 'reglasEntrada' )
            {
            // InternalCeffective.g:7697:1: ( 'reglasEntrada' )
            // InternalCeffective.g:7698:2: 'reglasEntrada'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_12()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__12__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__13"
    // InternalCeffective.g:7707:1: rule__GrupoSeguridad__Group__13 : rule__GrupoSeguridad__Group__13__Impl rule__GrupoSeguridad__Group__14 ;
    public final void rule__GrupoSeguridad__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7711:1: ( rule__GrupoSeguridad__Group__13__Impl rule__GrupoSeguridad__Group__14 )
            // InternalCeffective.g:7712:2: rule__GrupoSeguridad__Group__13__Impl rule__GrupoSeguridad__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__13"


    // $ANTLR start "rule__GrupoSeguridad__Group__13__Impl"
    // InternalCeffective.g:7719:1: rule__GrupoSeguridad__Group__13__Impl : ( '(' ) ;
    public final void rule__GrupoSeguridad__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7723:1: ( ( '(' ) )
            // InternalCeffective.g:7724:1: ( '(' )
            {
            // InternalCeffective.g:7724:1: ( '(' )
            // InternalCeffective.g:7725:2: '('
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_13()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__13__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__14"
    // InternalCeffective.g:7734:1: rule__GrupoSeguridad__Group__14 : rule__GrupoSeguridad__Group__14__Impl rule__GrupoSeguridad__Group__15 ;
    public final void rule__GrupoSeguridad__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7738:1: ( rule__GrupoSeguridad__Group__14__Impl rule__GrupoSeguridad__Group__15 )
            // InternalCeffective.g:7739:2: rule__GrupoSeguridad__Group__14__Impl rule__GrupoSeguridad__Group__15
            {
            pushFollow(FOLLOW_20);
            rule__GrupoSeguridad__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__14"


    // $ANTLR start "rule__GrupoSeguridad__Group__14__Impl"
    // InternalCeffective.g:7746:1: rule__GrupoSeguridad__Group__14__Impl : ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_14 ) ) ;
    public final void rule__GrupoSeguridad__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7750:1: ( ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_14 ) ) )
            // InternalCeffective.g:7751:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_14 ) )
            {
            // InternalCeffective.g:7751:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_14 ) )
            // InternalCeffective.g:7752:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_14 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_14()); 
            // InternalCeffective.g:7753:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_14 )
            // InternalCeffective.g:7753:3: rule__GrupoSeguridad__ReglasEntradaAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasEntradaAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__14__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__15"
    // InternalCeffective.g:7761:1: rule__GrupoSeguridad__Group__15 : rule__GrupoSeguridad__Group__15__Impl rule__GrupoSeguridad__Group__16 ;
    public final void rule__GrupoSeguridad__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7765:1: ( rule__GrupoSeguridad__Group__15__Impl rule__GrupoSeguridad__Group__16 )
            // InternalCeffective.g:7766:2: rule__GrupoSeguridad__Group__15__Impl rule__GrupoSeguridad__Group__16
            {
            pushFollow(FOLLOW_20);
            rule__GrupoSeguridad__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__15"


    // $ANTLR start "rule__GrupoSeguridad__Group__15__Impl"
    // InternalCeffective.g:7773:1: rule__GrupoSeguridad__Group__15__Impl : ( ( rule__GrupoSeguridad__Group_15__0 )* ) ;
    public final void rule__GrupoSeguridad__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7777:1: ( ( ( rule__GrupoSeguridad__Group_15__0 )* ) )
            // InternalCeffective.g:7778:1: ( ( rule__GrupoSeguridad__Group_15__0 )* )
            {
            // InternalCeffective.g:7778:1: ( ( rule__GrupoSeguridad__Group_15__0 )* )
            // InternalCeffective.g:7779:2: ( rule__GrupoSeguridad__Group_15__0 )*
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_15()); 
            // InternalCeffective.g:7780:2: ( rule__GrupoSeguridad__Group_15__0 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==29) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalCeffective.g:7780:3: rule__GrupoSeguridad__Group_15__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GrupoSeguridad__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__15__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__16"
    // InternalCeffective.g:7788:1: rule__GrupoSeguridad__Group__16 : rule__GrupoSeguridad__Group__16__Impl rule__GrupoSeguridad__Group__17 ;
    public final void rule__GrupoSeguridad__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7792:1: ( rule__GrupoSeguridad__Group__16__Impl rule__GrupoSeguridad__Group__17 )
            // InternalCeffective.g:7793:2: rule__GrupoSeguridad__Group__16__Impl rule__GrupoSeguridad__Group__17
            {
            pushFollow(FOLLOW_41);
            rule__GrupoSeguridad__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__16"


    // $ANTLR start "rule__GrupoSeguridad__Group__16__Impl"
    // InternalCeffective.g:7800:1: rule__GrupoSeguridad__Group__16__Impl : ( ')' ) ;
    public final void rule__GrupoSeguridad__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7804:1: ( ( ')' ) )
            // InternalCeffective.g:7805:1: ( ')' )
            {
            // InternalCeffective.g:7805:1: ( ')' )
            // InternalCeffective.g:7806:2: ')'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_16()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__16__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__17"
    // InternalCeffective.g:7815:1: rule__GrupoSeguridad__Group__17 : rule__GrupoSeguridad__Group__17__Impl ;
    public final void rule__GrupoSeguridad__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7819:1: ( rule__GrupoSeguridad__Group__17__Impl )
            // InternalCeffective.g:7820:2: rule__GrupoSeguridad__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__17"


    // $ANTLR start "rule__GrupoSeguridad__Group__17__Impl"
    // InternalCeffective.g:7826:1: rule__GrupoSeguridad__Group__17__Impl : ( '}' ) ;
    public final void rule__GrupoSeguridad__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7830:1: ( ( '}' ) )
            // InternalCeffective.g:7831:1: ( '}' )
            {
            // InternalCeffective.g:7831:1: ( '}' )
            // InternalCeffective.g:7832:2: '}'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_17()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__17__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__0"
    // InternalCeffective.g:7842:1: rule__GrupoSeguridad__Group_2__0 : rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1 ;
    public final void rule__GrupoSeguridad__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7846:1: ( rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1 )
            // InternalCeffective.g:7847:2: rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__0__Impl"
    // InternalCeffective.g:7854:1: rule__GrupoSeguridad__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__GrupoSeguridad__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7858:1: ( ( 'nombre' ) )
            // InternalCeffective.g:7859:1: ( 'nombre' )
            {
            // InternalCeffective.g:7859:1: ( 'nombre' )
            // InternalCeffective.g:7860:2: 'nombre'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__1"
    // InternalCeffective.g:7869:1: rule__GrupoSeguridad__Group_2__1 : rule__GrupoSeguridad__Group_2__1__Impl ;
    public final void rule__GrupoSeguridad__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7873:1: ( rule__GrupoSeguridad__Group_2__1__Impl )
            // InternalCeffective.g:7874:2: rule__GrupoSeguridad__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__1__Impl"
    // InternalCeffective.g:7880:1: rule__GrupoSeguridad__Group_2__1__Impl : ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7884:1: ( ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) ) )
            // InternalCeffective.g:7885:1: ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) )
            {
            // InternalCeffective.g:7885:1: ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) )
            // InternalCeffective.g:7886:2: ( rule__GrupoSeguridad__NombreAssignment_2_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreAssignment_2_1()); 
            // InternalCeffective.g:7887:2: ( rule__GrupoSeguridad__NombreAssignment_2_1 )
            // InternalCeffective.g:7887:3: rule__GrupoSeguridad__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__0"
    // InternalCeffective.g:7896:1: rule__GrupoSeguridad__Group_3__0 : rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1 ;
    public final void rule__GrupoSeguridad__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7900:1: ( rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1 )
            // InternalCeffective.g:7901:2: rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__0__Impl"
    // InternalCeffective.g:7908:1: rule__GrupoSeguridad__Group_3__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__GrupoSeguridad__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7912:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:7913:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:7913:1: ( 'zonaNombre' )
            // InternalCeffective.g:7914:2: 'zonaNombre'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaNombreKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getZonaNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__1"
    // InternalCeffective.g:7923:1: rule__GrupoSeguridad__Group_3__1 : rule__GrupoSeguridad__Group_3__1__Impl ;
    public final void rule__GrupoSeguridad__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7927:1: ( rule__GrupoSeguridad__Group_3__1__Impl )
            // InternalCeffective.g:7928:2: rule__GrupoSeguridad__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__1__Impl"
    // InternalCeffective.g:7934:1: rule__GrupoSeguridad__Group_3__1__Impl : ( ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7938:1: ( ( ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 ) ) )
            // InternalCeffective.g:7939:1: ( ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:7939:1: ( ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 ) )
            // InternalCeffective.g:7940:2: ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaNombreAssignment_3_1()); 
            // InternalCeffective.g:7941:2: ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 )
            // InternalCeffective.g:7941:3: rule__GrupoSeguridad__ZonaNombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ZonaNombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getZonaNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_4__0"
    // InternalCeffective.g:7950:1: rule__GrupoSeguridad__Group_4__0 : rule__GrupoSeguridad__Group_4__0__Impl rule__GrupoSeguridad__Group_4__1 ;
    public final void rule__GrupoSeguridad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7954:1: ( rule__GrupoSeguridad__Group_4__0__Impl rule__GrupoSeguridad__Group_4__1 )
            // InternalCeffective.g:7955:2: rule__GrupoSeguridad__Group_4__0__Impl rule__GrupoSeguridad__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_4__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_4__0__Impl"
    // InternalCeffective.g:7962:1: rule__GrupoSeguridad__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__GrupoSeguridad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7966:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:7967:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:7967:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:7968:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_4__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_4__1"
    // InternalCeffective.g:7977:1: rule__GrupoSeguridad__Group_4__1 : rule__GrupoSeguridad__Group_4__1__Impl ;
    public final void rule__GrupoSeguridad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7981:1: ( rule__GrupoSeguridad__Group_4__1__Impl )
            // InternalCeffective.g:7982:2: rule__GrupoSeguridad__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_4__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_4__1__Impl"
    // InternalCeffective.g:7988:1: rule__GrupoSeguridad__Group_4__1__Impl : ( ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7992:1: ( ( ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:7993:1: ( ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:7993:1: ( ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:7994:2: ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:7995:2: ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:7995:3: rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_4__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_5__0"
    // InternalCeffective.g:8004:1: rule__GrupoSeguridad__Group_5__0 : rule__GrupoSeguridad__Group_5__0__Impl rule__GrupoSeguridad__Group_5__1 ;
    public final void rule__GrupoSeguridad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8008:1: ( rule__GrupoSeguridad__Group_5__0__Impl rule__GrupoSeguridad__Group_5__1 )
            // InternalCeffective.g:8009:2: rule__GrupoSeguridad__Group_5__0__Impl rule__GrupoSeguridad__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_5__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_5__0__Impl"
    // InternalCeffective.g:8016:1: rule__GrupoSeguridad__Group_5__0__Impl : ( 'descripcion' ) ;
    public final void rule__GrupoSeguridad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8020:1: ( ( 'descripcion' ) )
            // InternalCeffective.g:8021:1: ( 'descripcion' )
            {
            // InternalCeffective.g:8021:1: ( 'descripcion' )
            // InternalCeffective.g:8022:2: 'descripcion'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_5_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_5__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_5__1"
    // InternalCeffective.g:8031:1: rule__GrupoSeguridad__Group_5__1 : rule__GrupoSeguridad__Group_5__1__Impl ;
    public final void rule__GrupoSeguridad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8035:1: ( rule__GrupoSeguridad__Group_5__1__Impl )
            // InternalCeffective.g:8036:2: rule__GrupoSeguridad__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_5__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_5__1__Impl"
    // InternalCeffective.g:8042:1: rule__GrupoSeguridad__Group_5__1__Impl : ( ( rule__GrupoSeguridad__DescripcionAssignment_5_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8046:1: ( ( ( rule__GrupoSeguridad__DescripcionAssignment_5_1 ) ) )
            // InternalCeffective.g:8047:1: ( ( rule__GrupoSeguridad__DescripcionAssignment_5_1 ) )
            {
            // InternalCeffective.g:8047:1: ( ( rule__GrupoSeguridad__DescripcionAssignment_5_1 ) )
            // InternalCeffective.g:8048:2: ( rule__GrupoSeguridad__DescripcionAssignment_5_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionAssignment_5_1()); 
            // InternalCeffective.g:8049:2: ( rule__GrupoSeguridad__DescripcionAssignment_5_1 )
            // InternalCeffective.g:8049:3: rule__GrupoSeguridad__DescripcionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__DescripcionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_5__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__0"
    // InternalCeffective.g:8058:1: rule__GrupoSeguridad__Group_6__0 : rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1 ;
    public final void rule__GrupoSeguridad__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8062:1: ( rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1 )
            // InternalCeffective.g:8063:2: rule__GrupoSeguridad__Group_6__0__Impl rule__GrupoSeguridad__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__0__Impl"
    // InternalCeffective.g:8070:1: rule__GrupoSeguridad__Group_6__0__Impl : ( 'vpc' ) ;
    public final void rule__GrupoSeguridad__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8074:1: ( ( 'vpc' ) )
            // InternalCeffective.g:8075:1: ( 'vpc' )
            {
            // InternalCeffective.g:8075:1: ( 'vpc' )
            // InternalCeffective.g:8076:2: 'vpc'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getVpcKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__1"
    // InternalCeffective.g:8085:1: rule__GrupoSeguridad__Group_6__1 : rule__GrupoSeguridad__Group_6__1__Impl ;
    public final void rule__GrupoSeguridad__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8089:1: ( rule__GrupoSeguridad__Group_6__1__Impl )
            // InternalCeffective.g:8090:2: rule__GrupoSeguridad__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_6__1__Impl"
    // InternalCeffective.g:8096:1: rule__GrupoSeguridad__Group_6__1__Impl : ( ( rule__GrupoSeguridad__VpcAssignment_6_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8100:1: ( ( ( rule__GrupoSeguridad__VpcAssignment_6_1 ) ) )
            // InternalCeffective.g:8101:1: ( ( rule__GrupoSeguridad__VpcAssignment_6_1 ) )
            {
            // InternalCeffective.g:8101:1: ( ( rule__GrupoSeguridad__VpcAssignment_6_1 ) )
            // InternalCeffective.g:8102:2: ( rule__GrupoSeguridad__VpcAssignment_6_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcAssignment_6_1()); 
            // InternalCeffective.g:8103:2: ( rule__GrupoSeguridad__VpcAssignment_6_1 )
            // InternalCeffective.g:8103:3: rule__GrupoSeguridad__VpcAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__VpcAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getVpcAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_6__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_10__0"
    // InternalCeffective.g:8112:1: rule__GrupoSeguridad__Group_10__0 : rule__GrupoSeguridad__Group_10__0__Impl rule__GrupoSeguridad__Group_10__1 ;
    public final void rule__GrupoSeguridad__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8116:1: ( rule__GrupoSeguridad__Group_10__0__Impl rule__GrupoSeguridad__Group_10__1 )
            // InternalCeffective.g:8117:2: rule__GrupoSeguridad__Group_10__0__Impl rule__GrupoSeguridad__Group_10__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_10__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_10__0__Impl"
    // InternalCeffective.g:8124:1: rule__GrupoSeguridad__Group_10__0__Impl : ( ',' ) ;
    public final void rule__GrupoSeguridad__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8128:1: ( ( ',' ) )
            // InternalCeffective.g:8129:1: ( ',' )
            {
            // InternalCeffective.g:8129:1: ( ',' )
            // InternalCeffective.g:8130:2: ','
            {
             before(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_10_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_10__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_10__1"
    // InternalCeffective.g:8139:1: rule__GrupoSeguridad__Group_10__1 : rule__GrupoSeguridad__Group_10__1__Impl ;
    public final void rule__GrupoSeguridad__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8143:1: ( rule__GrupoSeguridad__Group_10__1__Impl )
            // InternalCeffective.g:8144:2: rule__GrupoSeguridad__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_10__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_10__1__Impl"
    // InternalCeffective.g:8150:1: rule__GrupoSeguridad__Group_10__1__Impl : ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_10_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8154:1: ( ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_10_1 ) ) )
            // InternalCeffective.g:8155:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_10_1 ) )
            {
            // InternalCeffective.g:8155:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_10_1 ) )
            // InternalCeffective.g:8156:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_10_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_10_1()); 
            // InternalCeffective.g:8157:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_10_1 )
            // InternalCeffective.g:8157:3: rule__GrupoSeguridad__ReglasSalidaAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasSalidaAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_10__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_15__0"
    // InternalCeffective.g:8166:1: rule__GrupoSeguridad__Group_15__0 : rule__GrupoSeguridad__Group_15__0__Impl rule__GrupoSeguridad__Group_15__1 ;
    public final void rule__GrupoSeguridad__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8170:1: ( rule__GrupoSeguridad__Group_15__0__Impl rule__GrupoSeguridad__Group_15__1 )
            // InternalCeffective.g:8171:2: rule__GrupoSeguridad__Group_15__0__Impl rule__GrupoSeguridad__Group_15__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_15__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_15__0__Impl"
    // InternalCeffective.g:8178:1: rule__GrupoSeguridad__Group_15__0__Impl : ( ',' ) ;
    public final void rule__GrupoSeguridad__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8182:1: ( ( ',' ) )
            // InternalCeffective.g:8183:1: ( ',' )
            {
            // InternalCeffective.g:8183:1: ( ',' )
            // InternalCeffective.g:8184:2: ','
            {
             before(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_15_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_15__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_15__1"
    // InternalCeffective.g:8193:1: rule__GrupoSeguridad__Group_15__1 : rule__GrupoSeguridad__Group_15__1__Impl ;
    public final void rule__GrupoSeguridad__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8197:1: ( rule__GrupoSeguridad__Group_15__1__Impl )
            // InternalCeffective.g:8198:2: rule__GrupoSeguridad__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_15__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_15__1__Impl"
    // InternalCeffective.g:8204:1: rule__GrupoSeguridad__Group_15__1__Impl : ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_15_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8208:1: ( ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_15_1 ) ) )
            // InternalCeffective.g:8209:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_15_1 ) )
            {
            // InternalCeffective.g:8209:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_15_1 ) )
            // InternalCeffective.g:8210:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_15_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_15_1()); 
            // InternalCeffective.g:8211:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_15_1 )
            // InternalCeffective.g:8211:3: rule__GrupoSeguridad__ReglasEntradaAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasEntradaAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_15__1__Impl"


    // $ANTLR start "rule__Ceffective__ProveedorNubeAssignment_3_1"
    // InternalCeffective.g:8220:1: rule__Ceffective__ProveedorNubeAssignment_3_1 : ( ruleProveedorNube ) ;
    public final void rule__Ceffective__ProveedorNubeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8224:1: ( ( ruleProveedorNube ) )
            // InternalCeffective.g:8225:2: ( ruleProveedorNube )
            {
            // InternalCeffective.g:8225:2: ( ruleProveedorNube )
            // InternalCeffective.g:8226:3: ruleProveedorNube
            {
             before(grammarAccess.getCeffectiveAccess().getProveedorNubeProveedorNubeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProveedorNube();

            state._fsp--;

             after(grammarAccess.getCeffectiveAccess().getProveedorNubeProveedorNubeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__ProveedorNubeAssignment_3_1"


    // $ANTLR start "rule__ProveedorNube__NombreAssignment_2_1"
    // InternalCeffective.g:8235:1: rule__ProveedorNube__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ProveedorNube__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8239:1: ( ( ruleEString ) )
            // InternalCeffective.g:8240:2: ( ruleEString )
            {
            // InternalCeffective.g:8240:2: ( ruleEString )
            // InternalCeffective.g:8241:3: ruleEString
            {
             before(grammarAccess.getProveedorNubeAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__NombreAssignment_2_1"


    // $ANTLR start "rule__ProveedorNube__VpcAssignment_3_1"
    // InternalCeffective.g:8250:1: rule__ProveedorNube__VpcAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ProveedorNube__VpcAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8254:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8255:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8255:2: ( ( ruleEString ) )
            // InternalCeffective.g:8256:3: ( ruleEString )
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_3_1_0()); 
            // InternalCeffective.g:8257:3: ( ruleEString )
            // InternalCeffective.g:8258:4: ruleEString
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcVPCEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getVpcVPCEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__VpcAssignment_3_1"


    // $ANTLR start "rule__ProveedorNube__AutenticacionUsuarioAssignment_6"
    // InternalCeffective.g:8269:1: rule__ProveedorNube__AutenticacionUsuarioAssignment_6 : ( ruleAutenticacionUsuario ) ;
    public final void rule__ProveedorNube__AutenticacionUsuarioAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8273:1: ( ( ruleAutenticacionUsuario ) )
            // InternalCeffective.g:8274:2: ( ruleAutenticacionUsuario )
            {
            // InternalCeffective.g:8274:2: ( ruleAutenticacionUsuario )
            // InternalCeffective.g:8275:3: ruleAutenticacionUsuario
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAutenticacionUsuario();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__AutenticacionUsuarioAssignment_6"


    // $ANTLR start "rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1"
    // InternalCeffective.g:8284:1: rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1 : ( ruleAutenticacionUsuario ) ;
    public final void rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8288:1: ( ( ruleAutenticacionUsuario ) )
            // InternalCeffective.g:8289:2: ( ruleAutenticacionUsuario )
            {
            // InternalCeffective.g:8289:2: ( ruleAutenticacionUsuario )
            // InternalCeffective.g:8290:3: ruleAutenticacionUsuario
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAutenticacionUsuario();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__AutenticacionUsuarioAssignment_7_1"


    // $ANTLR start "rule__ProveedorNube__AmbientedespliegueAssignment_9_2"
    // InternalCeffective.g:8299:1: rule__ProveedorNube__AmbientedespliegueAssignment_9_2 : ( ruleAmbienteDespliegue ) ;
    public final void rule__ProveedorNube__AmbientedespliegueAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8303:1: ( ( ruleAmbienteDespliegue ) )
            // InternalCeffective.g:8304:2: ( ruleAmbienteDespliegue )
            {
            // InternalCeffective.g:8304:2: ( ruleAmbienteDespliegue )
            // InternalCeffective.g:8305:3: ruleAmbienteDespliegue
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbienteDespliegue();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__AmbientedespliegueAssignment_9_2"


    // $ANTLR start "rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1"
    // InternalCeffective.g:8314:1: rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1 : ( ruleAmbienteDespliegue ) ;
    public final void rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8318:1: ( ( ruleAmbienteDespliegue ) )
            // InternalCeffective.g:8319:2: ( ruleAmbienteDespliegue )
            {
            // InternalCeffective.g:8319:2: ( ruleAmbienteDespliegue )
            // InternalCeffective.g:8320:3: ruleAmbienteDespliegue
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbienteDespliegue();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__AmbientedespliegueAssignment_9_3_1"


    // $ANTLR start "rule__ProveedorNube__MecanismoseguridadAssignment_10_2"
    // InternalCeffective.g:8329:1: rule__ProveedorNube__MecanismoseguridadAssignment_10_2 : ( ruleMecanismoSeguridad ) ;
    public final void rule__ProveedorNube__MecanismoseguridadAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8333:1: ( ( ruleMecanismoSeguridad ) )
            // InternalCeffective.g:8334:2: ( ruleMecanismoSeguridad )
            {
            // InternalCeffective.g:8334:2: ( ruleMecanismoSeguridad )
            // InternalCeffective.g:8335:3: ruleMecanismoSeguridad
            {
             before(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadMecanismoSeguridadParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMecanismoSeguridad();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadMecanismoSeguridadParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__MecanismoseguridadAssignment_10_2"


    // $ANTLR start "rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1"
    // InternalCeffective.g:8344:1: rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1 : ( ruleMecanismoSeguridad ) ;
    public final void rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8348:1: ( ( ruleMecanismoSeguridad ) )
            // InternalCeffective.g:8349:2: ( ruleMecanismoSeguridad )
            {
            // InternalCeffective.g:8349:2: ( ruleMecanismoSeguridad )
            // InternalCeffective.g:8350:3: ruleMecanismoSeguridad
            {
             before(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadMecanismoSeguridadParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMecanismoSeguridad();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadMecanismoSeguridadParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__MecanismoseguridadAssignment_10_3_1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1"
    // InternalCeffective.g:8359:1: rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8363:1: ( ( ruleEString ) )
            // InternalCeffective.g:8364:2: ( ruleEString )
            {
            // InternalCeffective.g:8364:2: ( ruleEString )
            // InternalCeffective.g:8365:3: ruleEString
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1"
    // InternalCeffective.g:8374:1: rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8378:1: ( ( ruleEString ) )
            // InternalCeffective.g:8379:2: ( ruleEString )
            {
            // InternalCeffective.g:8379:2: ( ruleEString )
            // InternalCeffective.g:8380:3: ruleEString
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1"


    // $ANTLR start "rule__AmbienteDespliegue__AmbienteAssignment_3_1"
    // InternalCeffective.g:8389:1: rule__AmbienteDespliegue__AmbienteAssignment_3_1 : ( ruleTipoAmbiente ) ;
    public final void rule__AmbienteDespliegue__AmbienteAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8393:1: ( ( ruleTipoAmbiente ) )
            // InternalCeffective.g:8394:2: ( ruleTipoAmbiente )
            {
            // InternalCeffective.g:8394:2: ( ruleTipoAmbiente )
            // InternalCeffective.g:8395:3: ruleTipoAmbiente
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getAmbienteTipoAmbienteEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAmbiente();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getAmbienteTipoAmbienteEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__AmbienteAssignment_3_1"


    // $ANTLR start "rule__AmbienteDespliegue__RecursosAssignment_4_2"
    // InternalCeffective.g:8404:1: rule__AmbienteDespliegue__RecursosAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__AmbienteDespliegue__RecursosAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8408:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8409:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8409:2: ( ( ruleEString ) )
            // InternalCeffective.g:8410:3: ( ruleEString )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoCrossReference_4_2_0()); 
            // InternalCeffective.g:8411:3: ( ruleEString )
            // InternalCeffective.g:8412:4: ruleEString
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__RecursosAssignment_4_2"


    // $ANTLR start "rule__AmbienteDespliegue__RecursosAssignment_4_3_1"
    // InternalCeffective.g:8423:1: rule__AmbienteDespliegue__RecursosAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__AmbienteDespliegue__RecursosAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8427:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8428:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8428:2: ( ( ruleEString ) )
            // InternalCeffective.g:8429:3: ( ruleEString )
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoCrossReference_4_3_1_0()); 
            // InternalCeffective.g:8430:3: ( ruleEString )
            // InternalCeffective.g:8431:4: ruleEString
            {
             before(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDespliegue__RecursosAssignment_4_3_1"


    // $ANTLR start "rule__AutenticacionBasica__UsuarioAssignment_3_1"
    // InternalCeffective.g:8442:1: rule__AutenticacionBasica__UsuarioAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AutenticacionBasica__UsuarioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8446:1: ( ( ruleEString ) )
            // InternalCeffective.g:8447:2: ( ruleEString )
            {
            // InternalCeffective.g:8447:2: ( ruleEString )
            // InternalCeffective.g:8448:3: ruleEString
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getUsuarioEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionBasicaAccess().getUsuarioEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__UsuarioAssignment_3_1"


    // $ANTLR start "rule__AutenticacionBasica__CorreoAssignment_4_1"
    // InternalCeffective.g:8457:1: rule__AutenticacionBasica__CorreoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__AutenticacionBasica__CorreoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8461:1: ( ( ruleEString ) )
            // InternalCeffective.g:8462:2: ( ruleEString )
            {
            // InternalCeffective.g:8462:2: ( ruleEString )
            // InternalCeffective.g:8463:3: ruleEString
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getCorreoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionBasicaAccess().getCorreoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__CorreoAssignment_4_1"


    // $ANTLR start "rule__AutenticacionBasica__PasswordAssignment_5_1"
    // InternalCeffective.g:8472:1: rule__AutenticacionBasica__PasswordAssignment_5_1 : ( ruleEString ) ;
    public final void rule__AutenticacionBasica__PasswordAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8476:1: ( ( ruleEString ) )
            // InternalCeffective.g:8477:2: ( ruleEString )
            {
            // InternalCeffective.g:8477:2: ( ruleEString )
            // InternalCeffective.g:8478:3: ruleEString
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getPasswordEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionBasicaAccess().getPasswordEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__PasswordAssignment_5_1"


    // $ANTLR start "rule__AutenticacionFirma__UsuarioAssignment_3_1"
    // InternalCeffective.g:8487:1: rule__AutenticacionFirma__UsuarioAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AutenticacionFirma__UsuarioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8491:1: ( ( ruleEString ) )
            // InternalCeffective.g:8492:2: ( ruleEString )
            {
            // InternalCeffective.g:8492:2: ( ruleEString )
            // InternalCeffective.g:8493:3: ruleEString
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getUsuarioEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaAccess().getUsuarioEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__UsuarioAssignment_3_1"


    // $ANTLR start "rule__AutenticacionFirma__CorreoAssignment_4_1"
    // InternalCeffective.g:8502:1: rule__AutenticacionFirma__CorreoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__AutenticacionFirma__CorreoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8506:1: ( ( ruleEString ) )
            // InternalCeffective.g:8507:2: ( ruleEString )
            {
            // InternalCeffective.g:8507:2: ( ruleEString )
            // InternalCeffective.g:8508:3: ruleEString
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCorreoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaAccess().getCorreoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__CorreoAssignment_4_1"


    // $ANTLR start "rule__AutenticacionFirma__NombreAssignment_5_1"
    // InternalCeffective.g:8517:1: rule__AutenticacionFirma__NombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__AutenticacionFirma__NombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8521:1: ( ( ruleEString ) )
            // InternalCeffective.g:8522:2: ( ruleEString )
            {
            // InternalCeffective.g:8522:2: ( ruleEString )
            // InternalCeffective.g:8523:3: ruleEString
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaAccess().getNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__NombreAssignment_5_1"


    // $ANTLR start "rule__AutenticacionFirma__CertificadoAssignment_6_1"
    // InternalCeffective.g:8532:1: rule__AutenticacionFirma__CertificadoAssignment_6_1 : ( ruleEString ) ;
    public final void rule__AutenticacionFirma__CertificadoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8536:1: ( ( ruleEString ) )
            // InternalCeffective.g:8537:2: ( ruleEString )
            {
            // InternalCeffective.g:8537:2: ( ruleEString )
            // InternalCeffective.g:8538:3: ruleEString
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCertificadoEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaAccess().getCertificadoEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__CertificadoAssignment_6_1"


    // $ANTLR start "rule__ServidorAplicaciones__NombreAssignment_3_1"
    // InternalCeffective.g:8547:1: rule__ServidorAplicaciones__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8551:1: ( ( ruleEString ) )
            // InternalCeffective.g:8552:2: ( ruleEString )
            {
            // InternalCeffective.g:8552:2: ( ruleEString )
            // InternalCeffective.g:8553:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__NombreAssignment_3_1"


    // $ANTLR start "rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:8562:1: rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8566:1: ( ( ruleEString ) )
            // InternalCeffective.g:8567:2: ( ruleEString )
            {
            // InternalCeffective.g:8567:2: ( ruleEString )
            // InternalCeffective.g:8568:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__ServidorAplicaciones__ZonaNombreAssignment_5_1"
    // InternalCeffective.g:8577:1: rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__ZonaNombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8581:1: ( ( ruleEString ) )
            // InternalCeffective.g:8582:2: ( ruleEString )
            {
            // InternalCeffective.g:8582:2: ( ruleEString )
            // InternalCeffective.g:8583:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__ZonaNombreAssignment_5_1"


    // $ANTLR start "rule__ServidorAplicaciones__TamanoAssignment_6_1"
    // InternalCeffective.g:8592:1: rule__ServidorAplicaciones__TamanoAssignment_6_1 : ( ruleTamanoServidor ) ;
    public final void rule__ServidorAplicaciones__TamanoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8596:1: ( ( ruleTamanoServidor ) )
            // InternalCeffective.g:8597:2: ( ruleTamanoServidor )
            {
            // InternalCeffective.g:8597:2: ( ruleTamanoServidor )
            // InternalCeffective.g:8598:3: ruleTamanoServidor
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoServidor();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__TamanoAssignment_6_1"


    // $ANTLR start "rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1"
    // InternalCeffective.g:8607:1: rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8611:1: ( ( ruleEString ) )
            // InternalCeffective.g:8612:2: ( ruleEString )
            {
            // InternalCeffective.g:8612:2: ( ruleEString )
            // InternalCeffective.g:8613:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1"


    // $ANTLR start "rule__ServidorAplicaciones__RecursosAssignment_8_2"
    // InternalCeffective.g:8622:1: rule__ServidorAplicaciones__RecursosAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__RecursosAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8626:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8627:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8627:2: ( ( ruleEString ) )
            // InternalCeffective.g:8628:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_2_0()); 
            // InternalCeffective.g:8629:3: ( ruleEString )
            // InternalCeffective.g:8630:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__RecursosAssignment_8_2"


    // $ANTLR start "rule__ServidorAplicaciones__RecursosAssignment_8_3_1"
    // InternalCeffective.g:8641:1: rule__ServidorAplicaciones__RecursosAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__RecursosAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8645:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8646:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8646:2: ( ( ruleEString ) )
            // InternalCeffective.g:8647:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_3_1_0()); 
            // InternalCeffective.g:8648:3: ( ruleEString )
            // InternalCeffective.g:8649:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__RecursosAssignment_8_3_1"


    // $ANTLR start "rule__ServidorAplicaciones__VpcAssignment_9_1"
    // InternalCeffective.g:8660:1: rule__ServidorAplicaciones__VpcAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__VpcAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8664:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8665:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8665:2: ( ( ruleEString ) )
            // InternalCeffective.g:8666:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_9_1_0()); 
            // InternalCeffective.g:8667:3: ( ruleEString )
            // InternalCeffective.g:8668:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcVPCEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getVpcVPCEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__VpcAssignment_9_1"


    // $ANTLR start "rule__Almacenamiento__NombreAssignment_3_1"
    // InternalCeffective.g:8679:1: rule__Almacenamiento__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Almacenamiento__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8683:1: ( ( ruleEString ) )
            // InternalCeffective.g:8684:2: ( ruleEString )
            {
            // InternalCeffective.g:8684:2: ( ruleEString )
            // InternalCeffective.g:8685:3: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__NombreAssignment_3_1"


    // $ANTLR start "rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:8694:1: rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8698:1: ( ( ruleEString ) )
            // InternalCeffective.g:8699:2: ( ruleEString )
            {
            // InternalCeffective.g:8699:2: ( ruleEString )
            // InternalCeffective.g:8700:3: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__Almacenamiento__ZonaNombreAssignment_5_1"
    // InternalCeffective.g:8709:1: rule__Almacenamiento__ZonaNombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Almacenamiento__ZonaNombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8713:1: ( ( ruleEString ) )
            // InternalCeffective.g:8714:2: ( ruleEString )
            {
            // InternalCeffective.g:8714:2: ( ruleEString )
            // InternalCeffective.g:8715:3: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__ZonaNombreAssignment_5_1"


    // $ANTLR start "rule__Almacenamiento__TamanoInicialAssignment_6_1"
    // InternalCeffective.g:8724:1: rule__Almacenamiento__TamanoInicialAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Almacenamiento__TamanoInicialAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8728:1: ( ( ruleEInt ) )
            // InternalCeffective.g:8729:2: ( ruleEInt )
            {
            // InternalCeffective.g:8729:2: ( ruleEInt )
            // InternalCeffective.g:8730:3: ruleEInt
            {
             before(grammarAccess.getAlmacenamientoAccess().getTamanoInicialEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getTamanoInicialEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__TamanoInicialAssignment_6_1"


    // $ANTLR start "rule__Almacenamiento__RecursosAssignment_7_2"
    // InternalCeffective.g:8739:1: rule__Almacenamiento__RecursosAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Almacenamiento__RecursosAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8743:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8744:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8744:2: ( ( ruleEString ) )
            // InternalCeffective.g:8745:3: ( ruleEString )
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_2_0()); 
            // InternalCeffective.g:8746:3: ( ruleEString )
            // InternalCeffective.g:8747:4: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__RecursosAssignment_7_2"


    // $ANTLR start "rule__Almacenamiento__RecursosAssignment_7_3_1"
    // InternalCeffective.g:8758:1: rule__Almacenamiento__RecursosAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Almacenamiento__RecursosAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8762:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8763:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8763:2: ( ( ruleEString ) )
            // InternalCeffective.g:8764:3: ( ruleEString )
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_3_1_0()); 
            // InternalCeffective.g:8765:3: ( ruleEString )
            // InternalCeffective.g:8766:4: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__RecursosAssignment_7_3_1"


    // $ANTLR start "rule__Almacenamiento__VpcAssignment_8_1"
    // InternalCeffective.g:8777:1: rule__Almacenamiento__VpcAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Almacenamiento__VpcAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8781:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8782:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8782:2: ( ( ruleEString ) )
            // InternalCeffective.g:8783:3: ( ruleEString )
            {
             before(grammarAccess.getAlmacenamientoAccess().getVpcVPCCrossReference_8_1_0()); 
            // InternalCeffective.g:8784:3: ( ruleEString )
            // InternalCeffective.g:8785:4: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getVpcVPCEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getVpcVPCEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getAlmacenamientoAccess().getVpcVPCCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__VpcAssignment_8_1"


    // $ANTLR start "rule__ServidorBD__NombreAssignment_3_1"
    // InternalCeffective.g:8796:1: rule__ServidorBD__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServidorBD__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8800:1: ( ( ruleEString ) )
            // InternalCeffective.g:8801:2: ( ruleEString )
            {
            // InternalCeffective.g:8801:2: ( ruleEString )
            // InternalCeffective.g:8802:3: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__NombreAssignment_3_1"


    // $ANTLR start "rule__ServidorBD__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:8811:1: rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ServidorBD__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8815:1: ( ( ruleEString ) )
            // InternalCeffective.g:8816:2: ( ruleEString )
            {
            // InternalCeffective.g:8816:2: ( ruleEString )
            // InternalCeffective.g:8817:3: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__ServidorBD__ZonaNombreAssignment_5_1"
    // InternalCeffective.g:8826:1: rule__ServidorBD__ZonaNombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ServidorBD__ZonaNombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8830:1: ( ( ruleEString ) )
            // InternalCeffective.g:8831:2: ( ruleEString )
            {
            // InternalCeffective.g:8831:2: ( ruleEString )
            // InternalCeffective.g:8832:3: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__ZonaNombreAssignment_5_1"


    // $ANTLR start "rule__ServidorBD__TamanoAssignment_6_1"
    // InternalCeffective.g:8841:1: rule__ServidorBD__TamanoAssignment_6_1 : ( ruleTamanoServidor ) ;
    public final void rule__ServidorBD__TamanoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8845:1: ( ( ruleTamanoServidor ) )
            // InternalCeffective.g:8846:2: ( ruleTamanoServidor )
            {
            // InternalCeffective.g:8846:2: ( ruleTamanoServidor )
            // InternalCeffective.g:8847:3: ruleTamanoServidor
            {
             before(grammarAccess.getServidorBDAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoServidor();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__TamanoAssignment_6_1"


    // $ANTLR start "rule__ServidorBD__TipoAssignment_7_1"
    // InternalCeffective.g:8856:1: rule__ServidorBD__TipoAssignment_7_1 : ( ruleTipoBaseDatos ) ;
    public final void rule__ServidorBD__TipoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8860:1: ( ( ruleTipoBaseDatos ) )
            // InternalCeffective.g:8861:2: ( ruleTipoBaseDatos )
            {
            // InternalCeffective.g:8861:2: ( ruleTipoBaseDatos )
            // InternalCeffective.g:8862:3: ruleTipoBaseDatos
            {
             before(grammarAccess.getServidorBDAccess().getTipoTipoBaseDatosEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoBaseDatos();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getTipoTipoBaseDatosEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__TipoAssignment_7_1"


    // $ANTLR start "rule__ServidorBD__SistemaManejadorAssignment_8_1"
    // InternalCeffective.g:8871:1: rule__ServidorBD__SistemaManejadorAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ServidorBD__SistemaManejadorAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8875:1: ( ( ruleEString ) )
            // InternalCeffective.g:8876:2: ( ruleEString )
            {
            // InternalCeffective.g:8876:2: ( ruleEString )
            // InternalCeffective.g:8877:3: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getSistemaManejadorEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getSistemaManejadorEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__SistemaManejadorAssignment_8_1"


    // $ANTLR start "rule__ServidorBD__RecursosAssignment_9_2"
    // InternalCeffective.g:8886:1: rule__ServidorBD__RecursosAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBD__RecursosAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8890:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8891:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8891:2: ( ( ruleEString ) )
            // InternalCeffective.g:8892:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_2_0()); 
            // InternalCeffective.g:8893:3: ( ruleEString )
            // InternalCeffective.g:8894:4: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getRecursosRecursoEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getRecursosRecursoEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__RecursosAssignment_9_2"


    // $ANTLR start "rule__ServidorBD__RecursosAssignment_9_3_1"
    // InternalCeffective.g:8905:1: rule__ServidorBD__RecursosAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBD__RecursosAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8909:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8910:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8910:2: ( ( ruleEString ) )
            // InternalCeffective.g:8911:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_3_1_0()); 
            // InternalCeffective.g:8912:3: ( ruleEString )
            // InternalCeffective.g:8913:4: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getRecursosRecursoEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getRecursosRecursoEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__RecursosAssignment_9_3_1"


    // $ANTLR start "rule__ServidorBD__VpcAssignment_10_1"
    // InternalCeffective.g:8924:1: rule__ServidorBD__VpcAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBD__VpcAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8928:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8929:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8929:2: ( ( ruleEString ) )
            // InternalCeffective.g:8930:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBDAccess().getVpcVPCCrossReference_10_1_0()); 
            // InternalCeffective.g:8931:3: ( ruleEString )
            // InternalCeffective.g:8932:4: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getVpcVPCEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getVpcVPCEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getServidorBDAccess().getVpcVPCCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__VpcAssignment_10_1"


    // $ANTLR start "rule__Servidor_Impl__NombreAssignment_3_1"
    // InternalCeffective.g:8943:1: rule__Servidor_Impl__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Servidor_Impl__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8947:1: ( ( ruleEString ) )
            // InternalCeffective.g:8948:2: ( ruleEString )
            {
            // InternalCeffective.g:8948:2: ( ruleEString )
            // InternalCeffective.g:8949:3: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__NombreAssignment_3_1"


    // $ANTLR start "rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:8958:1: rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8962:1: ( ( ruleEString ) )
            // InternalCeffective.g:8963:2: ( ruleEString )
            {
            // InternalCeffective.g:8963:2: ( ruleEString )
            // InternalCeffective.g:8964:3: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__Servidor_Impl__ZonaNombreAssignment_5_1"
    // InternalCeffective.g:8973:1: rule__Servidor_Impl__ZonaNombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Servidor_Impl__ZonaNombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8977:1: ( ( ruleEString ) )
            // InternalCeffective.g:8978:2: ( ruleEString )
            {
            // InternalCeffective.g:8978:2: ( ruleEString )
            // InternalCeffective.g:8979:3: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__ZonaNombreAssignment_5_1"


    // $ANTLR start "rule__Servidor_Impl__TamanoAssignment_6_1"
    // InternalCeffective.g:8988:1: rule__Servidor_Impl__TamanoAssignment_6_1 : ( ruleTamanoServidor ) ;
    public final void rule__Servidor_Impl__TamanoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8992:1: ( ( ruleTamanoServidor ) )
            // InternalCeffective.g:8993:2: ( ruleTamanoServidor )
            {
            // InternalCeffective.g:8993:2: ( ruleTamanoServidor )
            // InternalCeffective.g:8994:3: ruleTamanoServidor
            {
             before(grammarAccess.getServidor_ImplAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoServidor();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__TamanoAssignment_6_1"


    // $ANTLR start "rule__Servidor_Impl__RecursosAssignment_7_2"
    // InternalCeffective.g:9003:1: rule__Servidor_Impl__RecursosAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Servidor_Impl__RecursosAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9007:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9008:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9008:2: ( ( ruleEString ) )
            // InternalCeffective.g:9009:3: ( ruleEString )
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_2_0()); 
            // InternalCeffective.g:9010:3: ( ruleEString )
            // InternalCeffective.g:9011:4: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosRecursoEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getRecursosRecursoEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__RecursosAssignment_7_2"


    // $ANTLR start "rule__Servidor_Impl__RecursosAssignment_7_3_1"
    // InternalCeffective.g:9022:1: rule__Servidor_Impl__RecursosAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Servidor_Impl__RecursosAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9026:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9027:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9027:2: ( ( ruleEString ) )
            // InternalCeffective.g:9028:3: ( ruleEString )
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_3_1_0()); 
            // InternalCeffective.g:9029:3: ( ruleEString )
            // InternalCeffective.g:9030:4: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosRecursoEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getRecursosRecursoEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__RecursosAssignment_7_3_1"


    // $ANTLR start "rule__Servidor_Impl__VpcAssignment_8_1"
    // InternalCeffective.g:9041:1: rule__Servidor_Impl__VpcAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Servidor_Impl__VpcAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9045:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9046:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9046:2: ( ( ruleEString ) )
            // InternalCeffective.g:9047:3: ( ruleEString )
            {
             before(grammarAccess.getServidor_ImplAccess().getVpcVPCCrossReference_8_1_0()); 
            // InternalCeffective.g:9048:3: ( ruleEString )
            // InternalCeffective.g:9049:4: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getVpcVPCEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getVpcVPCEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getServidor_ImplAccess().getVpcVPCCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__VpcAssignment_8_1"


    // $ANTLR start "rule__Subred__NombreAssignment_3_1"
    // InternalCeffective.g:9060:1: rule__Subred__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Subred__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9064:1: ( ( ruleEString ) )
            // InternalCeffective.g:9065:2: ( ruleEString )
            {
            // InternalCeffective.g:9065:2: ( ruleEString )
            // InternalCeffective.g:9066:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__NombreAssignment_3_1"


    // $ANTLR start "rule__Subred__ZonaNombreAssignment_4_1"
    // InternalCeffective.g:9075:1: rule__Subred__ZonaNombreAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Subred__ZonaNombreAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9079:1: ( ( ruleEString ) )
            // InternalCeffective.g:9080:2: ( ruleEString )
            {
            // InternalCeffective.g:9080:2: ( ruleEString )
            // InternalCeffective.g:9081:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getZonaNombreEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getZonaNombreEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__ZonaNombreAssignment_4_1"


    // $ANTLR start "rule__Subred__ZonaDisponibilidadAssignment_5_1"
    // InternalCeffective.g:9090:1: rule__Subred__ZonaDisponibilidadAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Subred__ZonaDisponibilidadAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9094:1: ( ( ruleEString ) )
            // InternalCeffective.g:9095:2: ( ruleEString )
            {
            // InternalCeffective.g:9095:2: ( ruleEString )
            // InternalCeffective.g:9096:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__ZonaDisponibilidadAssignment_5_1"


    // $ANTLR start "rule__Subred__CidrBlockAssignment_6_1"
    // InternalCeffective.g:9105:1: rule__Subred__CidrBlockAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Subred__CidrBlockAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9109:1: ( ( ruleEString ) )
            // InternalCeffective.g:9110:2: ( ruleEString )
            {
            // InternalCeffective.g:9110:2: ( ruleEString )
            // InternalCeffective.g:9111:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getCidrBlockEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getCidrBlockEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__CidrBlockAssignment_6_1"


    // $ANTLR start "rule__Subred__VpcAssignment_7_1"
    // InternalCeffective.g:9120:1: rule__Subred__VpcAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Subred__VpcAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9124:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9125:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9125:2: ( ( ruleEString ) )
            // InternalCeffective.g:9126:3: ( ruleEString )
            {
             before(grammarAccess.getSubredAccess().getVpcVPCCrossReference_7_1_0()); 
            // InternalCeffective.g:9127:3: ( ruleEString )
            // InternalCeffective.g:9128:4: ruleEString
            {
             before(grammarAccess.getSubredAccess().getVpcVPCEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getVpcVPCEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getSubredAccess().getVpcVPCCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__VpcAssignment_7_1"


    // $ANTLR start "rule__InternetGateway__NombreAssignment_3_1"
    // InternalCeffective.g:9139:1: rule__InternetGateway__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__InternetGateway__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9143:1: ( ( ruleEString ) )
            // InternalCeffective.g:9144:2: ( ruleEString )
            {
            // InternalCeffective.g:9144:2: ( ruleEString )
            // InternalCeffective.g:9145:3: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__NombreAssignment_3_1"


    // $ANTLR start "rule__InternetGateway__ZonaNombreAssignment_4_1"
    // InternalCeffective.g:9154:1: rule__InternetGateway__ZonaNombreAssignment_4_1 : ( ruleEString ) ;
    public final void rule__InternetGateway__ZonaNombreAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9158:1: ( ( ruleEString ) )
            // InternalCeffective.g:9159:2: ( ruleEString )
            {
            // InternalCeffective.g:9159:2: ( ruleEString )
            // InternalCeffective.g:9160:3: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaNombreEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getZonaNombreEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__ZonaNombreAssignment_4_1"


    // $ANTLR start "rule__InternetGateway__ZonaDisponibilidadAssignment_5_1"
    // InternalCeffective.g:9169:1: rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 : ( ruleEString ) ;
    public final void rule__InternetGateway__ZonaDisponibilidadAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9173:1: ( ( ruleEString ) )
            // InternalCeffective.g:9174:2: ( ruleEString )
            {
            // InternalCeffective.g:9174:2: ( ruleEString )
            // InternalCeffective.g:9175:3: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__ZonaDisponibilidadAssignment_5_1"


    // $ANTLR start "rule__InternetGateway__VpcAssignment_6_1"
    // InternalCeffective.g:9184:1: rule__InternetGateway__VpcAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__InternetGateway__VpcAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9188:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9189:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9189:2: ( ( ruleEString ) )
            // InternalCeffective.g:9190:3: ( ruleEString )
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcVPCCrossReference_6_1_0()); 
            // InternalCeffective.g:9191:3: ( ruleEString )
            // InternalCeffective.g:9192:4: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getVpcVPCEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getVpcVPCEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getInternetGatewayAccess().getVpcVPCCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__VpcAssignment_6_1"


    // $ANTLR start "rule__GrupoSeguridad__NombreAssignment_2_1"
    // InternalCeffective.g:9203:1: rule__GrupoSeguridad__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9207:1: ( ( ruleEString ) )
            // InternalCeffective.g:9208:2: ( ruleEString )
            {
            // InternalCeffective.g:9208:2: ( ruleEString )
            // InternalCeffective.g:9209:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__NombreAssignment_2_1"


    // $ANTLR start "rule__GrupoSeguridad__ZonaNombreAssignment_3_1"
    // InternalCeffective.g:9218:1: rule__GrupoSeguridad__ZonaNombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__ZonaNombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9222:1: ( ( ruleEString ) )
            // InternalCeffective.g:9223:2: ( ruleEString )
            {
            // InternalCeffective.g:9223:2: ( ruleEString )
            // InternalCeffective.g:9224:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getZonaNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ZonaNombreAssignment_3_1"


    // $ANTLR start "rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:9233:1: rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9237:1: ( ( ruleEString ) )
            // InternalCeffective.g:9238:2: ( ruleEString )
            {
            // InternalCeffective.g:9238:2: ( ruleEString )
            // InternalCeffective.g:9239:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__GrupoSeguridad__DescripcionAssignment_5_1"
    // InternalCeffective.g:9248:1: rule__GrupoSeguridad__DescripcionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__DescripcionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9252:1: ( ( ruleEString ) )
            // InternalCeffective.g:9253:2: ( ruleEString )
            {
            // InternalCeffective.g:9253:2: ( ruleEString )
            // InternalCeffective.g:9254:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__DescripcionAssignment_5_1"


    // $ANTLR start "rule__GrupoSeguridad__VpcAssignment_6_1"
    // InternalCeffective.g:9263:1: rule__GrupoSeguridad__VpcAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__VpcAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9267:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9268:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9268:2: ( ( ruleEString ) )
            // InternalCeffective.g:9269:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcVPCCrossReference_6_1_0()); 
            // InternalCeffective.g:9270:3: ( ruleEString )
            // InternalCeffective.g:9271:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getVpcVPCEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getVpcVPCEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getVpcVPCCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__VpcAssignment_6_1"


    // $ANTLR start "rule__GrupoSeguridad__ReglasSalidaAssignment_9"
    // InternalCeffective.g:9282:1: rule__GrupoSeguridad__ReglasSalidaAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__ReglasSalidaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9286:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9287:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9287:2: ( ( ruleEString ) )
            // InternalCeffective.g:9288:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_9_0()); 
            // InternalCeffective.g:9289:3: ( ruleEString )
            // InternalCeffective.g:9290:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasSalidaAssignment_9"


    // $ANTLR start "rule__GrupoSeguridad__ReglasSalidaAssignment_10_1"
    // InternalCeffective.g:9301:1: rule__GrupoSeguridad__ReglasSalidaAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__ReglasSalidaAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9305:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9306:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9306:2: ( ( ruleEString ) )
            // InternalCeffective.g:9307:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_10_1_0()); 
            // InternalCeffective.g:9308:3: ( ruleEString )
            // InternalCeffective.g:9309:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasSalidaAssignment_10_1"


    // $ANTLR start "rule__GrupoSeguridad__ReglasEntradaAssignment_14"
    // InternalCeffective.g:9320:1: rule__GrupoSeguridad__ReglasEntradaAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__ReglasEntradaAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9324:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9325:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9325:2: ( ( ruleEString ) )
            // InternalCeffective.g:9326:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_14_0()); 
            // InternalCeffective.g:9327:3: ( ruleEString )
            // InternalCeffective.g:9328:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaEStringParserRuleCall_14_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaEStringParserRuleCall_14_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasEntradaAssignment_14"


    // $ANTLR start "rule__GrupoSeguridad__ReglasEntradaAssignment_15_1"
    // InternalCeffective.g:9339:1: rule__GrupoSeguridad__ReglasEntradaAssignment_15_1 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__ReglasEntradaAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:9343:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:9344:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:9344:2: ( ( ruleEString ) )
            // InternalCeffective.g:9345:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_15_1_0()); 
            // InternalCeffective.g:9346:3: ( ruleEString )
            // InternalCeffective.g:9347:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaEStringParserRuleCall_15_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaEStringParserRuleCall_15_1_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasEntradaAssignment_15_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000050100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000C0800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0D00000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000600800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000003000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020600800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080608800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001E02018800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004602018800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0030E02018800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000E02018800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200600018800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000600018800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x5000600018000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000800000L});

}