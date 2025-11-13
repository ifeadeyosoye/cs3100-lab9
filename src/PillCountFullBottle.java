import java.util.ArrayList;
import java.util.List;

public class PillCountFullBottle extends PillCounterDecorator {

  private List<Integer> counts;

  public PillCountFullBottle(LoggingPillCounter delegate) {
    super(delegate);
    counts = new ArrayList<>();
  }

  @Override
  public void reset() {
    counts.add(super.getPillCount());
    super.reset();
  }

  /**
   * A method that returns the counts of pills before a bottle is full.
   */
  public List<Integer> getCounts() {return counts;}
}
