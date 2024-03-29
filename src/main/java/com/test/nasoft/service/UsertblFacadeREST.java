

package com.test.nasoft.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import persistence.Usertbl;

/**
 *
 * @author Luis Alfredo Moctezu
 */
@Stateless
@Path("persistence.usertbl")
public class UsertblFacadeREST extends AbstractFacade<Usertbl> {
    @PersistenceContext(unitName = "com_test-nasoft_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public UsertblFacadeREST() {
        super(Usertbl.class);
    }

    @POST
    @Override
    @Consumes({"application/json"})
    public void create(Usertbl entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/json"})
    public void edit(@PathParam("id") Integer id, Usertbl entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/json"})
    public Usertbl find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/json"})
    public List<Usertbl> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/json"})
    public List<Usertbl> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
