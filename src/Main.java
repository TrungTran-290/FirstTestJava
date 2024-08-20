import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int sum_cal(){
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        Boolean flag = false;
        int NUM=0;
        while (!flag){
            try{
                System.out.printf("Nhap %s: ",NUM);
                value = scanner.nextInt();
                scanner.nextLine();
                flag = true;
            }catch(InputMismatchException e){
                System.out.println("Loi Dien");
                scanner.next();
                flag = false;
            }
        }
        System.out.println("YOur num: " + value);
    return value;
    }
    public static void Givename() {

//        System.out.printf("Hello World!");
        String name;
        int tuoi=0;
        double height;
        Scanner scanner = new Scanner (System.in);
        System.out.print("nhap ten cua ban: ");
        name = scanner.nextLine();
        Boolean flag = false;
        while (!flag){
            try {
                System.out.print("nhap tuoi cua ban pls: ");
                tuoi = scanner.nextInt();
                flag = true;
//                System.out.println("Tuoi?:" + tuoi);
            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Code Trash");
                scanner.nextLine();
                flag=false;
            }
        }

        System.out.println("nhap chieu cao cua ban:");
        height = scanner.nextDouble();
        System.out.println("Ten: " +name  +"\nTuoi: " + tuoi + "\nChieuCao: " + height );
        scanner.close();

        int a=2, b =3;
        System.out.println("Ep Kieu: "+ (float)a+b);
        System.out.println("Ep kieu2: " + (a-b));
        System.out.println("Ep kieu3: "+ a*b);
        System.out.println("EP kieu4:"+(float)(a/b));
        System.out.println("Epkieu5: "+(double)(a/b));
        System.out.println("Ep kieu6:"+a*1.0/b);
        System.out.println("Ep kieu7:"+ a/1.0*b);
    }
    public static String Timcunghd(){
        int day = 0 ;
        int month = 0;
        String cunghd = "";
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        while (!flag) {
            try {
                System.out.println("Nhap ngay ? ");
                day = scanner.nextInt();
                System.out.println("Nhap thang ? ");
                month = scanner.nextInt();
                flag = true;
            } catch (InputMismatchException e) {
                System.out.println("code sai dien");
            }
        }
        if (day>=22 && month == 12 || day <= 19 && month == 1){
            System.out.println("Capricorn");
            System.out.println("Biểu Tượng: Dê núi\n" +
                    "Nguyên Tố: Đất\n" +
                    "Tính Cách: Chăm chỉ, có tổ chức, tham vọng, có khả năng quản lý tốt.\n" +
                    "Điểm Mạnh: Có kế hoạch rõ ràng, kiên nhẫn, có khả năng làm việc chăm chỉ.\n" +
                    "Điểm Yếu: Có thể trở nên quá nghiêm khắc, thiếu sự linh hoạt, dễ cảm thấy áp lực.\n");
        }
        else if( day >=20 && month == 1 || day <=18 && month == 2){
            System.out.println("Aquarius");
            System.out.println("Biểu Tượng: Người mang nước\n" +
                    "Nguyên Tố: Khí\n" +
                    "Tính Cách: Sáng tạo, độc lập, có tư tưởng tiến bộ, quan tâm đến xã hội.\n" +
                    "Điểm Mạnh: Tư duy sáng tạo, nhân văn, có khả năng tư duy độc lập.\n" +
                    "Điểm Yếu: Có thể trở nên xa cách, khó gần, không dễ hòa nhập với cảm xúc của người khác.\n");
        }
        else if( day >=19 && month == 2 || day <=20 && month == 3){
            System.out.println("Pisces");
            System.out.println("Biểu Tượng: Hai con cá\n" +
                    "Nguyên Tố: Nước\n" +
                    "Tính Cách: Nhạy cảm, giàu trí tưởng tượng, dễ đồng cảm và cảm nhận sâu sắc.\n" +
                    "Điểm Mạnh: Thấu hiểu, sáng tạo, có khả năng giúp đỡ người khác.\n" +
                    "Điểm Yếu: Có thể trở nên mơ mộng, dễ bị tổn thương, thiếu quyết đoán.\n");
        }
        else if( day >=21 && month == 3 || day <=19 && month == 4){
            System.out.println("Aries");
            System.out.println("Biểu Tượng: Cừu\n" +
                    "Nguyên Tố: Lửa\n" +
                    "Tính Cách: Quyết đoán, năng động, nhiệt huyết, thích chinh phục thử thách.\n" +
                    "Điểm Mạnh: Dũng cảm, lãnh đạo tốt, sáng tạo.\n" +
                    "Điểm Yếu: Cấp bách, thiếu kiên nhẫn, dễ nóng giận.\n");
        }
        else if( day >=20 && month == 4 || day <=20 && month == 5){
            System.out.println("Taurus");
            System.out.println("Biểu Tượng: Bò\n" +
                    "Nguyên Tố: Đất\n" +
                    "Tính Cách: Kiên định, thực tế, yêu thích sự ổn định và an toàn.\n" +
                    "Điểm Mạnh: Tin cậy, chăm chỉ, có khả năng quản lý tài chính tốt.\n" +
                    "Điểm Yếu: Cứng đầu, đôi khi thiếu linh hoạt, có thể trở nên bảo thủ.\n");
        }
        else if( day >=21 && month == 5 || day <=20 && month == 6){
            System.out.println("Gemini");
            System.out.println("Biểu Tượng: Cặp song sinh\n" +
                    "Nguyên Tố: Khí\n" +
                    "Tính Cách: Thông minh, giao tiếp tốt, thích khám phá và học hỏi.\n" +
                    "Điểm Mạnh: Linh hoạt, sáng tạo, có khả năng thích nghi tốt.\n" +
                    "Điểm Yếu: Thiếu quyết đoán, có thể không nhất quán, dễ bị phân tâm.\n");
        }
        else if( day >=21 && month == 6 || day <=22 && month == 7){
            System.out.println("Cancer");
            System.out.println("Biểu Tượng: Cua\n" +
                    "Nguyên Tố: Nước\n" +
                    "Tính Cách: Nhạy cảm, quan tâm, bảo vệ gia đình và những người thân yêu.\n" +
                    "Điểm Mạnh: Tận tâm, cảm thông, có khả năng chăm sóc tốt.\n" +
                    "Điểm Yếu: Dễ bị tổn thương, quá nhạy cảm, có thể trở nên sống nội tâm.\n");
        }
        else if( day >=23 && month == 7 || day <=22 && month == 8){
            System.out.println("Leo");
            System.out.println("Biểu Tượng: Sư tử\n" +
                    "Nguyên Tố: Lửa\n" +
                    "Tính Cách: Tự tin, năng động, yêu thích sự chú ý và ngưỡng mộ.\n" +
                    "Điểm Mạnh: Lãnh đạo tốt, nhiệt tình, sáng tạo.\n" +
                    "Điểm Yếu: Kiêu ngạo, có thể trở nên quá tự phụ, yêu cầu sự chú ý quá mức.\n");
        }
        else if( day >=23 && month == 8 || day <=22 && month == 9){
            System.out.println("Virgo");
            System.out.println("Biểu Tượng: Xử nữ\n" +
                    "Nguyên Tố: Đất\n" +
                    "Tính Cách: Tỉ mỉ, tổ chức, phân tích, chú ý đến chi tiết.\n" +
                    "Điểm Mạnh: Chính xác, chăm chỉ, có khả năng giải quyết vấn đề tốt.\n" +
                    "Điểm Yếu: Cầu toàn, có thể trở nên quá nghiêm khắc với bản thân và người khác.\n");
        }
        else if( day >=23 && month == 9 || day <=22 && month == 10){
            System.out.println("Libra");
            System.out.println("Biểu Tượng: Cân\n" +
                    "Nguyên Tố: Khí\n" +
                    "Tính Cách: Tìm kiếm sự cân bằng, công bằng, hòa bình, có khả năng giao tiếp tốt.\n" +
                    "Điểm Mạnh: Thân thiện, khéo léo trong giao tiếp, có thể giải quyết xung đột.\n" +
                    "Điểm Yếu: Do dự, khó đưa ra quyết định, có thể trở nên phụ thuộc vào ý kiến của người khác.\n");
        }
        else if( day >=23 && month == 10 || day <=21 && month == 11){
            System.out.println("Scorpio");
            System.out.println("Biểu Tượng: Bọ cạp\n" +
                    "Nguyên Tố: Nước\n" +
                    "Tính Cách: Sâu sắc, mạnh mẽ, bí ẩn, có khả năng cảm nhận và hiểu biết sâu về cảm xúc.\n" +
                    "Điểm Mạnh: Quyết tâm, trung thành, có khả năng phục hồi tốt.\n" +
                    "Điểm Yếu: Ghen tuông, có thể trở nên quá nghi ngờ, khó mở lòng.\n");
        }
        else if( day >=22 && month == 11 || day <=21 && month == 12){
            System.out.println("Sagittarius");
            System.out.println("Biểu Tượng: Cung tên\n" +
                    "Nguyên Tố: Lửa\n" +
                    "Tính Cách: Thích phiêu lưu, tự do, có tinh thần lạc quan và yêu thích khám phá.\n" +
                    "Điểm Mạnh: Năng động, hào phóng, có tư duy mở rộng.\n" +
                    "Điểm Yếu: Thích mạo hiểm, có thể thiếu kiên nhẫn, không chú trọng đến chi tiết.\n");
        }
        return cunghd;
    }
//    public static void main(String arg[]){
////        Givename();
////        sum_cal();
//        Timcunghd();


//    }
};


