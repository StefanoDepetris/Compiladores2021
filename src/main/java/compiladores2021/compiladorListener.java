// Generated from c:\Users\Admin\OneDrive\Escritorio\Facultad\Compilador2021\src\main\java\compiladores2021\compilador.g4 by ANTLR 4.8
 
package compiladores2021;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladorParser}.
 */
public interface compiladorListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link compiladorParser#igual}.
	 * @param ctx the parse tree
	 */
	void enterIgual(compiladorParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#igual}.
	 * @param ctx the parse tree
	 */
	void exitIgual(compiladorParser.IgualContext ctx);
}