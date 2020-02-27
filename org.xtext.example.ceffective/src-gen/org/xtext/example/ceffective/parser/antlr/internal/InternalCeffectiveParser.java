package org.xtext.example.ceffective.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.ceffective.services.CeffectiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCeffectiveParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ceffective'", "'{'", "'proveedorNube'", "'}'", "'ProveedorNube'", "'nombre'", "'vpc'", "'autenticacionUsuario'", "','", "'ambientedespliegue'", "'mecanismoseguridad'", "'AutenticacionUsuario'", "'usuario'", "'correo'", "'AmbienteDespliegue'", "'ambiente'", "'recursos'", "'('", "')'", "'AutenticacionBasica'", "'password'", "'AutenticacionFirma'", "'certificado'", "'ServidorAplicaciones'", "'zonaDisponibilidad'", "'zonaNombre'", "'tamano'", "'sistemaOperativo'", "'Almacenamiento'", "'tamanoInicial'", "'ServidorBD'", "'tipo'", "'sistemaManejador'", "'Servidor'", "'-'", "'Subred'", "'cidrBlock'", "'InternetGateway'", "'GrupoSeguridad'", "'descripcion'", "'reglasSalida'", "'reglasEntrada'", "'IST'", "'QA'", "'NFT'", "'PRD'", "'Micro'", "'Small'", "'Medium'", "'Large'", "'Relacional'", "'NoSql'"
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

        public InternalCeffectiveParser(TokenStream input, CeffectiveGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Ceffective";
       	}

       	@Override
       	protected CeffectiveGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCeffective"
    // InternalCeffective.g:65:1: entryRuleCeffective returns [EObject current=null] : iv_ruleCeffective= ruleCeffective EOF ;
    public final EObject entryRuleCeffective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCeffective = null;


        try {
            // InternalCeffective.g:65:51: (iv_ruleCeffective= ruleCeffective EOF )
            // InternalCeffective.g:66:2: iv_ruleCeffective= ruleCeffective EOF
            {
             newCompositeNode(grammarAccess.getCeffectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCeffective=ruleCeffective();

            state._fsp--;

             current =iv_ruleCeffective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCeffective"


    // $ANTLR start "ruleCeffective"
    // InternalCeffective.g:72:1: ruleCeffective returns [EObject current=null] : ( () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCeffective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_proveedorNube_4_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:78:2: ( ( () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}' ) )
            // InternalCeffective.g:79:2: ( () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}' )
            {
            // InternalCeffective.g:79:2: ( () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}' )
            // InternalCeffective.g:80:3: () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}'
            {
            // InternalCeffective.g:80:3: ()
            // InternalCeffective.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCeffectiveAccess().getCeffectiveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCeffectiveAccess().getCeffectiveKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCeffectiveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:95:3: (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCeffective.g:96:4: otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCeffectiveAccess().getProveedorNubeKeyword_3_0());
                    			
                    // InternalCeffective.g:100:4: ( (lv_proveedorNube_4_0= ruleProveedorNube ) )
                    // InternalCeffective.g:101:5: (lv_proveedorNube_4_0= ruleProveedorNube )
                    {
                    // InternalCeffective.g:101:5: (lv_proveedorNube_4_0= ruleProveedorNube )
                    // InternalCeffective.g:102:6: lv_proveedorNube_4_0= ruleProveedorNube
                    {

                    						newCompositeNode(grammarAccess.getCeffectiveAccess().getProveedorNubeProveedorNubeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_proveedorNube_4_0=ruleProveedorNube();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCeffectiveRule());
                    						}
                    						set(
                    							current,
                    							"proveedorNube",
                    							lv_proveedorNube_4_0,
                    							"org.xtext.example.ceffective.Ceffective.ProveedorNube");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCeffectiveAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCeffective"


    // $ANTLR start "entryRuleAutenticacionUsuario"
    // InternalCeffective.g:128:1: entryRuleAutenticacionUsuario returns [EObject current=null] : iv_ruleAutenticacionUsuario= ruleAutenticacionUsuario EOF ;
    public final EObject entryRuleAutenticacionUsuario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutenticacionUsuario = null;


        try {
            // InternalCeffective.g:128:61: (iv_ruleAutenticacionUsuario= ruleAutenticacionUsuario EOF )
            // InternalCeffective.g:129:2: iv_ruleAutenticacionUsuario= ruleAutenticacionUsuario EOF
            {
             newCompositeNode(grammarAccess.getAutenticacionUsuarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutenticacionUsuario=ruleAutenticacionUsuario();

            state._fsp--;

             current =iv_ruleAutenticacionUsuario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutenticacionUsuario"


    // $ANTLR start "ruleAutenticacionUsuario"
    // InternalCeffective.g:135:1: ruleAutenticacionUsuario returns [EObject current=null] : (this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl | this_AutenticacionBasica_1= ruleAutenticacionBasica | this_AutenticacionFirma_2= ruleAutenticacionFirma ) ;
    public final EObject ruleAutenticacionUsuario() throws RecognitionException {
        EObject current = null;

        EObject this_AutenticacionUsuario_Impl_0 = null;

        EObject this_AutenticacionBasica_1 = null;

        EObject this_AutenticacionFirma_2 = null;



        	enterRule();

        try {
            // InternalCeffective.g:141:2: ( (this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl | this_AutenticacionBasica_1= ruleAutenticacionBasica | this_AutenticacionFirma_2= ruleAutenticacionFirma ) )
            // InternalCeffective.g:142:2: (this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl | this_AutenticacionBasica_1= ruleAutenticacionBasica | this_AutenticacionFirma_2= ruleAutenticacionFirma )
            {
            // InternalCeffective.g:142:2: (this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl | this_AutenticacionBasica_1= ruleAutenticacionBasica | this_AutenticacionFirma_2= ruleAutenticacionFirma )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 32:
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
                    // InternalCeffective.g:143:3: this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl
                    {

                    			newCompositeNode(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionUsuario_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutenticacionUsuario_Impl_0=ruleAutenticacionUsuario_Impl();

                    state._fsp--;


                    			current = this_AutenticacionUsuario_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCeffective.g:152:3: this_AutenticacionBasica_1= ruleAutenticacionBasica
                    {

                    			newCompositeNode(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionBasicaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutenticacionBasica_1=ruleAutenticacionBasica();

                    state._fsp--;


                    			current = this_AutenticacionBasica_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCeffective.g:161:3: this_AutenticacionFirma_2= ruleAutenticacionFirma
                    {

                    			newCompositeNode(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionFirmaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutenticacionFirma_2=ruleAutenticacionFirma();

                    state._fsp--;


                    			current = this_AutenticacionFirma_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutenticacionUsuario"


    // $ANTLR start "entryRuleMecanismoSeguridad"
    // InternalCeffective.g:173:1: entryRuleMecanismoSeguridad returns [EObject current=null] : iv_ruleMecanismoSeguridad= ruleMecanismoSeguridad EOF ;
    public final EObject entryRuleMecanismoSeguridad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMecanismoSeguridad = null;


        try {
            // InternalCeffective.g:173:59: (iv_ruleMecanismoSeguridad= ruleMecanismoSeguridad EOF )
            // InternalCeffective.g:174:2: iv_ruleMecanismoSeguridad= ruleMecanismoSeguridad EOF
            {
             newCompositeNode(grammarAccess.getMecanismoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMecanismoSeguridad=ruleMecanismoSeguridad();

            state._fsp--;

             current =iv_ruleMecanismoSeguridad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMecanismoSeguridad"


    // $ANTLR start "ruleMecanismoSeguridad"
    // InternalCeffective.g:180:1: ruleMecanismoSeguridad returns [EObject current=null] : (this_Subred_0= ruleSubred | this_InternetGateway_1= ruleInternetGateway | this_GrupoSeguridad_2= ruleGrupoSeguridad ) ;
    public final EObject ruleMecanismoSeguridad() throws RecognitionException {
        EObject current = null;

        EObject this_Subred_0 = null;

        EObject this_InternetGateway_1 = null;

        EObject this_GrupoSeguridad_2 = null;



        	enterRule();

        try {
            // InternalCeffective.g:186:2: ( (this_Subred_0= ruleSubred | this_InternetGateway_1= ruleInternetGateway | this_GrupoSeguridad_2= ruleGrupoSeguridad ) )
            // InternalCeffective.g:187:2: (this_Subred_0= ruleSubred | this_InternetGateway_1= ruleInternetGateway | this_GrupoSeguridad_2= ruleGrupoSeguridad )
            {
            // InternalCeffective.g:187:2: (this_Subred_0= ruleSubred | this_InternetGateway_1= ruleInternetGateway | this_GrupoSeguridad_2= ruleGrupoSeguridad )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt3=1;
                }
                break;
            case 48:
                {
                alt3=2;
                }
                break;
            case 49:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCeffective.g:188:3: this_Subred_0= ruleSubred
                    {

                    			newCompositeNode(grammarAccess.getMecanismoSeguridadAccess().getSubredParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Subred_0=ruleSubred();

                    state._fsp--;


                    			current = this_Subred_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCeffective.g:197:3: this_InternetGateway_1= ruleInternetGateway
                    {

                    			newCompositeNode(grammarAccess.getMecanismoSeguridadAccess().getInternetGatewayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InternetGateway_1=ruleInternetGateway();

                    state._fsp--;


                    			current = this_InternetGateway_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCeffective.g:206:3: this_GrupoSeguridad_2= ruleGrupoSeguridad
                    {

                    			newCompositeNode(grammarAccess.getMecanismoSeguridadAccess().getGrupoSeguridadParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GrupoSeguridad_2=ruleGrupoSeguridad();

                    state._fsp--;


                    			current = this_GrupoSeguridad_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMecanismoSeguridad"


    // $ANTLR start "entryRuleProveedorNube"
    // InternalCeffective.g:218:1: entryRuleProveedorNube returns [EObject current=null] : iv_ruleProveedorNube= ruleProveedorNube EOF ;
    public final EObject entryRuleProveedorNube() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProveedorNube = null;


        try {
            // InternalCeffective.g:218:54: (iv_ruleProveedorNube= ruleProveedorNube EOF )
            // InternalCeffective.g:219:2: iv_ruleProveedorNube= ruleProveedorNube EOF
            {
             newCompositeNode(grammarAccess.getProveedorNubeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProveedorNube=ruleProveedorNube();

            state._fsp--;

             current =iv_ruleProveedorNube; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProveedorNube"


    // $ANTLR start "ruleProveedorNube"
    // InternalCeffective.g:225:1: ruleProveedorNube returns [EObject current=null] : (otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'vpc' ( ( ruleEString ) ) )? otherlv_6= 'autenticacionUsuario' otherlv_7= '{' ( (lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario ) ) (otherlv_9= ',' ( (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario ) ) )* otherlv_11= '}' (otherlv_12= 'ambientedespliegue' otherlv_13= '{' ( (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue ) ) (otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) ) )* otherlv_17= '}' )? (otherlv_18= 'mecanismoseguridad' otherlv_19= '{' ( (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad ) ) (otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
    public final EObject ruleProveedorNube() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        EObject lv_autenticacionUsuario_8_0 = null;

        EObject lv_autenticacionUsuario_10_0 = null;

        EObject lv_ambientedespliegue_14_0 = null;

        EObject lv_ambientedespliegue_16_0 = null;

        EObject lv_mecanismoseguridad_20_0 = null;

        EObject lv_mecanismoseguridad_22_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:231:2: ( (otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'vpc' ( ( ruleEString ) ) )? otherlv_6= 'autenticacionUsuario' otherlv_7= '{' ( (lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario ) ) (otherlv_9= ',' ( (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario ) ) )* otherlv_11= '}' (otherlv_12= 'ambientedespliegue' otherlv_13= '{' ( (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue ) ) (otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) ) )* otherlv_17= '}' )? (otherlv_18= 'mecanismoseguridad' otherlv_19= '{' ( (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad ) ) (otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalCeffective.g:232:2: (otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'vpc' ( ( ruleEString ) ) )? otherlv_6= 'autenticacionUsuario' otherlv_7= '{' ( (lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario ) ) (otherlv_9= ',' ( (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario ) ) )* otherlv_11= '}' (otherlv_12= 'ambientedespliegue' otherlv_13= '{' ( (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue ) ) (otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) ) )* otherlv_17= '}' )? (otherlv_18= 'mecanismoseguridad' otherlv_19= '{' ( (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad ) ) (otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalCeffective.g:232:2: (otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'vpc' ( ( ruleEString ) ) )? otherlv_6= 'autenticacionUsuario' otherlv_7= '{' ( (lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario ) ) (otherlv_9= ',' ( (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario ) ) )* otherlv_11= '}' (otherlv_12= 'ambientedespliegue' otherlv_13= '{' ( (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue ) ) (otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) ) )* otherlv_17= '}' )? (otherlv_18= 'mecanismoseguridad' otherlv_19= '{' ( (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad ) ) (otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalCeffective.g:233:3: otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'vpc' ( ( ruleEString ) ) )? otherlv_6= 'autenticacionUsuario' otherlv_7= '{' ( (lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario ) ) (otherlv_9= ',' ( (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario ) ) )* otherlv_11= '}' (otherlv_12= 'ambientedespliegue' otherlv_13= '{' ( (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue ) ) (otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) ) )* otherlv_17= '}' )? (otherlv_18= 'mecanismoseguridad' otherlv_19= '{' ( (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad ) ) (otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProveedorNubeAccess().getProveedorNubeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCeffective.g:241:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCeffective.g:242:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getProveedorNubeAccess().getNombreKeyword_2_0());
                    			
                    // InternalCeffective.g:246:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalCeffective.g:247:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalCeffective.g:247:5: (lv_nombre_3_0= ruleEString )
                    // InternalCeffective.g:248:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:266:3: (otherlv_4= 'vpc' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCeffective.g:267:4: otherlv_4= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getProveedorNubeAccess().getVpcKeyword_3_0());
                    			
                    // InternalCeffective.g:271:4: ( ( ruleEString ) )
                    // InternalCeffective.g:272:5: ( ruleEString )
                    {
                    // InternalCeffective.g:272:5: ( ruleEString )
                    // InternalCeffective.g:273:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProveedorNubeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioKeyword_4());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalCeffective.g:296:3: ( (lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario ) )
            // InternalCeffective.g:297:4: (lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario )
            {
            // InternalCeffective.g:297:4: (lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario )
            // InternalCeffective.g:298:5: lv_autenticacionUsuario_8_0= ruleAutenticacionUsuario
            {

            					newCompositeNode(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_autenticacionUsuario_8_0=ruleAutenticacionUsuario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
            					}
            					add(
            						current,
            						"autenticacionUsuario",
            						lv_autenticacionUsuario_8_0,
            						"org.xtext.example.ceffective.Ceffective.AutenticacionUsuario");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCeffective.g:315:3: (otherlv_9= ',' ( (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCeffective.g:316:4: otherlv_9= ',' ( (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario ) )
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_11); 

            	    				newLeafNode(otherlv_9, grammarAccess.getProveedorNubeAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCeffective.g:320:4: ( (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario ) )
            	    // InternalCeffective.g:321:5: (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario )
            	    {
            	    // InternalCeffective.g:321:5: (lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario )
            	    // InternalCeffective.g:322:6: lv_autenticacionUsuario_10_0= ruleAutenticacionUsuario
            	    {

            	    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_autenticacionUsuario_10_0=ruleAutenticacionUsuario();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"autenticacionUsuario",
            	    							lv_autenticacionUsuario_10_0,
            	    							"org.xtext.example.ceffective.Ceffective.AutenticacionUsuario");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_11=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalCeffective.g:344:3: (otherlv_12= 'ambientedespliegue' otherlv_13= '{' ( (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue ) ) (otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) ) )* otherlv_17= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCeffective.g:345:4: otherlv_12= 'ambientedespliegue' otherlv_13= '{' ( (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue ) ) (otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getProveedorNubeAccess().getAmbientedespliegueKeyword_9_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalCeffective.g:353:4: ( (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue ) )
                    // InternalCeffective.g:354:5: (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue )
                    {
                    // InternalCeffective.g:354:5: (lv_ambientedespliegue_14_0= ruleAmbienteDespliegue )
                    // InternalCeffective.g:355:6: lv_ambientedespliegue_14_0= ruleAmbienteDespliegue
                    {

                    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_ambientedespliegue_14_0=ruleAmbienteDespliegue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
                    						}
                    						add(
                    							current,
                    							"ambientedespliegue",
                    							lv_ambientedespliegue_14_0,
                    							"org.xtext.example.ceffective.Ceffective.AmbienteDespliegue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:372:4: (otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==19) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCeffective.g:373:5: otherlv_15= ',' ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_14); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getProveedorNubeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCeffective.g:377:5: ( (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue ) )
                    	    // InternalCeffective.g:378:6: (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue )
                    	    {
                    	    // InternalCeffective.g:378:6: (lv_ambientedespliegue_16_0= ruleAmbienteDespliegue )
                    	    // InternalCeffective.g:379:7: lv_ambientedespliegue_16_0= ruleAmbienteDespliegue
                    	    {

                    	    							newCompositeNode(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_ambientedespliegue_16_0=ruleAmbienteDespliegue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ambientedespliegue",
                    	    								lv_ambientedespliegue_16_0,
                    	    								"org.xtext.example.ceffective.Ceffective.AmbienteDespliegue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_17, grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:402:3: (otherlv_18= 'mecanismoseguridad' otherlv_19= '{' ( (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad ) ) (otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) ) )* otherlv_23= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCeffective.g:403:4: otherlv_18= 'mecanismoseguridad' otherlv_19= '{' ( (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad ) ) (otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getProveedorNubeAccess().getMecanismoseguridadKeyword_10_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalCeffective.g:411:4: ( (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad ) )
                    // InternalCeffective.g:412:5: (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad )
                    {
                    // InternalCeffective.g:412:5: (lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad )
                    // InternalCeffective.g:413:6: lv_mecanismoseguridad_20_0= ruleMecanismoSeguridad
                    {

                    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadMecanismoSeguridadParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_mecanismoseguridad_20_0=ruleMecanismoSeguridad();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
                    						}
                    						add(
                    							current,
                    							"mecanismoseguridad",
                    							lv_mecanismoseguridad_20_0,
                    							"org.xtext.example.ceffective.Ceffective.MecanismoSeguridad");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:430:4: (otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCeffective.g:431:5: otherlv_21= ',' ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) )
                    	    {
                    	    otherlv_21=(Token)match(input,19,FOLLOW_16); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getProveedorNubeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalCeffective.g:435:5: ( (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad ) )
                    	    // InternalCeffective.g:436:6: (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad )
                    	    {
                    	    // InternalCeffective.g:436:6: (lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad )
                    	    // InternalCeffective.g:437:7: lv_mecanismoseguridad_22_0= ruleMecanismoSeguridad
                    	    {

                    	    							newCompositeNode(grammarAccess.getProveedorNubeAccess().getMecanismoseguridadMecanismoSeguridadParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_mecanismoseguridad_22_0=ruleMecanismoSeguridad();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mecanismoseguridad",
                    	    								lv_mecanismoseguridad_22_0,
                    	    								"org.xtext.example.ceffective.Ceffective.MecanismoSeguridad");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_23, grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProveedorNube"


    // $ANTLR start "entryRuleEString"
    // InternalCeffective.g:468:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCeffective.g:468:47: (iv_ruleEString= ruleEString EOF )
            // InternalCeffective.g:469:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCeffective.g:475:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCeffective.g:481:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCeffective.g:482:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCeffective.g:482:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCeffective.g:483:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCeffective.g:491:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAutenticacionUsuario_Impl"
    // InternalCeffective.g:502:1: entryRuleAutenticacionUsuario_Impl returns [EObject current=null] : iv_ruleAutenticacionUsuario_Impl= ruleAutenticacionUsuario_Impl EOF ;
    public final EObject entryRuleAutenticacionUsuario_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutenticacionUsuario_Impl = null;


        try {
            // InternalCeffective.g:502:66: (iv_ruleAutenticacionUsuario_Impl= ruleAutenticacionUsuario_Impl EOF )
            // InternalCeffective.g:503:2: iv_ruleAutenticacionUsuario_Impl= ruleAutenticacionUsuario_Impl EOF
            {
             newCompositeNode(grammarAccess.getAutenticacionUsuario_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutenticacionUsuario_Impl=ruleAutenticacionUsuario_Impl();

            state._fsp--;

             current =iv_ruleAutenticacionUsuario_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutenticacionUsuario_Impl"


    // $ANTLR start "ruleAutenticacionUsuario_Impl"
    // InternalCeffective.g:509:1: ruleAutenticacionUsuario_Impl returns [EObject current=null] : ( () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAutenticacionUsuario_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_usuario_4_0 = null;

        AntlrDatatypeRuleToken lv_correo_6_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:515:2: ( ( () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalCeffective.g:516:2: ( () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalCeffective.g:516:2: ( () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalCeffective.g:517:3: () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalCeffective.g:517:3: ()
            // InternalCeffective.g:518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAutenticacionUsuario_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:532:3: (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCeffective.g:533:4: otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioKeyword_3_0());
                    			
                    // InternalCeffective.g:537:4: ( (lv_usuario_4_0= ruleEString ) )
                    // InternalCeffective.g:538:5: (lv_usuario_4_0= ruleEString )
                    {
                    // InternalCeffective.g:538:5: (lv_usuario_4_0= ruleEString )
                    // InternalCeffective.g:539:6: lv_usuario_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_usuario_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionUsuario_ImplRule());
                    						}
                    						set(
                    							current,
                    							"usuario",
                    							lv_usuario_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:557:3: (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCeffective.g:558:4: otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoKeyword_4_0());
                    			
                    // InternalCeffective.g:562:4: ( (lv_correo_6_0= ruleEString ) )
                    // InternalCeffective.g:563:5: (lv_correo_6_0= ruleEString )
                    {
                    // InternalCeffective.g:563:5: (lv_correo_6_0= ruleEString )
                    // InternalCeffective.g:564:6: lv_correo_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_correo_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionUsuario_ImplRule());
                    						}
                    						set(
                    							current,
                    							"correo",
                    							lv_correo_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAutenticacionUsuario_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutenticacionUsuario_Impl"


    // $ANTLR start "entryRuleAmbienteDespliegue"
    // InternalCeffective.g:590:1: entryRuleAmbienteDespliegue returns [EObject current=null] : iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF ;
    public final EObject entryRuleAmbienteDespliegue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmbienteDespliegue = null;


        try {
            // InternalCeffective.g:590:59: (iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF )
            // InternalCeffective.g:591:2: iv_ruleAmbienteDespliegue= ruleAmbienteDespliegue EOF
            {
             newCompositeNode(grammarAccess.getAmbienteDespliegueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmbienteDespliegue=ruleAmbienteDespliegue();

            state._fsp--;

             current =iv_ruleAmbienteDespliegue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmbienteDespliegue"


    // $ANTLR start "ruleAmbienteDespliegue"
    // InternalCeffective.g:597:1: ruleAmbienteDespliegue returns [EObject current=null] : ( () otherlv_1= 'AmbienteDespliegue' otherlv_2= '{' (otherlv_3= 'ambiente' ( (lv_ambiente_4_0= ruleTipoAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) ;
    public final EObject ruleAmbienteDespliegue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_ambiente_4_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:603:2: ( ( () otherlv_1= 'AmbienteDespliegue' otherlv_2= '{' (otherlv_3= 'ambiente' ( (lv_ambiente_4_0= ruleTipoAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' ) )
            // InternalCeffective.g:604:2: ( () otherlv_1= 'AmbienteDespliegue' otherlv_2= '{' (otherlv_3= 'ambiente' ( (lv_ambiente_4_0= ruleTipoAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            {
            // InternalCeffective.g:604:2: ( () otherlv_1= 'AmbienteDespliegue' otherlv_2= '{' (otherlv_3= 'ambiente' ( (lv_ambiente_4_0= ruleTipoAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}' )
            // InternalCeffective.g:605:3: () otherlv_1= 'AmbienteDespliegue' otherlv_2= '{' (otherlv_3= 'ambiente' ( (lv_ambiente_4_0= ruleTipoAmbiente ) ) )? (otherlv_5= 'recursos' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? otherlv_11= '}'
            {
            // InternalCeffective.g:605:3: ()
            // InternalCeffective.g:606:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAmbienteDespliegueAccess().getAmbienteDespliegueKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAmbienteDespliegueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:620:3: (otherlv_3= 'ambiente' ( (lv_ambiente_4_0= ruleTipoAmbiente ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCeffective.g:621:4: otherlv_3= 'ambiente' ( (lv_ambiente_4_0= ruleTipoAmbiente ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getAmbienteDespliegueAccess().getAmbienteKeyword_3_0());
                    			
                    // InternalCeffective.g:625:4: ( (lv_ambiente_4_0= ruleTipoAmbiente ) )
                    // InternalCeffective.g:626:5: (lv_ambiente_4_0= ruleTipoAmbiente )
                    {
                    // InternalCeffective.g:626:5: (lv_ambiente_4_0= ruleTipoAmbiente )
                    // InternalCeffective.g:627:6: lv_ambiente_4_0= ruleTipoAmbiente
                    {

                    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getAmbienteTipoAmbienteEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_ambiente_4_0=ruleTipoAmbiente();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmbienteDespliegueRule());
                    						}
                    						set(
                    							current,
                    							"ambiente",
                    							lv_ambiente_4_0,
                    							"org.xtext.example.ceffective.Ceffective.TipoAmbiente");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:645:3: (otherlv_5= 'recursos' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCeffective.g:646:4: otherlv_5= 'recursos' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getAmbienteDespliegueAccess().getRecursosKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getAmbienteDespliegueAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalCeffective.g:654:4: ( ( ruleEString ) )
                    // InternalCeffective.g:655:5: ( ruleEString )
                    {
                    // InternalCeffective.g:655:5: ( ruleEString )
                    // InternalCeffective.g:656:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAmbienteDespliegueRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:670:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==19) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalCeffective.g:671:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getAmbienteDespliegueAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCeffective.g:675:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:676:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:676:6: ( ruleEString )
                    	    // InternalCeffective.g:677:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAmbienteDespliegueRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAmbienteDespliegueAccess().getRecursosRecursoCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getAmbienteDespliegueAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAmbienteDespliegueAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmbienteDespliegue"


    // $ANTLR start "entryRuleAutenticacionBasica"
    // InternalCeffective.g:705:1: entryRuleAutenticacionBasica returns [EObject current=null] : iv_ruleAutenticacionBasica= ruleAutenticacionBasica EOF ;
    public final EObject entryRuleAutenticacionBasica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutenticacionBasica = null;


        try {
            // InternalCeffective.g:705:60: (iv_ruleAutenticacionBasica= ruleAutenticacionBasica EOF )
            // InternalCeffective.g:706:2: iv_ruleAutenticacionBasica= ruleAutenticacionBasica EOF
            {
             newCompositeNode(grammarAccess.getAutenticacionBasicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutenticacionBasica=ruleAutenticacionBasica();

            state._fsp--;

             current =iv_ruleAutenticacionBasica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutenticacionBasica"


    // $ANTLR start "ruleAutenticacionBasica"
    // InternalCeffective.g:712:1: ruleAutenticacionBasica returns [EObject current=null] : ( () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleAutenticacionBasica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_usuario_4_0 = null;

        AntlrDatatypeRuleToken lv_correo_6_0 = null;

        AntlrDatatypeRuleToken lv_password_8_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:718:2: ( ( () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalCeffective.g:719:2: ( () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalCeffective.g:719:2: ( () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalCeffective.g:720:3: () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalCeffective.g:720:3: ()
            // InternalCeffective.g:721:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getAutenticacionBasicaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:735:3: (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCeffective.g:736:4: otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutenticacionBasicaAccess().getUsuarioKeyword_3_0());
                    			
                    // InternalCeffective.g:740:4: ( (lv_usuario_4_0= ruleEString ) )
                    // InternalCeffective.g:741:5: (lv_usuario_4_0= ruleEString )
                    {
                    // InternalCeffective.g:741:5: (lv_usuario_4_0= ruleEString )
                    // InternalCeffective.g:742:6: lv_usuario_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionBasicaAccess().getUsuarioEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_usuario_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionBasicaRule());
                    						}
                    						set(
                    							current,
                    							"usuario",
                    							lv_usuario_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:760:3: (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCeffective.g:761:4: otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutenticacionBasicaAccess().getCorreoKeyword_4_0());
                    			
                    // InternalCeffective.g:765:4: ( (lv_correo_6_0= ruleEString ) )
                    // InternalCeffective.g:766:5: (lv_correo_6_0= ruleEString )
                    {
                    // InternalCeffective.g:766:5: (lv_correo_6_0= ruleEString )
                    // InternalCeffective.g:767:6: lv_correo_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionBasicaAccess().getCorreoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_correo_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionBasicaRule());
                    						}
                    						set(
                    							current,
                    							"correo",
                    							lv_correo_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:785:3: (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCeffective.g:786:4: otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAutenticacionBasicaAccess().getPasswordKeyword_5_0());
                    			
                    // InternalCeffective.g:790:4: ( (lv_password_8_0= ruleEString ) )
                    // InternalCeffective.g:791:5: (lv_password_8_0= ruleEString )
                    {
                    // InternalCeffective.g:791:5: (lv_password_8_0= ruleEString )
                    // InternalCeffective.g:792:6: lv_password_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionBasicaAccess().getPasswordEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_password_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionBasicaRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAutenticacionBasicaAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutenticacionBasica"


    // $ANTLR start "entryRuleAutenticacionFirma"
    // InternalCeffective.g:818:1: entryRuleAutenticacionFirma returns [EObject current=null] : iv_ruleAutenticacionFirma= ruleAutenticacionFirma EOF ;
    public final EObject entryRuleAutenticacionFirma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutenticacionFirma = null;


        try {
            // InternalCeffective.g:818:59: (iv_ruleAutenticacionFirma= ruleAutenticacionFirma EOF )
            // InternalCeffective.g:819:2: iv_ruleAutenticacionFirma= ruleAutenticacionFirma EOF
            {
             newCompositeNode(grammarAccess.getAutenticacionFirmaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutenticacionFirma=ruleAutenticacionFirma();

            state._fsp--;

             current =iv_ruleAutenticacionFirma; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutenticacionFirma"


    // $ANTLR start "ruleAutenticacionFirma"
    // InternalCeffective.g:825:1: ruleAutenticacionFirma returns [EObject current=null] : ( () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAutenticacionFirma() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_usuario_4_0 = null;

        AntlrDatatypeRuleToken lv_correo_6_0 = null;

        AntlrDatatypeRuleToken lv_nombre_8_0 = null;

        AntlrDatatypeRuleToken lv_certificado_10_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:831:2: ( ( () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalCeffective.g:832:2: ( () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalCeffective.g:832:2: ( () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalCeffective.g:833:3: () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalCeffective.g:833:3: ()
            // InternalCeffective.g:834:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getAutenticacionFirmaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:848:3: (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCeffective.g:849:4: otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutenticacionFirmaAccess().getUsuarioKeyword_3_0());
                    			
                    // InternalCeffective.g:853:4: ( (lv_usuario_4_0= ruleEString ) )
                    // InternalCeffective.g:854:5: (lv_usuario_4_0= ruleEString )
                    {
                    // InternalCeffective.g:854:5: (lv_usuario_4_0= ruleEString )
                    // InternalCeffective.g:855:6: lv_usuario_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionFirmaAccess().getUsuarioEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_usuario_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionFirmaRule());
                    						}
                    						set(
                    							current,
                    							"usuario",
                    							lv_usuario_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:873:3: (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCeffective.g:874:4: otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutenticacionFirmaAccess().getCorreoKeyword_4_0());
                    			
                    // InternalCeffective.g:878:4: ( (lv_correo_6_0= ruleEString ) )
                    // InternalCeffective.g:879:5: (lv_correo_6_0= ruleEString )
                    {
                    // InternalCeffective.g:879:5: (lv_correo_6_0= ruleEString )
                    // InternalCeffective.g:880:6: lv_correo_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionFirmaAccess().getCorreoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_correo_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionFirmaRule());
                    						}
                    						set(
                    							current,
                    							"correo",
                    							lv_correo_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:898:3: (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==16) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCeffective.g:899:4: otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAutenticacionFirmaAccess().getNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:903:4: ( (lv_nombre_8_0= ruleEString ) )
                    // InternalCeffective.g:904:5: (lv_nombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:904:5: (lv_nombre_8_0= ruleEString )
                    // InternalCeffective.g:905:6: lv_nombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionFirmaAccess().getNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_nombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionFirmaRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:923:3: (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCeffective.g:924:4: otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getAutenticacionFirmaAccess().getCertificadoKeyword_6_0());
                    			
                    // InternalCeffective.g:928:4: ( (lv_certificado_10_0= ruleEString ) )
                    // InternalCeffective.g:929:5: (lv_certificado_10_0= ruleEString )
                    {
                    // InternalCeffective.g:929:5: (lv_certificado_10_0= ruleEString )
                    // InternalCeffective.g:930:6: lv_certificado_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionFirmaAccess().getCertificadoEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_certificado_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionFirmaRule());
                    						}
                    						set(
                    							current,
                    							"certificado",
                    							lv_certificado_10_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAutenticacionFirmaAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutenticacionFirma"


    // $ANTLR start "entryRuleServidorAplicaciones"
    // InternalCeffective.g:956:1: entryRuleServidorAplicaciones returns [EObject current=null] : iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF ;
    public final EObject entryRuleServidorAplicaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorAplicaciones = null;


        try {
            // InternalCeffective.g:956:61: (iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF )
            // InternalCeffective.g:957:2: iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF
            {
             newCompositeNode(grammarAccess.getServidorAplicacionesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorAplicaciones=ruleServidorAplicaciones();

            state._fsp--;

             current =iv_ruleServidorAplicaciones; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorAplicaciones"


    // $ANTLR start "ruleServidorAplicaciones"
    // InternalCeffective.g:963:1: ruleServidorAplicaciones returns [EObject current=null] : ( () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleServidorAplicaciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_8_0 = null;

        Enumerator lv_tamano_10_0 = null;

        AntlrDatatypeRuleToken lv_sistemaOperativo_12_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:969:2: ( ( () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}' ) )
            // InternalCeffective.g:970:2: ( () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}' )
            {
            // InternalCeffective.g:970:2: ( () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}' )
            // InternalCeffective.g:971:3: () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}'
            {
            // InternalCeffective.g:971:3: ()
            // InternalCeffective.g:972:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:986:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCeffective.g:987:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:991:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:992:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:992:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:993:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1011:3: (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCeffective.g:1012:4: otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:1016:4: ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    // InternalCeffective.g:1017:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1017:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    // InternalCeffective.g:1018:6: lv_zonaDisponibilidad_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_zonaDisponibilidad_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1036:3: (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCeffective.g:1037:4: otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getServidorAplicacionesAccess().getZonaNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:1041:4: ( (lv_zonaNombre_8_0= ruleEString ) )
                    // InternalCeffective.g:1042:5: (lv_zonaNombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1042:5: (lv_zonaNombre_8_0= ruleEString )
                    // InternalCeffective.g:1043:6: lv_zonaNombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getZonaNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_zonaNombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1061:3: (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCeffective.g:1062:4: otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidorAplicacionesAccess().getTamanoKeyword_6_0());
                    			
                    // InternalCeffective.g:1066:4: ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    // InternalCeffective.g:1067:5: (lv_tamano_10_0= ruleTamanoServidor )
                    {
                    // InternalCeffective.g:1067:5: (lv_tamano_10_0= ruleTamanoServidor )
                    // InternalCeffective.g:1068:6: lv_tamano_10_0= ruleTamanoServidor
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_tamano_10_0=ruleTamanoServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"tamano",
                    							lv_tamano_10_0,
                    							"org.xtext.example.ceffective.Ceffective.TamanoServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1086:3: (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCeffective.g:1087:4: otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_7_0());
                    			
                    // InternalCeffective.g:1091:4: ( (lv_sistemaOperativo_12_0= ruleEString ) )
                    // InternalCeffective.g:1092:5: (lv_sistemaOperativo_12_0= ruleEString )
                    {
                    // InternalCeffective.g:1092:5: (lv_sistemaOperativo_12_0= ruleEString )
                    // InternalCeffective.g:1093:6: lv_sistemaOperativo_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_sistemaOperativo_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"sistemaOperativo",
                    							lv_sistemaOperativo_12_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1111:3: (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCeffective.g:1112:4: otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getServidorAplicacionesAccess().getRecursosKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalCeffective.g:1120:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1121:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1121:5: ( ruleEString )
                    // InternalCeffective.g:1122:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:1136:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==19) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalCeffective.g:1137:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCeffective.g:1141:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:1142:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:1142:6: ( ruleEString )
                    	    // InternalCeffective.g:1143:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,29,FOLLOW_38); 

                    				newLeafNode(otherlv_18, grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:1163:3: (otherlv_19= 'vpc' ( ( ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==17) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCeffective.g:1164:4: otherlv_19= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_9_0());
                    			
                    // InternalCeffective.g:1168:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1169:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1169:5: ( ruleEString )
                    // InternalCeffective.g:1170:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorAplicaciones"


    // $ANTLR start "entryRuleAlmacenamiento"
    // InternalCeffective.g:1193:1: entryRuleAlmacenamiento returns [EObject current=null] : iv_ruleAlmacenamiento= ruleAlmacenamiento EOF ;
    public final EObject entryRuleAlmacenamiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlmacenamiento = null;


        try {
            // InternalCeffective.g:1193:55: (iv_ruleAlmacenamiento= ruleAlmacenamiento EOF )
            // InternalCeffective.g:1194:2: iv_ruleAlmacenamiento= ruleAlmacenamiento EOF
            {
             newCompositeNode(grammarAccess.getAlmacenamientoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlmacenamiento=ruleAlmacenamiento();

            state._fsp--;

             current =iv_ruleAlmacenamiento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlmacenamiento"


    // $ANTLR start "ruleAlmacenamiento"
    // InternalCeffective.g:1200:1: ruleAlmacenamiento returns [EObject current=null] : ( () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleAlmacenamiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_8_0 = null;

        AntlrDatatypeRuleToken lv_tamanoInicial_10_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1206:2: ( ( () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' ) )
            // InternalCeffective.g:1207:2: ( () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' )
            {
            // InternalCeffective.g:1207:2: ( () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' )
            // InternalCeffective.g:1208:3: () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}'
            {
            // InternalCeffective.g:1208:3: ()
            // InternalCeffective.g:1209:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlmacenamientoAccess().getAlmacenamientoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAlmacenamientoAccess().getAlmacenamientoKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getAlmacenamientoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1223:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCeffective.g:1224:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlmacenamientoAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:1228:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:1229:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1229:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:1230:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1248:3: (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCeffective.g:1249:4: otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:1253:4: ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    // InternalCeffective.g:1254:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1254:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    // InternalCeffective.g:1255:6: lv_zonaDisponibilidad_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_zonaDisponibilidad_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1273:3: (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCeffective.g:1274:4: otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlmacenamientoAccess().getZonaNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:1278:4: ( (lv_zonaNombre_8_0= ruleEString ) )
                    // InternalCeffective.g:1279:5: (lv_zonaNombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1279:5: (lv_zonaNombre_8_0= ruleEString )
                    // InternalCeffective.g:1280:6: lv_zonaNombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getZonaNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_zonaNombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1298:3: (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCeffective.g:1299:4: otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_43); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlmacenamientoAccess().getTamanoInicialKeyword_6_0());
                    			
                    // InternalCeffective.g:1303:4: ( (lv_tamanoInicial_10_0= ruleEInt ) )
                    // InternalCeffective.g:1304:5: (lv_tamanoInicial_10_0= ruleEInt )
                    {
                    // InternalCeffective.g:1304:5: (lv_tamanoInicial_10_0= ruleEInt )
                    // InternalCeffective.g:1305:6: lv_tamanoInicial_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getTamanoInicialEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_tamanoInicial_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"tamanoInicial",
                    							lv_tamanoInicial_10_0,
                    							"org.xtext.example.ceffective.Ceffective.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1323:3: (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCeffective.g:1324:4: otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getAlmacenamientoAccess().getRecursosKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getAlmacenamientoAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalCeffective.g:1332:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1333:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1333:5: ( ruleEString )
                    // InternalCeffective.g:1334:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlmacenamientoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:1348:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==19) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalCeffective.g:1349:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAlmacenamientoAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCeffective.g:1353:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:1354:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:1354:6: ( ruleEString )
                    	    // InternalCeffective.g:1355:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAlmacenamientoRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,29,FOLLOW_38); 

                    				newLeafNode(otherlv_16, grammarAccess.getAlmacenamientoAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:1375:3: (otherlv_17= 'vpc' ( ( ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCeffective.g:1376:4: otherlv_17= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getAlmacenamientoAccess().getVpcKeyword_8_0());
                    			
                    // InternalCeffective.g:1380:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1381:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1381:5: ( ruleEString )
                    // InternalCeffective.g:1382:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlmacenamientoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getVpcVPCCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAlmacenamientoAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlmacenamiento"


    // $ANTLR start "entryRuleServidorBD"
    // InternalCeffective.g:1405:1: entryRuleServidorBD returns [EObject current=null] : iv_ruleServidorBD= ruleServidorBD EOF ;
    public final EObject entryRuleServidorBD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorBD = null;


        try {
            // InternalCeffective.g:1405:51: (iv_ruleServidorBD= ruleServidorBD EOF )
            // InternalCeffective.g:1406:2: iv_ruleServidorBD= ruleServidorBD EOF
            {
             newCompositeNode(grammarAccess.getServidorBDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorBD=ruleServidorBD();

            state._fsp--;

             current =iv_ruleServidorBD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorBD"


    // $ANTLR start "ruleServidorBD"
    // InternalCeffective.g:1412:1: ruleServidorBD returns [EObject current=null] : ( () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}' ) ;
    public final EObject ruleServidorBD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_8_0 = null;

        Enumerator lv_tamano_10_0 = null;

        Enumerator lv_tipo_12_0 = null;

        AntlrDatatypeRuleToken lv_sistemaManejador_14_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1418:2: ( ( () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}' ) )
            // InternalCeffective.g:1419:2: ( () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}' )
            {
            // InternalCeffective.g:1419:2: ( () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}' )
            // InternalCeffective.g:1420:3: () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}'
            {
            // InternalCeffective.g:1420:3: ()
            // InternalCeffective.g:1421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidorBDAccess().getServidorBDAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServidorBDAccess().getServidorBDKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getServidorBDAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1435:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCeffective.g:1436:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getServidorBDAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:1440:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:1441:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1441:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:1442:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1460:3: (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCeffective.g:1461:4: otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getServidorBDAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:1465:4: ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    // InternalCeffective.g:1466:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1466:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    // InternalCeffective.g:1467:6: lv_zonaDisponibilidad_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_zonaDisponibilidad_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1485:3: (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCeffective.g:1486:4: otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getServidorBDAccess().getZonaNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:1490:4: ( (lv_zonaNombre_8_0= ruleEString ) )
                    // InternalCeffective.g:1491:5: (lv_zonaNombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1491:5: (lv_zonaNombre_8_0= ruleEString )
                    // InternalCeffective.g:1492:6: lv_zonaNombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getZonaNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_zonaNombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1510:3: (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCeffective.g:1511:4: otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidorBDAccess().getTamanoKeyword_6_0());
                    			
                    // InternalCeffective.g:1515:4: ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    // InternalCeffective.g:1516:5: (lv_tamano_10_0= ruleTamanoServidor )
                    {
                    // InternalCeffective.g:1516:5: (lv_tamano_10_0= ruleTamanoServidor )
                    // InternalCeffective.g:1517:6: lv_tamano_10_0= ruleTamanoServidor
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_tamano_10_0=ruleTamanoServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"tamano",
                    							lv_tamano_10_0,
                    							"org.xtext.example.ceffective.Ceffective.TamanoServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1535:3: (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCeffective.g:1536:4: otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) )
                    {
                    otherlv_11=(Token)match(input,42,FOLLOW_49); 

                    				newLeafNode(otherlv_11, grammarAccess.getServidorBDAccess().getTipoKeyword_7_0());
                    			
                    // InternalCeffective.g:1540:4: ( (lv_tipo_12_0= ruleTipoBaseDatos ) )
                    // InternalCeffective.g:1541:5: (lv_tipo_12_0= ruleTipoBaseDatos )
                    {
                    // InternalCeffective.g:1541:5: (lv_tipo_12_0= ruleTipoBaseDatos )
                    // InternalCeffective.g:1542:6: lv_tipo_12_0= ruleTipoBaseDatos
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getTipoTipoBaseDatosEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_tipo_12_0=ruleTipoBaseDatos();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"tipo",
                    							lv_tipo_12_0,
                    							"org.xtext.example.ceffective.Ceffective.TipoBaseDatos");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1560:3: (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCeffective.g:1561:4: otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,43,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getServidorBDAccess().getSistemaManejadorKeyword_8_0());
                    			
                    // InternalCeffective.g:1565:4: ( (lv_sistemaManejador_14_0= ruleEString ) )
                    // InternalCeffective.g:1566:5: (lv_sistemaManejador_14_0= ruleEString )
                    {
                    // InternalCeffective.g:1566:5: (lv_sistemaManejador_14_0= ruleEString )
                    // InternalCeffective.g:1567:6: lv_sistemaManejador_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getSistemaManejadorEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_sistemaManejador_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"sistemaManejador",
                    							lv_sistemaManejador_14_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1585:3: (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==27) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCeffective.g:1586:4: otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_15, grammarAccess.getServidorBDAccess().getRecursosKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getServidorBDAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalCeffective.g:1594:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1595:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1595:5: ( ruleEString )
                    // InternalCeffective.g:1596:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorBDRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:1610:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==19) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalCeffective.g:1611:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getServidorBDAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCeffective.g:1615:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:1616:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:1616:6: ( ruleEString )
                    	    // InternalCeffective.g:1617:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidorBDRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,29,FOLLOW_38); 

                    				newLeafNode(otherlv_20, grammarAccess.getServidorBDAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:1637:3: (otherlv_21= 'vpc' ( ( ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==17) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCeffective.g:1638:4: otherlv_21= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getServidorBDAccess().getVpcKeyword_10_0());
                    			
                    // InternalCeffective.g:1642:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1643:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1643:5: ( ruleEString )
                    // InternalCeffective.g:1644:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorBDRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getVpcVPCCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getServidorBDAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorBD"


    // $ANTLR start "entryRuleServidor_Impl"
    // InternalCeffective.g:1667:1: entryRuleServidor_Impl returns [EObject current=null] : iv_ruleServidor_Impl= ruleServidor_Impl EOF ;
    public final EObject entryRuleServidor_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidor_Impl = null;


        try {
            // InternalCeffective.g:1667:54: (iv_ruleServidor_Impl= ruleServidor_Impl EOF )
            // InternalCeffective.g:1668:2: iv_ruleServidor_Impl= ruleServidor_Impl EOF
            {
             newCompositeNode(grammarAccess.getServidor_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidor_Impl=ruleServidor_Impl();

            state._fsp--;

             current =iv_ruleServidor_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidor_Impl"


    // $ANTLR start "ruleServidor_Impl"
    // InternalCeffective.g:1674:1: ruleServidor_Impl returns [EObject current=null] : ( () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleServidor_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_8_0 = null;

        Enumerator lv_tamano_10_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1680:2: ( ( () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' ) )
            // InternalCeffective.g:1681:2: ( () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' )
            {
            // InternalCeffective.g:1681:2: ( () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' )
            // InternalCeffective.g:1682:3: () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}'
            {
            // InternalCeffective.g:1682:3: ()
            // InternalCeffective.g:1683:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidor_ImplAccess().getServidorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServidor_ImplAccess().getServidorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getServidor_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1697:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCeffective.g:1698:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getServidor_ImplAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:1702:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:1703:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1703:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:1704:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1722:3: (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCeffective.g:1723:4: otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:1727:4: ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    // InternalCeffective.g:1728:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1728:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    // InternalCeffective.g:1729:6: lv_zonaDisponibilidad_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_zonaDisponibilidad_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1747:3: (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCeffective.g:1748:4: otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getServidor_ImplAccess().getZonaNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:1752:4: ( (lv_zonaNombre_8_0= ruleEString ) )
                    // InternalCeffective.g:1753:5: (lv_zonaNombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1753:5: (lv_zonaNombre_8_0= ruleEString )
                    // InternalCeffective.g:1754:6: lv_zonaNombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getZonaNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_zonaNombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1772:3: (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCeffective.g:1773:4: otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_35); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidor_ImplAccess().getTamanoKeyword_6_0());
                    			
                    // InternalCeffective.g:1777:4: ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    // InternalCeffective.g:1778:5: (lv_tamano_10_0= ruleTamanoServidor )
                    {
                    // InternalCeffective.g:1778:5: (lv_tamano_10_0= ruleTamanoServidor )
                    // InternalCeffective.g:1779:6: lv_tamano_10_0= ruleTamanoServidor
                    {

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_tamano_10_0=ruleTamanoServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"tamano",
                    							lv_tamano_10_0,
                    							"org.xtext.example.ceffective.Ceffective.TamanoServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1797:3: (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCeffective.g:1798:4: otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_11, grammarAccess.getServidor_ImplAccess().getRecursosKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getServidor_ImplAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalCeffective.g:1806:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1807:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1807:5: ( ruleEString )
                    // InternalCeffective.g:1808:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidor_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:1822:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==19) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalCeffective.g:1823:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getServidor_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCeffective.g:1827:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:1828:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:1828:6: ( ruleEString )
                    	    // InternalCeffective.g:1829:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidor_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,29,FOLLOW_38); 

                    				newLeafNode(otherlv_16, grammarAccess.getServidor_ImplAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:1849:3: (otherlv_17= 'vpc' ( ( ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==17) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCeffective.g:1850:4: otherlv_17= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getServidor_ImplAccess().getVpcKeyword_8_0());
                    			
                    // InternalCeffective.g:1854:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1855:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1855:5: ( ruleEString )
                    // InternalCeffective.g:1856:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidor_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getVpcVPCCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getServidor_ImplAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidor_Impl"


    // $ANTLR start "entryRuleEInt"
    // InternalCeffective.g:1879:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCeffective.g:1879:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCeffective.g:1880:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCeffective.g:1886:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCeffective.g:1892:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCeffective.g:1893:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCeffective.g:1893:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCeffective.g:1894:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCeffective.g:1894:3: (kw= '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==45) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCeffective.g:1895:4: kw= '-'
                    {
                    kw=(Token)match(input,45,FOLLOW_55); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSubred"
    // InternalCeffective.g:1912:1: entryRuleSubred returns [EObject current=null] : iv_ruleSubred= ruleSubred EOF ;
    public final EObject entryRuleSubred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubred = null;


        try {
            // InternalCeffective.g:1912:47: (iv_ruleSubred= ruleSubred EOF )
            // InternalCeffective.g:1913:2: iv_ruleSubred= ruleSubred EOF
            {
             newCompositeNode(grammarAccess.getSubredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubred=ruleSubred();

            state._fsp--;

             current =iv_ruleSubred; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubred"


    // $ANTLR start "ruleSubred"
    // InternalCeffective.g:1919:1: ruleSubred returns [EObject current=null] : ( () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? (otherlv_11= 'vpc' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleSubred() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_8_0 = null;

        AntlrDatatypeRuleToken lv_cidrBlock_10_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1925:2: ( ( () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? (otherlv_11= 'vpc' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalCeffective.g:1926:2: ( () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? (otherlv_11= 'vpc' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalCeffective.g:1926:2: ( () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? (otherlv_11= 'vpc' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // InternalCeffective.g:1927:3: () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? (otherlv_11= 'vpc' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalCeffective.g:1927:3: ()
            // InternalCeffective.g:1928:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubredAccess().getSubredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubredAccess().getSubredKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1942:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==16) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCeffective.g:1943:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubredAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:1947:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:1948:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1948:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:1949:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1967:3: (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCeffective.g:1968:4: otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubredAccess().getZonaNombreKeyword_4_0());
                    			
                    // InternalCeffective.g:1972:4: ( (lv_zonaNombre_6_0= ruleEString ) )
                    // InternalCeffective.g:1973:5: (lv_zonaNombre_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1973:5: (lv_zonaNombre_6_0= ruleEString )
                    // InternalCeffective.g:1974:6: lv_zonaNombre_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getZonaNombreEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_zonaNombre_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1992:3: (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==35) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCeffective.g:1993:4: otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_5_0());
                    			
                    // InternalCeffective.g:1997:4: ( (lv_zonaDisponibilidad_8_0= ruleEString ) )
                    // InternalCeffective.g:1998:5: (lv_zonaDisponibilidad_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1998:5: (lv_zonaDisponibilidad_8_0= ruleEString )
                    // InternalCeffective.g:1999:6: lv_zonaDisponibilidad_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_zonaDisponibilidad_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2017:3: (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCeffective.g:2018:4: otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,47,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubredAccess().getCidrBlockKeyword_6_0());
                    			
                    // InternalCeffective.g:2022:4: ( (lv_cidrBlock_10_0= ruleEString ) )
                    // InternalCeffective.g:2023:5: (lv_cidrBlock_10_0= ruleEString )
                    {
                    // InternalCeffective.g:2023:5: (lv_cidrBlock_10_0= ruleEString )
                    // InternalCeffective.g:2024:6: lv_cidrBlock_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getCidrBlockEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_cidrBlock_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"cidrBlock",
                    							lv_cidrBlock_10_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2042:3: (otherlv_11= 'vpc' ( ( ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==17) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCeffective.g:2043:4: otherlv_11= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getSubredAccess().getVpcKeyword_7_0());
                    			
                    // InternalCeffective.g:2047:4: ( ( ruleEString ) )
                    // InternalCeffective.g:2048:5: ( ruleEString )
                    {
                    // InternalCeffective.g:2048:5: ( ruleEString )
                    // InternalCeffective.g:2049:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubredRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubredAccess().getVpcVPCCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubred"


    // $ANTLR start "entryRuleInternetGateway"
    // InternalCeffective.g:2072:1: entryRuleInternetGateway returns [EObject current=null] : iv_ruleInternetGateway= ruleInternetGateway EOF ;
    public final EObject entryRuleInternetGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternetGateway = null;


        try {
            // InternalCeffective.g:2072:56: (iv_ruleInternetGateway= ruleInternetGateway EOF )
            // InternalCeffective.g:2073:2: iv_ruleInternetGateway= ruleInternetGateway EOF
            {
             newCompositeNode(grammarAccess.getInternetGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternetGateway=ruleInternetGateway();

            state._fsp--;

             current =iv_ruleInternetGateway; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternetGateway"


    // $ANTLR start "ruleInternetGateway"
    // InternalCeffective.g:2079:1: ruleInternetGateway returns [EObject current=null] : ( () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'vpc' ( ( ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleInternetGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_8_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:2085:2: ( ( () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'vpc' ( ( ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalCeffective.g:2086:2: ( () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'vpc' ( ( ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalCeffective.g:2086:2: ( () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'vpc' ( ( ruleEString ) ) )? otherlv_11= '}' )
            // InternalCeffective.g:2087:3: () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'vpc' ( ( ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalCeffective.g:2087:3: ()
            // InternalCeffective.g:2088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternetGatewayAccess().getInternetGatewayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:2102:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==16) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCeffective.g:2103:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getInternetGatewayAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:2107:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:2108:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:2108:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:2109:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternetGatewayRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2127:3: (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==36) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCeffective.g:2128:4: otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getInternetGatewayAccess().getZonaNombreKeyword_4_0());
                    			
                    // InternalCeffective.g:2132:4: ( (lv_zonaNombre_6_0= ruleEString ) )
                    // InternalCeffective.g:2133:5: (lv_zonaNombre_6_0= ruleEString )
                    {
                    // InternalCeffective.g:2133:5: (lv_zonaNombre_6_0= ruleEString )
                    // InternalCeffective.g:2134:6: lv_zonaNombre_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getZonaNombreEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_zonaNombre_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternetGatewayRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2152:3: (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==35) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCeffective.g:2153:4: otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadKeyword_5_0());
                    			
                    // InternalCeffective.g:2157:4: ( (lv_zonaDisponibilidad_8_0= ruleEString ) )
                    // InternalCeffective.g:2158:5: (lv_zonaDisponibilidad_8_0= ruleEString )
                    {
                    // InternalCeffective.g:2158:5: (lv_zonaDisponibilidad_8_0= ruleEString )
                    // InternalCeffective.g:2159:6: lv_zonaDisponibilidad_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_zonaDisponibilidad_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternetGatewayRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2177:3: (otherlv_9= 'vpc' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==17) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCeffective.g:2178:4: otherlv_9= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getInternetGatewayAccess().getVpcKeyword_6_0());
                    			
                    // InternalCeffective.g:2182:4: ( ( ruleEString ) )
                    // InternalCeffective.g:2183:5: ( ruleEString )
                    {
                    // InternalCeffective.g:2183:5: ( ruleEString )
                    // InternalCeffective.g:2184:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInternetGatewayRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getVpcVPCCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternetGateway"


    // $ANTLR start "entryRuleGrupoSeguridad"
    // InternalCeffective.g:2207:1: entryRuleGrupoSeguridad returns [EObject current=null] : iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF ;
    public final EObject entryRuleGrupoSeguridad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrupoSeguridad = null;


        try {
            // InternalCeffective.g:2207:55: (iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF )
            // InternalCeffective.g:2208:2: iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF
            {
             newCompositeNode(grammarAccess.getGrupoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrupoSeguridad=ruleGrupoSeguridad();

            state._fsp--;

             current =iv_ruleGrupoSeguridad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrupoSeguridad"


    // $ANTLR start "ruleGrupoSeguridad"
    // InternalCeffective.g:2214:1: ruleGrupoSeguridad returns [EObject current=null] : (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? (otherlv_10= 'vpc' ( ( ruleEString ) ) )? otherlv_12= 'reglasSalida' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= 'reglasEntrada' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' otherlv_24= '}' ) ;
    public final EObject ruleGrupoSeguridad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_5_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_7_0 = null;

        AntlrDatatypeRuleToken lv_descripcion_9_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:2220:2: ( (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? (otherlv_10= 'vpc' ( ( ruleEString ) ) )? otherlv_12= 'reglasSalida' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= 'reglasEntrada' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' otherlv_24= '}' ) )
            // InternalCeffective.g:2221:2: (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? (otherlv_10= 'vpc' ( ( ruleEString ) ) )? otherlv_12= 'reglasSalida' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= 'reglasEntrada' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' otherlv_24= '}' )
            {
            // InternalCeffective.g:2221:2: (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? (otherlv_10= 'vpc' ( ( ruleEString ) ) )? otherlv_12= 'reglasSalida' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= 'reglasEntrada' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' otherlv_24= '}' )
            // InternalCeffective.g:2222:3: otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? (otherlv_10= 'vpc' ( ( ruleEString ) ) )? otherlv_12= 'reglasSalida' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= 'reglasEntrada' otherlv_19= '(' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ')' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_1, grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCeffective.g:2230:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==16) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalCeffective.g:2231:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0());
                    			
                    // InternalCeffective.g:2235:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalCeffective.g:2236:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalCeffective.g:2236:5: (lv_nombre_3_0= ruleEString )
                    // InternalCeffective.g:2237:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2255:3: (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==36) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalCeffective.g:2256:4: otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getGrupoSeguridadAccess().getZonaNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:2260:4: ( (lv_zonaNombre_5_0= ruleEString ) )
                    // InternalCeffective.g:2261:5: (lv_zonaNombre_5_0= ruleEString )
                    {
                    // InternalCeffective.g:2261:5: (lv_zonaNombre_5_0= ruleEString )
                    // InternalCeffective.g:2262:6: lv_zonaNombre_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getZonaNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_zonaNombre_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_5_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2280:3: (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==35) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalCeffective.g:2281:4: otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:2285:4: ( (lv_zonaDisponibilidad_7_0= ruleEString ) )
                    // InternalCeffective.g:2286:5: (lv_zonaDisponibilidad_7_0= ruleEString )
                    {
                    // InternalCeffective.g:2286:5: (lv_zonaDisponibilidad_7_0= ruleEString )
                    // InternalCeffective.g:2287:6: lv_zonaDisponibilidad_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_zonaDisponibilidad_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_7_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2305:3: (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==50) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalCeffective.g:2306:4: otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_5_0());
                    			
                    // InternalCeffective.g:2310:4: ( (lv_descripcion_9_0= ruleEString ) )
                    // InternalCeffective.g:2311:5: (lv_descripcion_9_0= ruleEString )
                    {
                    // InternalCeffective.g:2311:5: (lv_descripcion_9_0= ruleEString )
                    // InternalCeffective.g:2312:6: lv_descripcion_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_descripcion_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"descripcion",
                    							lv_descripcion_9_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2330:3: (otherlv_10= 'vpc' ( ( ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==17) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalCeffective.g:2331:4: otherlv_10= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getGrupoSeguridadAccess().getVpcKeyword_6_0());
                    			
                    // InternalCeffective.g:2335:4: ( ( ruleEString ) )
                    // InternalCeffective.g:2336:5: ( ruleEString )
                    {
                    // InternalCeffective.g:2336:5: ( ruleEString )
                    // InternalCeffective.g:2337:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGrupoSeguridadRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getVpcVPCCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,51,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_7());
            		
            otherlv_13=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_8());
            		
            // InternalCeffective.g:2360:3: ( ( ruleEString ) )
            // InternalCeffective.g:2361:4: ( ruleEString )
            {
            // InternalCeffective.g:2361:4: ( ruleEString )
            // InternalCeffective.g:2362:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_9_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCeffective.g:2376:3: (otherlv_15= ',' ( ( ruleEString ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==19) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalCeffective.g:2377:4: otherlv_15= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_15, grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalCeffective.g:2381:4: ( ( ruleEString ) )
            	    // InternalCeffective.g:2382:5: ( ruleEString )
            	    {
            	    // InternalCeffective.g:2382:5: ( ruleEString )
            	    // InternalCeffective.g:2383:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_10_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            otherlv_17=(Token)match(input,29,FOLLOW_69); 

            			newLeafNode(otherlv_17, grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_11());
            		
            otherlv_18=(Token)match(input,52,FOLLOW_22); 

            			newLeafNode(otherlv_18, grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_12());
            		
            otherlv_19=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_19, grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_13());
            		
            // InternalCeffective.g:2410:3: ( ( ruleEString ) )
            // InternalCeffective.g:2411:4: ( ruleEString )
            {
            // InternalCeffective.g:2411:4: ( ruleEString )
            // InternalCeffective.g:2412:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_14_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCeffective.g:2426:3: (otherlv_21= ',' ( ( ruleEString ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==19) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalCeffective.g:2427:4: otherlv_21= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_21=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_21, grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalCeffective.g:2431:4: ( ( ruleEString ) )
            	    // InternalCeffective.g:2432:5: ( ruleEString )
            	    {
            	    // InternalCeffective.g:2432:5: ( ruleEString )
            	    // InternalCeffective.g:2433:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_15_1_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_23=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_23, grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_16());
            		
            otherlv_24=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrupoSeguridad"


    // $ANTLR start "ruleTipoAmbiente"
    // InternalCeffective.g:2460:1: ruleTipoAmbiente returns [Enumerator current=null] : ( (enumLiteral_0= 'IST' ) | (enumLiteral_1= 'QA' ) | (enumLiteral_2= 'NFT' ) | (enumLiteral_3= 'PRD' ) ) ;
    public final Enumerator ruleTipoAmbiente() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCeffective.g:2466:2: ( ( (enumLiteral_0= 'IST' ) | (enumLiteral_1= 'QA' ) | (enumLiteral_2= 'NFT' ) | (enumLiteral_3= 'PRD' ) ) )
            // InternalCeffective.g:2467:2: ( (enumLiteral_0= 'IST' ) | (enumLiteral_1= 'QA' ) | (enumLiteral_2= 'NFT' ) | (enumLiteral_3= 'PRD' ) )
            {
            // InternalCeffective.g:2467:2: ( (enumLiteral_0= 'IST' ) | (enumLiteral_1= 'QA' ) | (enumLiteral_2= 'NFT' ) | (enumLiteral_3= 'PRD' ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt72=1;
                }
                break;
            case 54:
                {
                alt72=2;
                }
                break;
            case 55:
                {
                alt72=3;
                }
                break;
            case 56:
                {
                alt72=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalCeffective.g:2468:3: (enumLiteral_0= 'IST' )
                    {
                    // InternalCeffective.g:2468:3: (enumLiteral_0= 'IST' )
                    // InternalCeffective.g:2469:4: enumLiteral_0= 'IST'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTipoAmbienteAccess().getISTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAmbienteAccess().getISTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:2476:3: (enumLiteral_1= 'QA' )
                    {
                    // InternalCeffective.g:2476:3: (enumLiteral_1= 'QA' )
                    // InternalCeffective.g:2477:4: enumLiteral_1= 'QA'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTipoAmbienteAccess().getQAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoAmbienteAccess().getQAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:2484:3: (enumLiteral_2= 'NFT' )
                    {
                    // InternalCeffective.g:2484:3: (enumLiteral_2= 'NFT' )
                    // InternalCeffective.g:2485:4: enumLiteral_2= 'NFT'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTipoAmbienteAccess().getNFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoAmbienteAccess().getNFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCeffective.g:2492:3: (enumLiteral_3= 'PRD' )
                    {
                    // InternalCeffective.g:2492:3: (enumLiteral_3= 'PRD' )
                    // InternalCeffective.g:2493:4: enumLiteral_3= 'PRD'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTipoAmbienteAccess().getPRDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoAmbienteAccess().getPRDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoAmbiente"


    // $ANTLR start "ruleTamanoServidor"
    // InternalCeffective.g:2503:1: ruleTamanoServidor returns [Enumerator current=null] : ( (enumLiteral_0= 'Micro' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Large' ) ) ;
    public final Enumerator ruleTamanoServidor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCeffective.g:2509:2: ( ( (enumLiteral_0= 'Micro' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Large' ) ) )
            // InternalCeffective.g:2510:2: ( (enumLiteral_0= 'Micro' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Large' ) )
            {
            // InternalCeffective.g:2510:2: ( (enumLiteral_0= 'Micro' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Large' ) )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt73=1;
                }
                break;
            case 58:
                {
                alt73=2;
                }
                break;
            case 59:
                {
                alt73=3;
                }
                break;
            case 60:
                {
                alt73=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalCeffective.g:2511:3: (enumLiteral_0= 'Micro' )
                    {
                    // InternalCeffective.g:2511:3: (enumLiteral_0= 'Micro' )
                    // InternalCeffective.g:2512:4: enumLiteral_0= 'Micro'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTamanoServidorAccess().getMicroEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTamanoServidorAccess().getMicroEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:2519:3: (enumLiteral_1= 'Small' )
                    {
                    // InternalCeffective.g:2519:3: (enumLiteral_1= 'Small' )
                    // InternalCeffective.g:2520:4: enumLiteral_1= 'Small'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTamanoServidorAccess().getSmallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTamanoServidorAccess().getSmallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:2527:3: (enumLiteral_2= 'Medium' )
                    {
                    // InternalCeffective.g:2527:3: (enumLiteral_2= 'Medium' )
                    // InternalCeffective.g:2528:4: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTamanoServidorAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTamanoServidorAccess().getMediumEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCeffective.g:2535:3: (enumLiteral_3= 'Large' )
                    {
                    // InternalCeffective.g:2535:3: (enumLiteral_3= 'Large' )
                    // InternalCeffective.g:2536:4: enumLiteral_3= 'Large'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getTamanoServidorAccess().getLargeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTamanoServidorAccess().getLargeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTamanoServidor"


    // $ANTLR start "ruleTipoBaseDatos"
    // InternalCeffective.g:2546:1: ruleTipoBaseDatos returns [Enumerator current=null] : ( (enumLiteral_0= 'Relacional' ) | (enumLiteral_1= 'NoSql' ) ) ;
    public final Enumerator ruleTipoBaseDatos() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCeffective.g:2552:2: ( ( (enumLiteral_0= 'Relacional' ) | (enumLiteral_1= 'NoSql' ) ) )
            // InternalCeffective.g:2553:2: ( (enumLiteral_0= 'Relacional' ) | (enumLiteral_1= 'NoSql' ) )
            {
            // InternalCeffective.g:2553:2: ( (enumLiteral_0= 'Relacional' ) | (enumLiteral_1= 'NoSql' ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==61) ) {
                alt74=1;
            }
            else if ( (LA74_0==62) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalCeffective.g:2554:3: (enumLiteral_0= 'Relacional' )
                    {
                    // InternalCeffective.g:2554:3: (enumLiteral_0= 'Relacional' )
                    // InternalCeffective.g:2555:4: enumLiteral_0= 'Relacional'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTipoBaseDatosAccess().getRelacionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoBaseDatosAccess().getRelacionalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:2562:3: (enumLiteral_1= 'NoSql' )
                    {
                    // InternalCeffective.g:2562:3: (enumLiteral_1= 'NoSql' )
                    // InternalCeffective.g:2563:4: enumLiteral_1= 'NoSql'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTipoBaseDatosAccess().getNoSqlEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoBaseDatosAccess().getNoSqlEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoBaseDatos"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000140400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0003400000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001804000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000081804000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000081004000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000201814000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000201014000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200014000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007808034000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000007808024000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000007008024000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006008024000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004008024000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000008024000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000011808034000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000011808024000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000011008024000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010008024000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000C3808034000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000C3808024000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000C3008024000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000C2008024000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000C0008024000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000080008024000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000003808034000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000003808024000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000003008024000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000002008024000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000801800034000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000801800024000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800800024000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000800000024000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000001800034000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000001800024000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000800024000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x000C001800030000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x000C001800020000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x000C000800020000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x000C000000020000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0010000000000000L});

}