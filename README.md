# BasicsJava  concepts of using Lambda

The below code shows the steps to use Lambda function

Strategy Pattern

        
        public interface ApplePredicate {
            boolean test(Apple apple);
        }
        
        
        public class AppleGreenPredicate implements ApplePredicate {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equalsIgnoreCase("Green");
            }
        }

        
        public class AppleHeavyWeightPredicate implements ApplePredicate {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 100;
            }
        }

         public static List<Apple> filterApple(List<Apple> apples, ApplePredicate applePredicate) {
                List<Apple> result = new ArrayList<>();
                for (Apple apple : apples) {
                    if (applePredicate.test(apple)) {
                        result.add(apple);
                    }
                }
                return result;
          }
          
        /*
        To get Green Apples, List is populated with Apples
        */
        List<Apple> apples = AppleUtil.populateApples();
        
        List<Apple> greenApple = AppleUtil.filterApple(apples, new AppleGreenPredicate());
        System.out.println(greenApple);
        
        //Same using Lambda Function
        List<Apple> lambdaGreenApple = AppleUtil.filterApple(apples, (Apple a) -> a.getColor().equalsIgnoreCase("green"));
        System.out.println(lambdaGreenApple);
        
        //using streams
        List<Apple> greenApplesUsingStreams = apples.stream().filter(a -> a.getColor().equalsIgnoreCase("green")).collect(Collectors.toList());
        System.out.println(greenApplesUsingStreams);
        
# use of Lambda with Comparator
        
        List<Apple> apples = AppleUtil.populateApples();
        //Sort Apples based on Color
        
        //Use Of Lambda, Comparator compare interface takes 2 arguments
        apples.sort((a1, a2) -> a1.getColor().compareTo(a2.getColor()));
        System.out.println(apples);
        //[Apple(color=Green, weight=10), Apple(color=Orange, weight=30), Apple(color=Red, weight=20), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]
        
        apples = AppleUtil.populateApples();
        System.out.println("With ordering" + apples);
        //With ordering[Apple(color=Green, weight=10), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]
        //Use Of method references
        
        apples.sort(Comparator.comparing(Apple::getColor));
        System.out.println(apples);
        //[Apple(color=Green, weight=10), Apple(color=Orange, weight=30), Apple(color=Red, weight=20), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]
        
        apples = AppleUtil.populateApples();
        System.out.println("With ordering" + apples);
        //With ordering[Apple(color=Green, weight=10), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]
        
        //To reverse
        apples.sort(Comparator.comparing(Apple::getColor).reversed());
        System.out.println(apples);
        //[Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Green, weight=10)]
        
        //First Compare with color reverse it and then compare with size
        apples = AppleUtil.populateApples();
        System.out.println("With ordering" + apples);
        //With ordering[Apple(color=Green, weight=10), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]
        
        apples.sort(Comparator.comparing(Apple::getColor).reversed().thenComparing(Apple::getWeight));
        System.out.println(apples);
        //[Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=50), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Green, weight=10)]
        
        apples = AppleUtil.populateApples();
        System.out.println("With ordering" + apples);
        //With ordering[Apple(color=Green, weight=10), Apple(color=Red, weight=20), Apple(color=Orange, weight=30), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30), Apple(color=Yellow, weight=50)]
        
        
        apples.sort(Comparator.comparing(Apple::getColor).reversed().thenComparing(Apple::getWeight).reversed());
        System.out.println(apples);
        //[Apple(color=Green, weight=10), Apple(color=Orange, weight=30), Apple(color=Red, weight=20), Apple(color=Yellow, weight=50), Apple(color=Yellow, weight=40), Apple(color=Yellow, weight=30)]