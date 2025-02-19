package bits.current_savings_service.api;

import bits.current_savings_service.common.utils.AppUtils;
import bits.current_savings_service.common.utils.ResponseUtils;
import bits.current_savings_service.domain.common.ApiResponse;
import bits.current_savings_service.domain.entity.PhysicalOfficeInfo;
import bits.current_savings_service.domain.enums.ResponseMessage;
import bits.current_savings_service.domain.response.GroupInfoResponse;
import bits.current_savings_service.domain.response.PaginationResponse;
import bits.current_savings_service.service.IPhysicalOfficeInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping(AppUtils.BASE_URL + "/physical-office")
public class PhysicalOfficeController extends  BaseResource{

    private final IPhysicalOfficeInfoService iphysicalOfficeInfoService;

//    @GetMapping()
//    public ApiResponse<List<PhysicalOfficeInfo>> getAllPhysicalOffice(){
//        List<PhysicalOfficeInfo> physicalOfficeInfos = iphysicalOfficeInfoService.getAllPhysicalOffice();
//        return ResponseUtils.createResponseObject(getMessage(ResponseMessage.OPERATION_SUCCESSFUL), physicalOfficeInfos);
//
//    }

    @GetMapping()
    public ResponseEntity<?> getAllGroupInfos(
            @RequestParam(required = false, defaultValue = "0") Integer pageNumber,
            @RequestParam(required = false, defaultValue = "10") Integer pageSize,
            @RequestParam(required = false, defaultValue = "id") String sortBy,
            @RequestParam(required = false, defaultValue = "desc") String sortOrder) {

        PaginationResponse<PhysicalOfficeInfo> physicalOfficeInfos = iphysicalOfficeInfoService.getAllOfficeInfos(pageNumber, pageSize, sortBy, sortOrder);
        if(Objects.isNull(physicalOfficeInfos)){
            ResponseEntity.noContent();
        }
        return ResponseEntity.ok(physicalOfficeInfos);
//        logger.error("Group Info: " + groupInfo.toString());

    }
}
