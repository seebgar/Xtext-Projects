package org.xtext.example.ceffective.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCeffectiveLexer extends Lexer {
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

    public InternalCeffectiveLexer() {;} 
    public InternalCeffectiveLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCeffectiveLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCeffective.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:11:7: ( 'Ceffective' )
            // InternalCeffective.g:11:9: 'Ceffective'
            {
            match("Ceffective"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:12:7: ( '{' )
            // InternalCeffective.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:13:7: ( 'proveedorNube' )
            // InternalCeffective.g:13:9: 'proveedorNube'
            {
            match("proveedorNube"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:14:7: ( '}' )
            // InternalCeffective.g:14:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:15:7: ( 'ProveedorNube' )
            // InternalCeffective.g:15:9: 'ProveedorNube'
            {
            match("ProveedorNube"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:16:7: ( 'nombre' )
            // InternalCeffective.g:16:9: 'nombre'
            {
            match("nombre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:17:7: ( 'vpc' )
            // InternalCeffective.g:17:9: 'vpc'
            {
            match("vpc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:18:7: ( 'autenticacionUsuario' )
            // InternalCeffective.g:18:9: 'autenticacionUsuario'
            {
            match("autenticacionUsuario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:19:7: ( ',' )
            // InternalCeffective.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:20:7: ( 'ambientedespliegue' )
            // InternalCeffective.g:20:9: 'ambientedespliegue'
            {
            match("ambientedespliegue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:21:7: ( 'mecanismoseguridad' )
            // InternalCeffective.g:21:9: 'mecanismoseguridad'
            {
            match("mecanismoseguridad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:22:7: ( 'AutenticacionUsuario' )
            // InternalCeffective.g:22:9: 'AutenticacionUsuario'
            {
            match("AutenticacionUsuario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:23:7: ( 'usuario' )
            // InternalCeffective.g:23:9: 'usuario'
            {
            match("usuario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:24:7: ( 'correo' )
            // InternalCeffective.g:24:9: 'correo'
            {
            match("correo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:25:7: ( 'AmbienteDespliegue' )
            // InternalCeffective.g:25:9: 'AmbienteDespliegue'
            {
            match("AmbienteDespliegue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:26:7: ( 'ambiente' )
            // InternalCeffective.g:26:9: 'ambiente'
            {
            match("ambiente"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:27:7: ( 'recursos' )
            // InternalCeffective.g:27:9: 'recursos'
            {
            match("recursos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:28:7: ( '(' )
            // InternalCeffective.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:29:7: ( ')' )
            // InternalCeffective.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:30:7: ( 'AutenticacionBasica' )
            // InternalCeffective.g:30:9: 'AutenticacionBasica'
            {
            match("AutenticacionBasica"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:31:7: ( 'password' )
            // InternalCeffective.g:31:9: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:32:7: ( 'AutenticacionFirma' )
            // InternalCeffective.g:32:9: 'AutenticacionFirma'
            {
            match("AutenticacionFirma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:33:7: ( 'certificado' )
            // InternalCeffective.g:33:9: 'certificado'
            {
            match("certificado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:34:7: ( 'ServidorAplicaciones' )
            // InternalCeffective.g:34:9: 'ServidorAplicaciones'
            {
            match("ServidorAplicaciones"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:35:7: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:35:9: 'zonaDisponibilidad'
            {
            match("zonaDisponibilidad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:36:7: ( 'zonaNombre' )
            // InternalCeffective.g:36:9: 'zonaNombre'
            {
            match("zonaNombre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:37:7: ( 'tamano' )
            // InternalCeffective.g:37:9: 'tamano'
            {
            match("tamano"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:38:7: ( 'sistemaOperativo' )
            // InternalCeffective.g:38:9: 'sistemaOperativo'
            {
            match("sistemaOperativo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:39:7: ( 'Almacenamiento' )
            // InternalCeffective.g:39:9: 'Almacenamiento'
            {
            match("Almacenamiento"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:40:7: ( 'tamanoInicial' )
            // InternalCeffective.g:40:9: 'tamanoInicial'
            {
            match("tamanoInicial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:41:7: ( 'ServidorBD' )
            // InternalCeffective.g:41:9: 'ServidorBD'
            {
            match("ServidorBD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:42:7: ( 'tipo' )
            // InternalCeffective.g:42:9: 'tipo'
            {
            match("tipo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:43:7: ( 'sistemaManejador' )
            // InternalCeffective.g:43:9: 'sistemaManejador'
            {
            match("sistemaManejador"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:44:7: ( 'Servidor' )
            // InternalCeffective.g:44:9: 'Servidor'
            {
            match("Servidor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:45:7: ( '-' )
            // InternalCeffective.g:45:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:46:7: ( 'Subred' )
            // InternalCeffective.g:46:9: 'Subred'
            {
            match("Subred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:47:7: ( 'cidrBlock' )
            // InternalCeffective.g:47:9: 'cidrBlock'
            {
            match("cidrBlock"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:48:7: ( 'InternetGateway' )
            // InternalCeffective.g:48:9: 'InternetGateway'
            {
            match("InternetGateway"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:49:7: ( 'GrupoSeguridad' )
            // InternalCeffective.g:49:9: 'GrupoSeguridad'
            {
            match("GrupoSeguridad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:50:7: ( 'descripcion' )
            // InternalCeffective.g:50:9: 'descripcion'
            {
            match("descripcion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:51:7: ( 'reglasSalida' )
            // InternalCeffective.g:51:9: 'reglasSalida'
            {
            match("reglasSalida"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:52:7: ( 'reglasEntrada' )
            // InternalCeffective.g:52:9: 'reglasEntrada'
            {
            match("reglasEntrada"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:53:7: ( 'IST' )
            // InternalCeffective.g:53:9: 'IST'
            {
            match("IST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:54:7: ( 'QA' )
            // InternalCeffective.g:54:9: 'QA'
            {
            match("QA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:55:7: ( 'NFT' )
            // InternalCeffective.g:55:9: 'NFT'
            {
            match("NFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:56:7: ( 'PRD' )
            // InternalCeffective.g:56:9: 'PRD'
            {
            match("PRD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:57:7: ( 'Micro' )
            // InternalCeffective.g:57:9: 'Micro'
            {
            match("Micro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:58:7: ( 'Small' )
            // InternalCeffective.g:58:9: 'Small'
            {
            match("Small"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:59:7: ( 'Medium' )
            // InternalCeffective.g:59:9: 'Medium'
            {
            match("Medium"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:60:7: ( 'Large' )
            // InternalCeffective.g:60:9: 'Large'
            {
            match("Large"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:61:7: ( 'Relacional' )
            // InternalCeffective.g:61:9: 'Relacional'
            {
            match("Relacional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:62:7: ( 'NoSql' )
            // InternalCeffective.g:62:9: 'NoSql'
            {
            match("NoSql"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:2572:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCeffective.g:2572:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCeffective.g:2572:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCeffective.g:2572:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCeffective.g:2572:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCeffective.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:2574:10: ( ( '0' .. '9' )+ )
            // InternalCeffective.g:2574:12: ( '0' .. '9' )+
            {
            // InternalCeffective.g:2574:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCeffective.g:2574:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:2576:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCeffective.g:2576:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCeffective.g:2576:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCeffective.g:2576:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCeffective.g:2576:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCeffective.g:2576:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCeffective.g:2576:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCeffective.g:2576:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCeffective.g:2576:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCeffective.g:2576:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCeffective.g:2576:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:2578:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCeffective.g:2578:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCeffective.g:2578:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCeffective.g:2578:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:2580:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCeffective.g:2580:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCeffective.g:2580:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCeffective.g:2580:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalCeffective.g:2580:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCeffective.g:2580:41: ( '\\r' )? '\\n'
                    {
                    // InternalCeffective.g:2580:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCeffective.g:2580:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:2582:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCeffective.g:2582:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCeffective.g:2582:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCeffective.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCeffective.g:2584:16: ( . )
            // InternalCeffective.g:2584:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCeffective.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=59;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCeffective.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalCeffective.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalCeffective.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalCeffective.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalCeffective.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalCeffective.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalCeffective.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalCeffective.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalCeffective.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalCeffective.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalCeffective.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalCeffective.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalCeffective.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalCeffective.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalCeffective.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalCeffective.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalCeffective.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalCeffective.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalCeffective.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalCeffective.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalCeffective.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalCeffective.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalCeffective.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalCeffective.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalCeffective.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalCeffective.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalCeffective.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalCeffective.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalCeffective.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalCeffective.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalCeffective.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalCeffective.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalCeffective.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalCeffective.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalCeffective.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalCeffective.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalCeffective.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalCeffective.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalCeffective.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalCeffective.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalCeffective.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalCeffective.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalCeffective.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalCeffective.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalCeffective.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalCeffective.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalCeffective.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalCeffective.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalCeffective.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalCeffective.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalCeffective.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalCeffective.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalCeffective.g:1:322: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 54 :
                // InternalCeffective.g:1:330: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 55 :
                // InternalCeffective.g:1:339: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 56 :
                // InternalCeffective.g:1:351: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 57 :
                // InternalCeffective.g:1:367: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 58 :
                // InternalCeffective.g:1:383: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 59 :
                // InternalCeffective.g:1:391: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\5\47\2\uffff\4\47\1\uffff\10\47\1\45\2\uffff\3\45\2\uffff\1\47\2\uffff\2\47\1\uffff\6\47\1\uffff\11\47\2\uffff\7\47\1\uffff\4\47\1\164\6\47\5\uffff\4\47\1\177\1\47\1\u0081\24\47\1\u0096\2\47\1\uffff\1\u0099\11\47\1\uffff\1\47\1\uffff\21\47\1\u00b6\2\47\1\uffff\2\47\1\uffff\30\47\1\u00d3\3\47\1\uffff\4\47\1\u00db\1\u00dc\1\47\1\u00de\5\47\1\u00e4\7\47\1\u00ec\5\47\1\u00f3\1\uffff\2\47\1\u00f7\4\47\2\uffff\1\u00fc\1\uffff\5\47\1\uffff\6\47\1\u0108\1\uffff\6\47\1\uffff\3\47\1\uffff\4\47\1\uffff\3\47\1\u011a\2\47\1\u011e\4\47\1\uffff\2\47\1\u0125\2\47\1\u012a\13\47\1\uffff\3\47\1\uffff\5\47\1\u013e\1\uffff\4\47\1\uffff\11\47\1\u014c\11\47\1\uffff\3\47\1\u0159\1\47\1\u015b\6\47\1\u0162\1\uffff\10\47\1\u016b\3\47\1\uffff\1\47\1\uffff\5\47\1\u0175\1\uffff\10\47\1\uffff\1\u017e\10\47\1\uffff\1\u0187\1\u0188\6\47\1\uffff\1\u0191\2\47\1\u0194\4\47\2\uffff\7\47\1\u01a0\1\uffff\2\47\1\uffff\3\47\1\u01a6\7\47\1\uffff\4\47\1\u01b2\1\uffff\11\47\1\u01bc\1\u01bd\1\uffff\11\47\2\uffff\1\47\1\u01c8\1\u01c9\2\47\1\u01cc\1\u01cd\1\47\1\u01cf\1\47\2\uffff\1\47\1\u01d2\2\uffff\1\47\1\uffff\1\u01d4\1\u01d5\1\uffff\1\u01d6\3\uffff";
    static final String DFA12_eofS =
        "\u01d7\uffff";
    static final String DFA12_minS =
        "\1\0\1\145\1\uffff\1\141\1\uffff\1\122\1\157\1\160\1\155\1\uffff\1\145\1\154\1\163\2\145\2\uffff\1\145\1\157\1\141\1\151\1\uffff\1\123\1\162\1\145\1\101\1\106\1\145\1\141\1\145\1\101\2\uffff\2\0\1\52\2\uffff\1\146\2\uffff\1\157\1\163\1\uffff\1\157\1\104\1\155\1\143\1\164\1\142\1\uffff\1\143\1\164\1\142\1\155\1\165\2\162\1\144\1\143\2\uffff\1\162\1\142\1\141\1\156\1\155\1\160\1\163\1\uffff\1\164\1\124\1\165\1\163\1\60\1\124\1\123\1\143\1\144\1\162\1\154\5\uffff\1\146\1\166\1\163\1\166\1\60\1\142\1\60\1\145\1\151\1\141\1\145\1\151\2\141\1\162\1\164\1\162\1\165\1\154\1\166\1\162\1\154\2\141\1\157\1\164\1\145\1\60\1\160\1\143\1\uffff\1\60\1\161\1\162\1\151\1\147\1\141\2\145\1\167\1\145\1\uffff\1\162\1\uffff\1\156\1\145\2\156\1\145\1\143\1\162\1\145\1\151\1\102\1\162\1\141\1\151\1\145\1\154\1\104\1\156\1\60\1\145\1\162\1\uffff\1\157\1\162\1\uffff\1\154\1\157\1\165\1\145\2\143\1\145\1\157\2\145\1\164\1\156\1\151\1\164\1\156\1\145\1\151\1\157\1\146\1\154\2\163\2\144\1\60\1\151\2\157\1\uffff\1\155\1\156\1\123\1\151\2\60\1\155\1\60\1\151\1\164\1\144\1\162\1\144\1\60\1\151\1\164\1\163\1\151\1\164\1\156\1\157\1\60\1\151\2\157\1\105\1\157\1\60\1\uffff\1\163\1\155\1\60\1\141\2\145\1\160\2\uffff\1\60\1\uffff\1\157\1\151\1\157\1\144\1\157\1\uffff\1\143\1\145\1\155\1\143\1\145\1\141\1\60\1\uffff\2\143\1\163\1\141\1\156\1\162\1\uffff\1\160\1\142\1\156\1\uffff\1\115\1\164\1\147\1\143\1\uffff\1\156\1\166\1\162\1\60\1\162\1\141\1\60\1\157\1\141\1\104\1\155\1\uffff\1\141\1\153\1\60\1\154\1\164\1\60\1\157\1\162\1\151\1\160\1\141\1\107\1\165\1\151\1\141\1\145\1\116\1\uffff\1\116\1\143\1\145\1\uffff\1\163\1\143\1\145\1\151\1\144\1\60\1\uffff\1\151\1\162\1\160\1\104\1\uffff\1\156\1\145\1\143\1\145\1\156\1\141\1\162\1\157\1\154\1\60\2\165\1\151\1\163\1\145\1\151\1\163\1\145\1\157\1\uffff\1\144\1\141\1\154\1\60\1\151\1\60\1\151\1\162\1\145\1\164\1\151\1\156\1\60\1\uffff\2\142\1\157\1\160\1\147\1\157\1\160\1\156\1\60\1\141\1\144\1\151\1\uffff\1\142\1\uffff\2\141\1\152\1\145\1\144\1\60\1\uffff\2\145\1\156\1\154\1\165\1\156\1\154\1\164\1\uffff\1\60\1\141\1\143\1\151\1\154\1\164\1\141\1\167\1\141\1\uffff\2\60\1\125\1\151\1\162\1\102\1\151\1\157\1\uffff\1\60\1\141\1\154\1\60\1\151\1\144\1\141\1\144\2\uffff\1\163\1\145\1\151\1\163\1\141\1\151\1\145\1\60\1\uffff\1\143\1\151\1\uffff\1\166\1\157\1\171\1\60\1\165\1\147\1\144\1\165\1\163\1\162\1\147\1\uffff\1\151\1\144\1\157\1\162\1\60\1\uffff\1\141\1\165\2\141\1\151\1\155\1\165\1\157\1\141\2\60\1\uffff\1\162\1\145\1\144\1\162\1\143\1\141\1\145\1\156\1\144\2\uffff\1\151\2\60\1\151\1\141\2\60\1\145\1\60\1\157\2\uffff\1\157\1\60\2\uffff\1\163\1\uffff\2\60\1\uffff\1\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\145\1\uffff\1\162\1\uffff\1\162\1\157\1\160\1\165\1\uffff\1\145\1\165\1\163\1\157\1\145\2\uffff\1\165\1\157\2\151\1\uffff\1\156\1\162\1\145\1\101\1\157\1\151\1\141\1\145\1\172\2\uffff\2\uffff\1\57\2\uffff\1\146\2\uffff\1\157\1\163\1\uffff\1\157\1\104\1\155\1\143\1\164\1\142\1\uffff\1\143\1\164\1\142\1\155\1\165\2\162\1\144\1\147\2\uffff\1\162\1\142\1\141\1\156\1\155\1\160\1\163\1\uffff\1\164\1\124\1\165\1\163\1\172\1\124\1\123\1\143\1\144\1\162\1\154\5\uffff\1\146\1\166\1\163\1\166\1\172\1\142\1\172\1\145\1\151\1\141\1\145\1\151\2\141\1\162\1\164\1\162\1\165\1\154\1\166\1\162\1\154\2\141\1\157\1\164\1\145\1\172\1\160\1\143\1\uffff\1\172\1\161\1\162\1\151\1\147\1\141\2\145\1\167\1\145\1\uffff\1\162\1\uffff\1\156\1\145\2\156\1\145\1\143\1\162\1\145\1\151\1\102\1\162\1\141\1\151\1\145\1\154\1\116\1\156\1\172\1\145\1\162\1\uffff\1\157\1\162\1\uffff\1\154\1\157\1\165\1\145\2\143\1\145\1\157\2\145\1\164\1\156\1\151\1\164\1\156\1\145\1\151\1\157\1\146\1\154\2\163\2\144\1\172\1\151\2\157\1\uffff\1\155\1\156\1\123\1\151\2\172\1\155\1\172\1\151\1\164\1\144\1\162\1\144\1\172\1\151\1\164\1\163\1\151\1\164\1\156\1\157\1\172\1\151\2\157\1\123\1\157\1\172\1\uffff\1\163\1\155\1\172\1\141\2\145\1\160\2\uffff\1\172\1\uffff\1\157\1\151\1\157\1\144\1\157\1\uffff\1\143\1\145\1\155\1\143\1\145\1\141\1\172\1\uffff\2\143\1\163\1\141\1\156\1\162\1\uffff\1\160\1\142\1\156\1\uffff\1\117\1\164\1\147\1\143\1\uffff\1\156\1\166\1\162\1\172\1\162\1\141\1\172\1\157\1\141\1\104\1\155\1\uffff\1\141\1\153\1\172\1\154\1\164\1\172\1\157\1\162\1\151\1\160\1\141\1\107\1\165\1\151\1\141\1\145\1\116\1\uffff\1\116\1\143\1\145\1\uffff\1\163\1\143\1\145\1\151\1\144\1\172\1\uffff\1\151\1\162\1\160\1\104\1\uffff\1\156\1\145\1\143\1\145\1\156\1\141\1\162\1\157\1\154\1\172\2\165\1\151\1\163\1\145\1\151\1\163\1\145\1\157\1\uffff\1\144\1\141\1\154\1\172\1\151\1\172\1\151\1\162\1\145\1\164\1\151\1\156\1\172\1\uffff\2\142\1\157\1\160\1\147\1\157\1\160\1\156\1\172\1\141\1\144\1\151\1\uffff\1\142\1\uffff\2\141\1\152\1\145\1\144\1\172\1\uffff\2\145\1\156\1\154\1\165\1\156\1\154\1\164\1\uffff\1\172\1\141\1\143\1\151\1\154\1\164\1\141\1\167\1\141\1\uffff\2\172\1\125\1\151\1\162\1\125\1\151\1\157\1\uffff\1\172\1\141\1\154\1\172\1\151\1\144\1\141\1\144\2\uffff\1\163\1\145\1\151\1\163\1\141\1\151\1\145\1\172\1\uffff\1\143\1\151\1\uffff\1\166\1\157\1\171\1\172\1\165\1\147\1\144\1\165\1\163\1\162\1\147\1\uffff\1\151\1\144\1\157\1\162\1\172\1\uffff\1\141\1\165\2\141\1\151\1\155\1\165\1\157\1\141\2\172\1\uffff\1\162\1\145\1\144\1\162\1\143\1\141\1\145\1\156\1\144\2\uffff\1\151\2\172\1\151\1\141\2\172\1\145\1\172\1\157\2\uffff\1\157\1\172\2\uffff\1\163\1\uffff\2\172\1\uffff\1\172\3\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\4\uffff\1\11\5\uffff\1\22\1\23\4\uffff\1\43\11\uffff\1\65\1\66\3\uffff\1\72\1\73\1\uffff\1\65\1\2\2\uffff\1\4\6\uffff\1\11\11\uffff\1\22\1\23\7\uffff\1\43\13\uffff\1\66\1\67\1\70\1\71\1\72\36\uffff\1\54\12\uffff\1\56\1\uffff\1\7\24\uffff\1\53\2\uffff\1\55\34\uffff\1\40\34\uffff\1\60\7\uffff\1\64\1\57\1\uffff\1\62\5\uffff\1\6\7\uffff\1\16\6\uffff\1\44\3\uffff\1\33\4\uffff\1\61\13\uffff\1\15\21\uffff\1\25\3\uffff\1\20\6\uffff\1\21\4\uffff\1\42\23\uffff\1\45\15\uffff\1\1\14\uffff\1\37\1\uffff\1\32\6\uffff\1\63\10\uffff\1\27\11\uffff\1\50\10\uffff\1\51\10\uffff\1\3\1\5\10\uffff\1\52\2\uffff\1\36\13\uffff\1\35\5\uffff\1\47\13\uffff\1\46\11\uffff\1\34\1\41\12\uffff\1\12\1\13\2\uffff\1\26\1\17\1\uffff\1\31\2\uffff\1\24\1\uffff\1\10\1\14\1\30";
    static final String DFA12_specialS =
        "\1\2\40\uffff\1\0\1\1\u01b4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\45\2\44\2\45\1\44\22\45\1\44\1\45\1\41\4\45\1\42\1\17\1\20\2\45\1\11\1\25\1\45\1\43\12\40\7\45\1\13\1\37\1\1\3\37\1\27\1\37\1\26\2\37\1\34\1\33\1\32\1\37\1\5\1\31\1\35\1\21\7\37\3\45\1\36\1\37\1\45\1\10\1\37\1\15\1\30\10\37\1\12\1\6\1\37\1\3\1\37\1\16\1\24\1\23\1\14\1\7\3\37\1\22\1\2\1\45\1\4\uff82\45",
            "\1\46",
            "",
            "\1\52\20\uffff\1\51",
            "",
            "\1\55\37\uffff\1\54",
            "\1\56",
            "\1\57",
            "\1\61\7\uffff\1\60",
            "",
            "\1\63",
            "\1\66\1\65\7\uffff\1\64",
            "\1\67",
            "\1\71\3\uffff\1\72\5\uffff\1\70",
            "\1\73",
            "",
            "",
            "\1\76\7\uffff\1\100\7\uffff\1\77",
            "\1\101",
            "\1\102\7\uffff\1\103",
            "\1\104",
            "",
            "\1\107\32\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\50\uffff\1\114",
            "\1\116\3\uffff\1\115",
            "\1\117",
            "\1\120",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\0\122",
            "\0\122",
            "\1\123\4\uffff\1\124",
            "",
            "",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147\3\uffff\1\150",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0080",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0097",
            "\1\u0098",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\11\uffff\1\u00b4",
            "\1\u00b5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00dd",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f1\15\uffff\1\u00f0",
            "\1\u00f2",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00f4",
            "\1\u00f5",
            "\12\47\7\uffff\10\47\1\u00f6\21\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0113\1\uffff\1\u0112",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u011b",
            "\1\u011c",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u011d\26\47",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0126",
            "\1\u0127",
            "\12\47\7\uffff\1\u0128\1\u0129\30\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u015a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018d\3\uffff\1\u018e\16\uffff\1\u018c",
            "\1\u018f",
            "\1\u0190",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0192",
            "\1\u0193",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01a1",
            "\1\u01a2",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "",
            "",
            "\1\u01c7",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01ca",
            "\1\u01cb",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01ce",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u01d0",
            "",
            "",
            "\1\u01d1",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\u01d3",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( ((LA12_33>='\u0000' && LA12_33<='\uFFFF')) ) {s = 82;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_34 = input.LA(1);

                        s = -1;
                        if ( ((LA12_34>='\u0000' && LA12_34<='\uFFFF')) ) {s = 82;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='C') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='p') ) {s = 3;}

                        else if ( (LA12_0=='}') ) {s = 4;}

                        else if ( (LA12_0=='P') ) {s = 5;}

                        else if ( (LA12_0=='n') ) {s = 6;}

                        else if ( (LA12_0=='v') ) {s = 7;}

                        else if ( (LA12_0=='a') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0=='m') ) {s = 10;}

                        else if ( (LA12_0=='A') ) {s = 11;}

                        else if ( (LA12_0=='u') ) {s = 12;}

                        else if ( (LA12_0=='c') ) {s = 13;}

                        else if ( (LA12_0=='r') ) {s = 14;}

                        else if ( (LA12_0=='(') ) {s = 15;}

                        else if ( (LA12_0==')') ) {s = 16;}

                        else if ( (LA12_0=='S') ) {s = 17;}

                        else if ( (LA12_0=='z') ) {s = 18;}

                        else if ( (LA12_0=='t') ) {s = 19;}

                        else if ( (LA12_0=='s') ) {s = 20;}

                        else if ( (LA12_0=='-') ) {s = 21;}

                        else if ( (LA12_0=='I') ) {s = 22;}

                        else if ( (LA12_0=='G') ) {s = 23;}

                        else if ( (LA12_0=='d') ) {s = 24;}

                        else if ( (LA12_0=='Q') ) {s = 25;}

                        else if ( (LA12_0=='N') ) {s = 26;}

                        else if ( (LA12_0=='M') ) {s = 27;}

                        else if ( (LA12_0=='L') ) {s = 28;}

                        else if ( (LA12_0=='R') ) {s = 29;}

                        else if ( (LA12_0=='^') ) {s = 30;}

                        else if ( (LA12_0=='B'||(LA12_0>='D' && LA12_0<='F')||LA12_0=='H'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='O'||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='e' && LA12_0<='l')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='w' && LA12_0<='y')) ) {s = 31;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 32;}

                        else if ( (LA12_0=='\"') ) {s = 33;}

                        else if ( (LA12_0=='\'') ) {s = 34;}

                        else if ( (LA12_0=='/') ) {s = 35;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 36;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='.'||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 37;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}