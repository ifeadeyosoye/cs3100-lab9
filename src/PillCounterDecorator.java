/**
 * Decorator class for a pill counter.
 */
public class PillCounterDecorator implements PillCounter {
  private LoggingPillCounter delegate;

  /**
   * Constructor that takes in a delegate.
   *
   * @param delegate LoggingPillCounter object
   */
  public PillCounterDecorator(LoggingPillCounter delegate) {
    this.delegate = delegate;
  }

  @Override
  public void addPill(int count) {
    delegate.addPill(count);
  }

  @Override
  public void removePill() {
    delegate.removePill();
  }

  @Override
  public void reset() {
    delegate.reset();
  }

  @Override
  public int getPillCount() {
    return delegate.getPillCount();
  }
}
