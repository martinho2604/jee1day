package com.udshk.jee1day.service;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.udshk.jee1day.data.MemoStore;
import com.udshk.jee1day.model.Memo;

@Stateless
public class MemoServiceBean {

	@EJB
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
