/* Generated By:JJTree&JavaCC: Do not edit this line. Eg2TokenManager.java */
/** An Arithmetic Grammar. */
//package Parser;
import symbols.*;
import java.util.ArrayList;

/** Token Manager. */
public class Eg2TokenManager implements Eg2Constants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 37;
            return 20;
         }
         if ((active0 & 0x5400000000000000L) != 0L)
            return 35;
         if ((active0 & 0x8808900L) != 0L)
         {
            jjmatchedKind = 37;
            return 30;
         }
         if ((active0 & 0xf8000000000000L) != 0L || (active1 & 0x67L) != 0L)
            return 31;
         if ((active1 & 0x8L) != 0L)
            return 43;
         if ((active0 & 0x44000L) != 0L)
         {
            jjmatchedKind = 37;
            return 9;
         }
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 37;
            return 2;
         }
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 37;
            return 12;
         }
         if ((active1 & 0x200L) != 0L)
            return 16;
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 37;
            return 5;
         }
         if ((active0 & 0x1200L) != 0L)
         {
            jjmatchedKind = 37;
            return 24;
         }
         if ((active0 & 0xa800000000000000L) != 0L)
            return 37;
         return -1;
      case 1:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
            return 11;
         }
         if ((active0 & 0x884fb00L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
            return 30;
         }
         if ((active0 & 0xc000000000000000L) != 0L)
            return 31;
         if ((active0 & 0x480L) != 0L)
            return 30;
         return -1;
      case 2:
         if ((active0 & 0x885e900L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 37;
               jjmatchedPos = 2;
            }
            return 30;
         }
         if ((active0 & 0x1200L) != 0L)
            return 30;
         return -1;
      case 3:
         if ((active0 & 0x5f800L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 3;
            return 30;
         }
         if ((active0 & 0x8800100L) != 0L)
            return 30;
         return -1;
      case 4:
         if ((active0 & 0x1d000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 4;
            return 30;
         }
         if ((active0 & 0x42800L) != 0L)
            return 30;
         return -1;
      case 5:
         if ((active0 & 0x5000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 5;
            return 30;
         }
         if ((active0 & 0x18000L) != 0L)
            return 30;
         return -1;
      case 6:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 6;
            return 30;
         }
         if ((active0 & 0x1000L) != 0L)
            return 30;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 72;
         return jjMoveStringLiteralDfa1_0(0x200000000000000L, 0x0L);
      case 37:
         return jjStopAtPos(0, 68);
      case 38:
         jjmatchedKind = 55;
         return jjMoveStringLiteralDfa1_0(0x10000000000000L, 0x0L);
      case 40:
         return jjStopAtPos(0, 47);
      case 41:
         return jjStopAtPos(0, 48);
      case 42:
         return jjStartNfaWithStates_0(0, 66, 31);
      case 43:
         jjmatchedKind = 64;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x40L);
      case 44:
         return jjStopAtPos(0, 41);
      case 45:
         jjmatchedKind = 65;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x20L);
      case 46:
         return jjStartNfaWithStates_0(0, 73, 16);
      case 47:
         return jjStartNfaWithStates_0(0, 67, 43);
      case 58:
         return jjStopAtPos(0, 49);
      case 59:
         return jjStopAtPos(0, 46);
      case 60:
         jjmatchedKind = 58;
         return jjMoveStringLiteralDfa1_0(0x5000000000000000L, 0x0L);
      case 61:
         jjmatchedKind = 39;
         return jjMoveStringLiteralDfa1_0(0x100000000000000L, 0x0L);
      case 62:
         jjmatchedKind = 59;
         return jjMoveStringLiteralDfa1_0(0xa000000000000000L, 0x0L);
      case 63:
         return jjStopAtPos(0, 50);
      case 91:
         return jjStopAtPos(0, 42);
      case 93:
         return jjStopAtPos(0, 43);
      case 94:
         return jjStartNfaWithStates_0(0, 54, 31);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x44000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x1200L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80L, 0x0L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x8000000L, 0x0L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10000L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x8000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x400L, 0x0L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x800000L, 0x0L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800L, 0x0L);
      case 123:
         return jjStopAtPos(0, 44);
      case 124:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x8000000000000L, 0x0L);
      case 125:
         return jjStopAtPos(0, 45);
      case 126:
         return jjStopAtPos(0, 71);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(1, 52);
         break;
      case 43:
         if ((active1 & 0x40L) != 0L)
            return jjStopAtPos(1, 70);
         break;
      case 45:
         if ((active1 & 0x20L) != 0L)
            return jjStopAtPos(1, 69);
         break;
      case 60:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 62, 31);
         break;
      case 61:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         else if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         else if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         break;
      case 62:
         if ((active0 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 63, 31);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L, active1, 0L);
      case 102:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(1, 7, 30);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L, active1, 0L);
      case 111:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 30);
         return jjMoveStringLiteralDfa2_0(active0, 0x845200L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L, active1, 0L);
      case 124:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x800800L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x44000L);
      case 114:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x9000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 100:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(3, 23, 30);
         break;
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 30);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 108:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 30);
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x18000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 30);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 107:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 30);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 30);
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 116:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 104:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(6, 12, 30);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(7, 14, 30);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 66;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 11:
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 43:
                  if (curChar == 61)
                  {
                     if (kind > 40)
                        kind = 40;
                  }
                  else if (curChar == 42)
                     jjCheckNAddTwoStates(49, 50);
                  else if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 3:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     jjCheckNAddStates(3, 7);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 24)
                        kind = 24;
                     jjCheckNAddStates(8, 11);
                  }
                  else if (curChar == 47)
                     jjCheckNAddStates(12, 14);
                  else if (curChar == 38)
                     jjCheckNAdd(31);
                  else if (curChar == 62)
                     jjstateSet[jjnewStateCnt++] = 37;
                  else if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 35;
                  else if (curChar == 45)
                     jjCheckNAdd(31);
                  else if (curChar == 43)
                     jjCheckNAdd(31);
                  else if (curChar == 42)
                     jjCheckNAdd(31);
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 27;
                  else if (curChar == 46)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 16:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     jjCheckNAdd(17);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 25)
                        kind = 25;
                  }
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 14:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 15:
                  if (curChar == 48 && kind > 25)
                     kind = 25;
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(17);
                  break;
               case 26:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0x3fe000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if (curChar == 39 && kind > 28)
                     kind = 28;
                  break;
               case 31:
                  if (curChar == 61 && kind > 40)
                     kind = 40;
                  break;
               case 32:
                  if (curChar == 42)
                     jjCheckNAdd(31);
                  break;
               case 33:
                  if (curChar == 43)
                     jjCheckNAdd(31);
                  break;
               case 34:
                  if (curChar == 45)
                     jjCheckNAdd(31);
                  break;
               case 35:
                  if (curChar == 60)
                     jjCheckNAdd(31);
                  break;
               case 36:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if (curChar == 62)
                     jjCheckNAdd(31);
                  break;
               case 38:
                  if (curChar == 62)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 38)
                     jjCheckNAdd(31);
                  break;
               case 42:
                  if (curChar == 47)
                     jjCheckNAddStates(12, 14);
                  break;
               case 44:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 45:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 46:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 47:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(49, 50);
                  break;
               case 49:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(49, 50);
                  break;
               case 50:
                  if (curChar == 42)
                     jjAddStates(15, 16);
                  break;
               case 51:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(52, 50);
                  break;
               case 52:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(52, 50);
                  break;
               case 53:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               case 54:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAddStates(3, 7);
                  break;
               case 55:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(55);
                  break;
               case 56:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(56, 57);
                  break;
               case 57:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(15, 58);
                  break;
               case 58:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(59);
                  break;
               case 59:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(59);
                  break;
               case 60:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(60, 61);
                  break;
               case 61:
                  if (curChar == 46 && kind > 25)
                     kind = 25;
                  break;
               case 62:
                  if (curChar != 48)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAddStates(8, 11);
                  break;
               case 64:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 65:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(65);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 11:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 97)
                     jjCheckNAdd(0);
                  break;
               case 20:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 12:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(30);
                  }
                  else if (curChar == 124)
                     jjCheckNAdd(31);
                  else if (curChar == 94)
                     jjCheckNAdd(31);
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 24;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 24:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 9:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 37)
                        kind = 37;
                     jjCheckNAdd(30);
                  }
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 0:
                  if (curChar == 108 && kind > 17)
                     kind = 17;
                  break;
               case 1:
                  if (curChar == 111)
                     jjCheckNAdd(0);
                  break;
               case 4:
                  if (curChar == 116 && kind > 17)
                     kind = 17;
                  break;
               case 6:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 114 && kind > 17)
                     kind = 17;
                  break;
               case 8:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 10:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 13:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 18:
                  if (curChar == 101 && kind > 26)
                     kind = 26;
                  break;
               case 19:
                  if (curChar == 117)
                     jjCheckNAdd(18);
                  break;
               case 21:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 115)
                     jjCheckNAdd(18);
                  break;
               case 23:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 25:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 27:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 29:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 30:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjCheckNAdd(30);
                  break;
               case 40:
                  if (curChar == 94)
                     jjCheckNAdd(31);
                  break;
               case 41:
                  if (curChar == 124)
                     jjCheckNAdd(31);
                  break;
               case 44:
                  jjAddStates(0, 2);
                  break;
               case 49:
                  jjCheckNAddTwoStates(49, 50);
                  break;
               case 51:
               case 52:
                  jjCheckNAddTwoStates(52, 50);
                  break;
               case 63:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(64);
                  break;
               case 64:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(64);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 44:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               case 49:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(49, 50);
                  break;
               case 51:
               case 52:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(52, 50);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 66 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   44, 45, 47, 55, 56, 57, 60, 61, 63, 65, 57, 61, 43, 48, 31, 51, 
   53, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\151\146", "\145\154\163\145", 
"\146\157\162", "\164\157", "\167\150\151\154\145", "\146\157\162\145\141\143\150", 
"\142\162\145\141\153", "\143\157\156\164\151\156\165\145", "\163\164\162\165\143\164", 
"\162\145\164\165\162\156", null, "\143\157\156\163\164", null, null, null, null, "\166\157\151\144", null, 
null, null, "\156\165\154\154", null, null, null, null, null, null, null, null, null, 
null, null, "\75", null, "\54", "\133", "\135", "\173", "\175", "\73", "\50", "\51", 
"\72", "\77", "\174\174", "\46\46", "\174", "\136", "\46", "\75\75", "\41\75", "\74", 
"\76", "\74\75", "\76\75", "\74\74", "\76\76", "\53", "\55", "\52", "\57", "\45", 
"\55\55", "\53\53", "\176", "\41", "\56", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffa01f87ff81L, 0x3ffL, 
};
static final long[] jjtoSkip = {
   0x7eL, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[66];
private final int[] jjstateSet = new int[132];
protected char curChar;
/** Constructor. */
public Eg2TokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public Eg2TokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 66; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   t = Token.newToken(jjmatchedKind, curTokenImage);

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
