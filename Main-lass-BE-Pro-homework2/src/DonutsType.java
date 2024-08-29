public enum DonutsType {
    CLASSIC( "made from fluffy, yeast-raised dough that is deep-fried until golden brown",10,60,30),
    AMERICAIN("American doughnuts are often coated with sugar or glazed with different flavors such as chocolate, vanilla, or maple. ",13,57,30),
    FRENCH("Unlike American doughnuts, beignets are typically square or rectangular rather than ring-shaped",11,40,49),
    MOCHI("a type of doughnut that combines the chewy texture of Japanese mochi (sweet rice flour dough) with the classic shape of a doughnut.",17,23,60),

    BRIOCHE("a type of doughnut made from brioche dough, which is rich, buttery, and slightly sweet.",20,40,40);

    private String description;

    private int sugar;
    private int flour;
    private int water;


    DonutsType(String description, int sugar, int flour, int water) {
        this.description = description;
        this.sugar = sugar;
        this.flour = flour;
        this.water = water;
    }
}
