package setprogram;

public interface Set {
  public boolean contains(int e);

  public void add(int e);

  public void remove(int e);

  public String toString();

  public int size();

  public boolean isEmpty();

  public void clear();

  public int indexOf(int e);
}
