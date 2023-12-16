package daoFactory;

import daoImplimentation.DaoImpJdbc;
import daoInterface.DaoIntf;

public class DaoFactory {
	
	public static DaoIntf getDaoImpl() {
		return new DaoImpJdbc();
	}
	
}