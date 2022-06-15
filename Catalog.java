// Student: Natalia Reeck Zanini

import java.util.ArrayList;

public class Catalog
{
String catalog_name;
ArrayList<Item> list;
Catalog(String cs_Gift_Catalog) {

list=new ArrayList<>();
catalog_name=cs_Gift_Catalog;
}

String getName() {



return catalog_name;}

int size() {

return list.size();

}

Item get(int i) {


return list.get(i);
}

void add(Item item) {
list.add(item);
}
}