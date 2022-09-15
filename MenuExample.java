import javax.swing.*;    
import java.awt.event.*;    

public class MenuExample implements ActionListener
{    
JFrame f;    
JMenuBar mb;    
JMenu insert,delete,update,search;    
JMenuItem in,de,up,se;     
public MenuExample()
{    
f=new JFrame();    
in=new JMenuItem("insert the data");    
de=new JMenuItem("delete the data");    
up=new JMenuItem("update the data");    
se=new JMenuItem("search the data");    
in.addActionListener(this);    
de.addActionListener(this);    
up.addActionListener(this);    
se.addActionListener(this);    
mb=new JMenuBar();    
insert=new JMenu("Insert");    
delete=new JMenu("Delete");    
update=new JMenu("Update");    
search=new JMenu("Search");     
insert.add(in);
delete.add(de);
update.add(up);
search.add(se);    
mb.add(insert);
mb.add(delete);
mb.add(update);    
mb.add(search);    
f.add(mb);
f.setJMenuBar(mb);  
f.setLayout(null);    
f.setSize(600,600);    
f.setVisible(true);    
}     

public void actionPerformed(ActionEvent e)
{    
if(e.getSource()==in)    
{
insert ins=new insert();
f.setVisible(false);
}    
if(e.getSource()==de)    
{
delete del=new delete();
f.setVisible(false);
}
if(e.getSource()==update)    
{
update upd=new update();
f.setVisible(false);
}    
if(e.getSource()==search)    
{
search sea=new search();
f.setVisible(false);
}
}     
public static void main(String[] args) 
{    
MenuExample m=new MenuExample();    
}    
} 