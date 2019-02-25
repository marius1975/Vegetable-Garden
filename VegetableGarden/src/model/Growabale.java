package model;

public interface Growabale {
    // Effects: feeds a plants with the specific nutrients
  void feed();

   // Effects: gives the plant as much water as it needs
  void water();

   //Effects: return the instructions for the plant
  String getInstructions();

  // harvest the plant when applicable
  void harvest();



}
