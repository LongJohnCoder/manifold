package manifold.sql.parser;

public class SQLParseError extends RuntimeException {
  public SQLParseError(String message) {
    super(message);
  }
}