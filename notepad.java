import java.awt.*;
import java.awt.event.*;
class notepad
{
Frame f;
TextArea ta;
public notepad()
{
f=new Frame("Notepad");
f.setLayout(null);
MenuBar mb=new MenuBar();
TextArea ta=new TextArea();
ta.setBounds(10,65,780,725);
f.setMenuBar(mb);

Menu fi=new Menu("File");
Menu ed=new Menu("Edit");
Menu fo=new Menu("Format");
Menu vi=new Menu("View");
Menu he=new Menu("Help");

mb.add(fi);
mb.add(ed);
mb.add(fo);
mb.add(vi);
mb.add(he);

MenuItem ne=new MenuItem("new");
MenuItem op=new MenuItem("open");
MenuItem sa=new MenuItem("save");
MenuItem sav=new MenuItem("save as..");
MenuItem hp=new MenuItem("-");
MenuItem hp1=new MenuItem("-");
MenuItem hp2=new MenuItem("-");
MenuItem hp3=new MenuItem("-");
MenuItem hp4=new MenuItem("-");
MenuItem hp5=new MenuItem("-");
MenuItem pa=new MenuItem("page setup");
MenuItem pr=new MenuItem("print");
MenuItem ex=new MenuItem("exit");

fi.add(ne);
fi.add(op);
fi.add(sa);
fi.add(sav);
fi.add(hp);
fi.add(pa);
fi.add(pr);
fi.add(hp1);
fi.add(ex);


MenuItem un=new MenuItem("undo");
MenuItem cu=new MenuItem("cut");
MenuItem co=new MenuItem("copy");
MenuItem pas=new MenuItem("paste");
MenuItem del=new MenuItem("delete");
MenuItem sea=new MenuItem("search with bing..");
MenuItem fin=new MenuItem("find");
MenuItem fine=new MenuItem("find next");
MenuItem rep=new MenuItem("replace");
MenuItem gt=new MenuItem("go to");
MenuItem sel=new MenuItem("select all");
MenuItem td=new MenuItem("time/date");

ed.add(un);
ed.add(hp2);
ed.add(cu);
ed.add(co);
ed.add(pas);
ed.add(del);
ed.add(hp3);
ed.add(sea);
ed.add(fin);
ed.add(fine);
ed.add(rep);
ed.add(gt);
ed.add(hp4);
ed.add(sel);
ed.add(td);

MenuItem ww=new MenuItem("word wrap");
MenuItem fon=new MenuItem("font");

fo.add(ww);
fo.add(fon);

Menu zo=new Menu("zoom");
MenuItem sb=new MenuItem("status bar");

vi.add(zo);
vi.add(sb);

MenuItem zoi=new MenuItem("Zoom in");
MenuItem zoo=new MenuItem("Zoom out");

zo.add(zoi);
zo.add(zoo);

MenuItem vh=new MenuItem("view help");
MenuItem an=new MenuItem("about notepad");

he.add(vh);
he.add(hp5);
he.add(an);

f.add(ta);
f.setSize(800,800);
f.setVisible(true);

f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
	System.exit(0);
}
});
}
public static void main(String args[])
{
notepad f=new notepad();
}
}