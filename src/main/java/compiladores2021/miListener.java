package compiladores2021;

import org.antlr.v4.runtime.tree.TerminalNode;

import compiladores2021.compiladorParser.DeclaracionContext;
import compiladores2021.compiladorParser.SecvarContext;

public class miListener extends compiladorBaseListener {
//El compiladorBaseListener tieene funcionaes que son enterIntrucciones()
// exitInstrucciones() que son entra y salida de la regla.
//Hay informacion que no tenemos apenas entrramos a unregla que solo la tenemos
//en el exit por eso tenemos para cada regla gramtical tenemos un enter y un exit.

//Tambien tenemos enterEveryRUle() y exitEveryRule()

//Cuando llegmaos a la hojas tenemos visitTerminal() y visitErrorNode()


    private Integer token=0;
    private Integer dlc=0;
    private Integer vars=0;

    @Override public void visitTerminal(TerminalNode node) {
        token++;
        System.out.println("|" + node.getText() + "|" );

    }

    @Override public void enterPrograma(compiladorParser.ProgramaContext ctx) {
        System.out.println("Comienza compilacion" );
     }

     @Override
    public void enterDeclaracion(DeclaracionContext ctx) {
        dlc++;
        System.out.println("Start de declaracion el text: "+ctx.getText() +"El start es: "+ctx.getStart() +"El stop es: "+ctx.getStop());
    }

    @Override
    public void exitSecvar(SecvarContext ctx) {
        vars++;
        System.out.println("Start de declaracion el text: "+ctx.getText() +"El start es: "+ctx.getStart().getText());
   
    }

    @Override
    public void exitDeclaracion(DeclaracionContext ctx) {
        System.out.println("Fin de declaracion "+ctx.getText() );

    }

    @Override public void exitPrograma(compiladorParser.ProgramaContext ctx) {
        System.out.println("Fin de compilacion" );
        System.out.println("Se encontraron: "+token +" tokens" );
        System.out.println("Se encontraron: "+dlc+" declaraciones");
        System.out.println("Se encontraron: "+vars+" variables");
     }

}