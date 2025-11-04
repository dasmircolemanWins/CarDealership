package com.pluralsight;

public class UserinterfaceInClass {

    private Dealership dealership;

    public UserinterfaceInClass(){}

    public void dispaly(){
        this.init();





        
    }



    public void processGetByPriceRequest(){

    }

    public void processGetByMakeModelRequest(){

    }

    public void processGetByYearRequest(){

    }

    public void processGetByColorRequest(){

    }

    public void processGetByMileageRequest(){

    }

    public void processGetVehicleType(){

    }

    public void processGetAllVehiclesRequest(){

    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){

    }

    private void init(){
        DealershipFileManager theDealershipFileManager = new DealershipFileManager();
        this.dealership = DealershipFileManager.getDealership();
    }

    private void displayVehicles(){

    }
}
