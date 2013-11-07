/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app.ejb;

import app.entity.Tesoro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tolkirlaptop
 */
@Stateless
public class TesoroFacade extends AbstractFacade<Tesoro> {
    @PersistenceContext(unitName = "proyecto9-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TesoroFacade() {
        super(Tesoro.class);
    }
    
}
