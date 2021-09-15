// Generated from c:\Users\Admin\OneDrive\Escritorio\Facultad\Compilador2021\src\main\java\compiladores2021\compilador.g4 by ANTLR 4.8
 
package compiladores2021;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladorParser}.
 */
public interface compiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladorParser#i_if}.
	 * @param ctx the parse tree
	 */
	void enterI_if(compiladorParser.I_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#i_if}.
	 * @param ctx the parse tree
	 */
	void exitI_if(compiladorParser.I_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#i_while}.
	 * @param ctx the parse tree
	 */
	void enterI_while(compiladorParser.I_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#i_while}.
	 * @param ctx the parse tree
	 */
	void exitI_while(compiladorParser.I_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#signosdecomparacion}.
	 * @param ctx the parse tree
	 */
	void enterSignosdecomparacion(compiladorParser.SignosdecomparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#signosdecomparacion}.
	 * @param ctx the parse tree
	 */
	void exitSignosdecomparacion(compiladorParser.SignosdecomparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#ladoA}.
	 * @param ctx the parse tree
	 */
	void enterLadoA(compiladorParser.LadoAContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#ladoA}.
	 * @param ctx the parse tree
	 */
	void exitLadoA(compiladorParser.LadoAContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#ladoB}.
	 * @param ctx the parse tree
	 */
	void enterLadoB(compiladorParser.LadoBContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#ladoB}.
	 * @param ctx the parse tree
	 */
	void exitLadoB(compiladorParser.LadoBContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladorParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladorParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladorParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladorParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#estructuradecontrol}.
	 * @param ctx the parse tree
	 */
	void enterEstructuradecontrol(compiladorParser.EstructuradecontrolContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#estructuradecontrol}.
	 * @param ctx the parse tree
	 */
	void exitEstructuradecontrol(compiladorParser.EstructuradecontrolContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#i_for}.
	 * @param ctx the parse tree
	 */
	void enterI_for(compiladorParser.I_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#i_for}.
	 * @param ctx the parse tree
	 */
	void exitI_for(compiladorParser.I_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#secvar}.
	 * @param ctx the parse tree
	 */
	void enterSecvar(compiladorParser.SecvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#secvar}.
	 * @param ctx the parse tree
	 */
	void exitSecvar(compiladorParser.SecvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#oal}.
	 * @param ctx the parse tree
	 */
	void enterOal(compiladorParser.OalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#oal}.
	 * @param ctx the parse tree
	 */
	void exitOal(compiladorParser.OalContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladorParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladorParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#factores}.
	 * @param ctx the parse tree
	 */
	void enterFactores(compiladorParser.FactoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#factores}.
	 * @param ctx the parse tree
	 */
	void exitFactores(compiladorParser.FactoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(compiladorParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(compiladorParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#andor}.
	 * @param ctx the parse tree
	 */
	void enterAndor(compiladorParser.AndorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#andor}.
	 * @param ctx the parse tree
	 */
	void exitAndor(compiladorParser.AndorContext ctx);
}