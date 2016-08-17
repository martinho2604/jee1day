package com.udshk.jee1day.data;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Singleton;

import com.udshk.jee1day.model.Memo;

@Singleton
public class MemoStore {

    private List<Memo> memos;

    public MemoStore() {
        super();
        memos = new LinkedList<Memo>();
    }

    public List<Memo> findAll() {
        return memos;
    }

    public void persist(Memo memo) {
        memos.add(memo);
    }

    public void removeAll() {
        memos.clear();
    }
}
