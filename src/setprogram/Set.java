package setprogram;

/**
 * The {@code Set} interface contains the common methods of a set.
 *
 * @author eavelasquez
 */
public interface Set {
  public boolean contains(int e);

  public void add(int e);

  public void remove(int e);

  @Override
  public String toString();

  public int size();

  public boolean isEmpty();

  public void clear();

  public int indexOf(int e);
}
