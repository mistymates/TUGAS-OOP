package repository; 

import model.Prodi;

public class ProdiTbl{
    private Database db;

    public ProdiTbl(Database db) {
        this.db = db;
    }

    public Prodi getProdiById(String id) {
        for(int i = 0; i < db.tables.dataProdi.size(); i++) {
            if(db.tables.dataProdi.get(i).getIdProdi().equals(id)) {
                return db.tables.dataProdi.get(i);
            }
        }
        return null;
    }

    public void create(Prodi prodi) {
        db.tables.dataProdi.add(prodi);
        db.commit();
    }

    public void delete(String id) {
        for(int i = 0; i < db.tables.dataProdi.size(); i++) {
            if(db.tables.dataProdi.get(i).getIdProdi().equals(id)) {
                db.tables.dataProdi.remove(i);
                break;
            }
        }
        db.commit();
    }



    


}