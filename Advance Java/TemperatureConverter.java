interface Converter{
    double convert(double temperature);
}

class TemperatureConverter {
    public static void main(String[] args) {
        Converter celsius = new Converter(){
            public double convert(double temperature){
                //C = (°F − 32) ÷ 1.8.
                return (temperature-32)/1.8;
            }
        };

        Converter fahrenheit = new Converter(){
            public double convert(double temperature){
                // F = (9/5 × C) + 32
                return ((9*temperature)/5)+32;
            }
        };

        System.out.println("204 degree fahrenheit = " + celsius.convert(204) + " degree celsius");
        System.out.println("32 degree celsius = " + fahrenheit.convert(32) + " degree fahrenheit");
    }
}
