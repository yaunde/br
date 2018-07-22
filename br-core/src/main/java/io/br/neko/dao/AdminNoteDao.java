package io.br.neko.dao;

import io.br.neko.demain.NotePager;

import java.util.List;

public interface AdminNoteDao {

	public List getAllNotes();

	public boolean deleteNote(int[] i);

	public NotePager getNotePager(int index, int pageSize);
}
