package com.udshk.jee1day.service;

import java.util.Date;
import java.util.List;

import com.udshk.jee1day.data.MemoStore;
import com.udshk.jee1day.model.Memo;

public class MemoServiceBean {

    private MemoStore memoStore;

    public List<Memo> getAllMemos() {
        return memoStore.findAll();
    }

    public void addMemo(Memo memo) {
        Memo newMemo = new Memo();
        newMemo.setDescription(memo.getDescription());
        newMemo.setCreated(new Date());
        memoStore.persist(newMemo);
    }

    public void resetMemos() {
        memoStore.removeAll();
    }
}
