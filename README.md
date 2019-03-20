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
          
          to get green apples.
          
          List<Apple> applesWhichAreGreen = filterApple(apples,