package generics;

public class GetId {
    public static void main(String[] args) {
        GenericExample<GenericChildClass> genericExample = new GenericExample<>();
        genericExample.element = new GenericChildClass();
        System.out.println(genericExample.element.isEnabled());
        System.out.println(genericExample.element.printMyName());


//        Integer[] integers = {1, 2, 4, 0, 5, 6};
//        for (Integer i :
//                integers) {
//            System.out.print(i);
//        }
//        System.out.println();
//
//        System.out.println( "Thread id: "+Thread.currentThread().getId());
//        Arrays.sort(integers, Integer::compare);
//        System.out.println( "Thread id: "+Thread.currentThread().getId());
//
//        for (Integer i :
//                integers) {
//            System.out.print(i);
//        }
//        System.out.println();
    }

    static class Node {
        Object data;
        Node next;
    }

//    private static void demo() {
//        BrokerageAccount brokerageAccount = new BrokerageAccount();
//        brokerageAccount.setBrokerageId(Long.parseLong("135"));
//        AccountPLusBrokerageAccount one = new AccountPLusBrokerageAccount(new Account(), new BrokerageAccount(), Type.TypeOne);
//        AccountPLusBrokerageAccount two = new AccountPLusBrokerageAccount(new Account(), new BrokerageAccount(), Type.TypeTwo);
//        AccountPLusBrokerageAccount three = new AccountPLusBrokerageAccount(new Account(), brokerageAccount, Type.TypeThree);
//        AccountPLusBrokerageAccount four = new AccountPLusBrokerageAccount(new Account(), new BrokerageAccount(), Type.TypeFour);
//        AccountPLusBrokerageAccount five = new AccountPLusBrokerageAccount(new Account(), new BrokerageAccount(), Type.TypeFour);
//        List<AccountPLusBrokerageAccount> list = List.of(one, two, three, four, five);
//
//        Optional<Long> aLong = list.stream()
//                .filter(apba -> apba.getType().equals(Type.TypeThree))
//                .map(AccountPLusBrokerageAccount::getBrokerageAccount)
//                .map(BrokerageAccount::getBrokerageId)
//                .findAny();
//
//        if (aLong.isPresent()) {
//            System.out.println(aLong.get());
//        } else {
//            System.out.println("not present");
//        }
//    }
}
