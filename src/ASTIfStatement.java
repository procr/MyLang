import java.io.IOException;

/* Generated By:JJTree: Do not edit this line. ASTIfStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTIfStatement extends SimpleNode {
	private int elseLabel;
	private int tailLabel = -1;
	
  public ASTIfStatement(int id) {
    super(id);
  }

  public ASTIfStatement(Eg2 p, int id) {
    super(p, id);
  }

  public int genInter(int paraL, int paraR) throws IOException {
	  if(tailLabel == -1)
		  tailLabel = genLabel();
	  elseLabel = genLabel();
	  content = "@t" + Integer.toString(genPara()) + " = @t" + Integer.toString(paraR)
			  + "\nif @t" + Integer.toString(para) + " == 0 goto @L" + Integer.toString(elseLabel)
			  + "\n";
	  writeInter();
	  return para;
  }
  public void genTailLabel() throws IOException {
	  content = "@L" + Integer.toString(tailLabel) + ": ";
	  writeInter();
  }
  public void genElseLabel() throws IOException {
	  content = "goto @L" + Integer.toString(tailLabel);
	  content += "\n@L" + Integer.toString(elseLabel) + ": ";
	  elseLabel = genLabel();
	  writeInter();
  }
}
/* JavaCC - OriginalChecksum=fbd922bf00499479df542d2a088931a1 (do not edit this line) */
