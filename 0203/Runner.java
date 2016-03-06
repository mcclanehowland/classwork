public class Runner {
    public static void main(String[] args) {
        Profile[] profiles = new Profile[5];
        profiles[0] = new Profile("John");
        profiles[1] = new Profile("Kate");
        profiles[2] = new Profile("jack");
        profiles[3] = new Profile("Doggo");
        profiles[4] = new Profile("Johnny");
        for(int i = 0; i < profiles.length;i++) {
            int swap = (int)(Math.random()*profiles.length);
            Profile temp = profiles[i];
            profiles[i] = profiles[swap];
            profiles[swap] = temp;
        }
        for(Profile each : profiles) {
            System.out.print(each.getName()+" ");
            
        }
        System.out.println();
    }
}
