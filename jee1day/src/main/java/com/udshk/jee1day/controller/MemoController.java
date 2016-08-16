package com.udshk.jee1day.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

import com.udshk.jee1day.model.Memo;
import com.udshk.jee1day.service.MemoServiceBean;

@SessionScoped
@ManagedBean(name = "memoController")
public class MemoController {
	private Memo memo;

    private MemoServiceBean memoService;

    public MemoController() {
        memo = new Memo();
    }

    public Memo getMemo() {
        return memo;
    }

    public void setMemo(Memo memo) {
        this.memo = memo;
    }

    public void doAdd(ActionEvent event) {
        memoService.addMemo(memo);
        memo.setDescription("");
    }

    public void doReset(ActionEvent event) {
        memoService.resetMemos();
    }

    public List<Memo> getMemos() {
        return memoService.getAllMemos();
    }
}
