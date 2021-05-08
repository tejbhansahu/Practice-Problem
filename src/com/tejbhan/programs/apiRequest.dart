import 'package:http/http.dart' as http;

class Services{
  final res = await http.get('http://www.example.com/api/get/1');
    print(res.body);
    try{
      if(200 == res.statusCode){
        final decoded = json.decode(response.body);
    	print(decoded["result"]);
      } else{
        print("Error");
      }
    } catch(e){
      print(e);
    }
}