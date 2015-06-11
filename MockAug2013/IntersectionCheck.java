import java.awt.geom.Line2D;
import java.text.DecimalFormat;


public class IntersectionCheck {
	
	public static boolean linesIntersect(Line line1, Line line2){
		if(line1 == line2){
			return false;
		}
		Line2D l1 = line2DFromLine(line1);
		Line2D l2 = line2DFromLine(line2);
		return l1.intersectsLine(l2);
	}
	
	private static Line2D line2DFromLine(Line l){
		return new Line2D.Double(l.getX1(), l.getY1(), l.getX2(), l.getY2());
	}
	
	public static Line[] getIntersections(Line currentLine, Line[] allLines) {
		int count = 0;
		for (Line l : allLines) {
			if (linesIntersect(currentLine, l)) count++;
		}
		
		Line[] result = new Line[count];
		int j = 0;
		for (int i = 0; i < allLines.length; i++) {
			if (linesIntersect(currentLine, allLines[i])) {
				result[j++] = allLines[i];
			}
		}
		return result;
	}
	
	public static String printLine(Line segment){
		DecimalFormat formatter = new DecimalFormat("0.0");
		return "(" + formatter.format(segment.getX1() + ", " + segment.getY1() + ") to (" + segment.getX2() + ", " + segment.getY2() + ")");
	}
	
	public static String printIntersections(Line[] allLines) {
		String result = "";
		for (int i = 0; i < allLines.length; i++) {
			Line li = allLines[i];
			Line[] ints = getIntersections(li, allLines);
			if (ints.length > 0) {
				result += "Line "+printLine(li)+" intersects with:\n";
				for (int j = 0; j < ints.length; j++) {
					result += printLine(ints[j]) + "\n";
				}
			}
		}
		return result;
	}
}
