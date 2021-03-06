/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listadencadeada;

import java.util.Iterator;

public class IteratorReverso<Tipo> implements Iterator<Tipo>{

    private No<Tipo> no;

    public IteratorReverso(No<Tipo> no) {
        this.no = no;
    }

    @Override
    public boolean hasNext() {
        return (this.no != null);
    }

    @Override
    public Tipo next() {
        Tipo a = null;
        if (this.hasNext()) {
            a = this.no.getElemento();
            this.no = this.no.getAnterior();
        }
        return a;
    }

}
