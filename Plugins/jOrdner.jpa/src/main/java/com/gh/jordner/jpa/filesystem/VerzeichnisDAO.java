package com.gh.jordner.jpa.filesystem;

import java.sql.SQLException;

import com.gh.jordner.api.Verzeichnis;



public interface VerzeichnisDAO {

	public void save(Verzeichnis verzeichnis) throws SQLException;
	
	
}