package edu.wpi.first.shuffleboard.widget;

import java.util.Objects;

/**
 * Represents the size of a tile in a grid.
 */
public class Size implements Comparable<Size> {

  private final int width;
  private final int height;

  /**
   * Creates a size with the given width and height. These must both be positive values.
   */
  public Size(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public int compareTo(Size o) {
    if (width < o.width) {
      return -1;
    } else if (width > o.width) {
      return 1;
    } else if (height < o.height) {
      return -1;
    } else if (height > o.height) {
      return 1;
    } else {
      return 0;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Size size = (Size) o;

    return width == size.width && height == size.height;
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  @Override
  public String toString() {
    return String.format("Size(width=%d, height=%d)", width, height);
  }
}
