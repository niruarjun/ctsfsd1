package com.myCompany.HibOnetoOneBiDirectional;

import java.io.IOException;
import java.util.List;

public interface Service {
	public Album create(Album album2) throws IOException;
	public List<Album> getAllPersons();
	public Album getPersonByid(Integer id);
	public Album updateAlbum(Integer id) throws IOException;
	public void deleteAlbum(Integer id);


}
