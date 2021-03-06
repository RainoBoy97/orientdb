/* Generated By:JJTree: Do not edit this line. OBeginStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public
class OBeginStatement extends OStatement {
  protected OIdentifier isolation;
  public OBeginStatement(int id) {
    super(id);
  }

  public OBeginStatement(OrientSql p, int id) {
    super(p, id);
  }

  @Override public void toString(Map<Object, Object> params, StringBuilder builder) {
    builder.append("BEGIN");
    if(isolation!=null){
      builder.append(" ISOLATION ");
      isolation.toString(params, builder);
    }
  }
}
/* JavaCC - OriginalChecksum=aaa994acbe63cc4169fe33144d412fed (do not edit this line) */
