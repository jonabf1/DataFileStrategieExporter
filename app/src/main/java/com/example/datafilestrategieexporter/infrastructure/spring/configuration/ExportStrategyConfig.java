
package com.example.datafilestrategieexporter.infrastructure.spring.configuration;

import com.example.datafilestrategieexporter.adapters.export.CsvExportStrategy;
import com.example.datafilestrategieexporter.adapters.export.ExcelExportStrategy;
import com.example.datafilestrategieexporter.domain.enums.ExportType;
import com.example.datafilestrategieexporter.domain.interfaces.IExport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.EnumMap;
import java.util.Map;

@Configuration
public class ExportStrategyConfig {

    @Bean
    public Map<ExportType, IExport> exportStrategies(ExcelExportStrategy excelExportStrategy, CsvExportStrategy csvExportStrategy) {
        Map<ExportType, IExport> strategies = new EnumMap<>(ExportType.class);
        strategies.put(ExportType.EXCEL, excelExportStrategy);
        strategies.put(ExportType.CSV, csvExportStrategy);
        return strategies;
    }
}
