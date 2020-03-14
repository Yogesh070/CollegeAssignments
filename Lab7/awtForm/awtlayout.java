import java.awt.*;
class awtlayout extends Frame{
    awtlayout(){
        FormUI();
        MenuBar mb=new MenuBar();
        Menu fileMenu=new Menu("File");
        MenuItem i1=new MenuItem("New");
        MenuItem i2=new MenuItem("Open");
        Menu i3=new Menu("SaveAs");
        MenuItem Subitem1=new MenuItem("New");
        MenuItem Subitem2=new MenuItem("Old");
        setMenuBar(mb);
        mb.add(fileMenu);
        fileMenu.add(i1);
        fileMenu.add(i2);
        fileMenu.add(i3);
        i3.add(Subitem1);
        i3.add(Subitem2);
        //Edit menu
        Menu editMenu=new Menu("Edit");
        MenuItem cut=new MenuItem("Cut");
        MenuItem copy= new MenuItem("Copy");
        mb.add(editMenu);
        editMenu.add(cut);
        editMenu.add(copy);
        //window menu
        Menu windowMenu = new Menu("Window");
        mb.add(windowMenu);

        //creating form elements
        Label name=new Label("Name:");
        Label username=new Label("UserName:");
        Label biodata=new Label("Bio:");
        Label gender=new Label("Gender:");
        Label hobbies=new Label("Hobbies");
        Label selectcountry =new Label("Country");
        name.setBounds(100, 100, 50, 30);
        username.setBounds(100, 150, 70, 30);
        biodata.setBounds(100, 200, 50, 30);
        gender.setBounds(100, 420, 60, 30);
        hobbies.setBounds(100, 470, 60, 30);
        selectcountry.setBounds(100, 500, 50, 30);
        TextField inputname= new TextField();
        TextField inputusername= new TextField();
        TextArea bio=new TextArea();
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox genderOptionM=new Checkbox("Male",cbg,true);
        Checkbox genderOptionF=new Checkbox("Female",cbg,false);
        Checkbox Hobbies1=new Checkbox("Dancing");
        Checkbox Hobbies2=new Checkbox("Singing");
        List country=new List(3);
        country.add("Nepal");
        country.add("India");
        country.add("China");
        Button ok=new Button("OK");
        Button cancel=new Button("Cancel");
        inputname.setBounds(200, 100, 150,30);
        inputusername.setBounds(200, 170, 150,30);
        bio.setBounds(200, 230, 200, 150);
        genderOptionM.setBounds(200, 410, 50, 50);
        genderOptionF.setBounds(260, 410, 80, 50);
        Hobbies1.setBounds(200, 460, 80, 50);
        Hobbies2.setBounds(300, 460, 80, 50);
        country.setBounds(200, 500, 75, 75);
        ok.setBounds(150, 580, 50, 30);
        cancel.setBounds(250, 580, 50, 30);
        add(selectcountry);
        add(country);
        add(hobbies);
        add(Hobbies1);
        add(Hobbies2);
        add(genderOptionM);
        add(genderOptionF);
        add(gender);
        add(biodata);
        add(bio);
        add(name);
        add(username);
        add(inputname);
        add(inputusername);
        add(ok);
        add(cancel);


    }
    private void FormUI(){
        setLayout(null);
        setBounds(20,20,20,20);
        setTitle("Information Form");
        setVisible(true);
        setSize(500, 700);
    }
    public static void main(String[] args) {
        new awtlayout();
}
}
