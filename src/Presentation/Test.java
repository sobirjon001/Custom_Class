package Presentation;

public class Test {
  public String title;
  public String description;
  public String reportTo;
  private static int count = 0;
  private static final String[] testers = {"Ruslan", "Livio", "Daniel"};

  public Test(String title, String description) {
    this.title = title;
    this.description = description;

    reportTo = testers[ (count < 2 ? 0 : count < 4 ? 1 : 2) ];

    if (count == 5) {
      count = 0;
    } else {
      count++;
    }
  }

  public String toString() {
    return "Title: " + title + "\n\tDescription: " + description + "\n\tReport to: " + reportTo;
  }
}
