package net.anotheria.anosite.photoserver.service.storage.persistence.album;

/**
 * Exception indicating that album was not found in persistence when trying to
 * operate with it by specifying explicit ID.
 * @author dzhmud
 */
public class AlbumNotFoundPersistenceServiceException extends AlbumPersistenceServiceException {

	/**
	 * Basic serialVersionUID variable.
	 */
	private static final long serialVersionUID = -2678571420356902497L;

	/**
	 * Default constructor.
	 */
	protected AlbumNotFoundPersistenceServiceException(long albumId) {
		super("Album["+albumId+"] was not found.");
	}

}
