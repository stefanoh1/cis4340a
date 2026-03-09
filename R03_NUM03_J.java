/*
Rule 3
NUM03-J. Use integer types that can fully represent the possible range of unsigned data
*/

import java.io.IOException;

public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt();	
}
