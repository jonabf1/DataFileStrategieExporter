
package com.example.datafilestrategieexporter.usecases;

import com.example.datafilestrategieexporter.domain.entities.ExportData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExportDataUseCaseImpl implements ExportDataUseCase {

    @Override
    public List<ExportData> prepareExportData() {
        // Simulando a preparação dos dados para exportação
        List<ExportData> dataList = new ArrayList<>();
        dataList.add(new ExportData(1, "John Doe", 25, null));
        dataList.add(new ExportData(2, "Jane Smith", 30, null));
        dataList.add(new ExportData(3, "Peter Johnson", 28, null));
        return dataList;
    }
}
    